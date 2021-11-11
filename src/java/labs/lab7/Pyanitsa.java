package java.labs.lab7;

import javax.swing.*;
import java.util.Scanner;

public class Pyanitsa {

    private IPlayer p1 = new StackPlayer();
    private IPlayer p2 = new QueuePlayer();
    private int moves = 1;
    Window w;
    public void play() {

        w = new Window(this);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            if(i < 5) p1.deck_add(sc.nextInt());
            else p2.deck_add(sc.nextInt());
        }
        w.setPCardsText(Integer.toString(5), Integer.toString(5));
        w.setCards("-","-", 0);
        w.setVisible(true);
        p1.deck_is_empty();
        p2.deck_is_empty();
    }

    public void make_move(){

        int c1, c2, winner = 0;
        c1 = p1.deck_pop();
        c2 = p2.deck_pop();
        w.setPCardsText(Integer.toString(p1.get_deck_size()), Integer.toString(p2.get_deck_size()));

        
        if(c1 == 0 && c2 == 9 || (c1 > c2 && !(c2 == 0 && c1 == 9))){
            p1.deck_add(c1);
            p1.deck_add(c2);
            winner = 1;
        }
        else{
            p2.deck_add(c1);
            p2.deck_add(c2);
            winner = 2;
        }
        w.setCards(Integer.toString(c1), Integer.toString(c2), winner);

        w.swapVisibility();
    }
    public int move_made(){
        w.swapVisibility();
        w.setPCardsText(Integer.toString(p1.get_deck_size()), Integer.toString(p2.get_deck_size()));
        w.setCards("-","-", 0);
        if(moves >= 106){
            w.setCards("botva","Move: "+moves,0);
            w.end();
            return 0;
        }
        if(p1.deck_is_empty()){
            w.setCards("SECOND WON","Move: "+moves,2);
            w.end();
            return 0;
        }
        if(p2.deck_is_empty()) {
            w.setCards("FIRST WON","Move: "+moves,1);
            w.end();
            return 0;
        }
        moves++;
        w.setMoves(Integer.toString(moves));
        return -1;
    }

    public void auto(){
        make_move();
        int a = move_made();
        if (a == -1) auto();
    }
}

package java.labs.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends JFrame {
    JButton popCards = new JButton("Выложить карты");
    JButton hideCards = new JButton("Убрать карты");
    JTextArea p1Cards = new JTextArea(10, 20);
    JTextArea p2Cards = new JTextArea(10, 20);
    JTextArea moves = new JTextArea(10, 20);
    JTextArea cards = new JTextArea(10, 20);

    public Window(Pyanitsa game){
        super("Window");
        setSize(1000,400);
        setLayout(new FlowLayout());
        add(popCards);
        add(hideCards);
        add(p1Cards);
        add(p2Cards);
        add(moves);
        add(cards);
        moves.setText("1");
        hideCards.setVisible(false);
        p1Cards.setForeground(Color.RED);
        p2Cards.setForeground(Color.BLUE);

        popCards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.make_move();
            }
        });

        hideCards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.move_made();
            }
        });

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closed");
                e.getWindow().dispose();
            }
        });

    }

    public void setPCardsText(String p1Cards, String p2Cards) {
        this.p1Cards.setText(p1Cards);
        this.p2Cards.setText(p2Cards);
    }

    public void setCards(String p1Card, String p2Card, int winner){
        this.cards.setText(p1Card + " x " + p2Card);
        if(winner == 1) this.cards.setForeground(Color.red);
        if(winner == 2) this.cards.setForeground(Color.blue);
    }

    public void swapVisibility(){
        if(popCards.isVisible()){
            popCards.setVisible(false);
            hideCards.setVisible(true);
        }
        else {
            popCards.setVisible(true);
            hideCards.setVisible(false);
        }
    }

    public void setMoves(String moves){
        this.moves.setText(moves);
    }

    public void end(){
        popCards.setEnabled(false);
        hideCards.setEnabled(false);
    }
}

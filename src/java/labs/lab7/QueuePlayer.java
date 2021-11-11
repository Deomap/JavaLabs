package java.labs.lab7;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePlayer implements IPlayer {
    private Queue<Integer>
            deck = new LinkedList<>();

    public int deck_pop(){
        return deck.poll();
    }

    public void deck_add(int card){
        deck.add(card);
    }

    public boolean deck_is_empty(){
        return deck.isEmpty();
    }

    public int get_deck_size(){
        return deck.size();
    }
}

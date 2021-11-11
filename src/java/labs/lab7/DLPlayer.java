package java.labs.lab7;

import java.util.ArrayList;
import java.util.List;

public class DLPlayer implements IPlayer {
    private List<Integer>
                    deck = new ArrayList<>(),
                    d2 = new ArrayList<>();

    public int deck_pop(){
        int card = deck.get(0);
        deck.remove(0);
        return card;
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

package java.labs.lab7;

import java.util.Stack;

public class StackPlayer implements IPlayer {
    private Stack<Integer>
            deck = new Stack<>(),
            deferred = new Stack<>();

    public int deck_pop(){
        return deck.pop();
    }

    public void deck_add(int card){
        deferred.push(card);
    }

    public boolean deck_is_empty(){
        if(deck.isEmpty()) {
            while(!deferred.isEmpty()){
                deck.push(deferred.pop());
            }
        }
        return deck.isEmpty();
    }

    public int get_deck_size(){
        return deck.size() + deferred.size();
    }
}

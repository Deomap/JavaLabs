package java.labs.lab6;

import java.util.Comparator;

public class Student {
    int score;

    public Student(int score){
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public String toString(){
        return Integer.toString(this.score);
    }
}

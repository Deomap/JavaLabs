package java.labs.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Match extends JFrame {

    JButton firstBtn = new JButton("AC Milan");
    JButton secondBtn = new JButton("Real Madrid");
    JTextArea result = new JTextArea(10, 20);
    JTextArea lastScorer = new JTextArea(10, 20);
    JTextArea winner = new JTextArea(10, 20);
    int firstScore = 0, secondScore = 0;

    public Match() {
        super("Match");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(firstBtn);
        add(secondBtn);
        add(result);
        add(lastScorer);
        add(winner);
        result.setText("0 X 0");
        lastScorer.setText("Last scorer: N/A");
        result.setText("Winner: DRAW");

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closed");
                e.getWindow().dispose();
            }
        });

        firstBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(++firstScore + " X " + secondScore);
                lastScorer.setText("Last scorer: AC Milan");
                winner.setText(firstScore > secondScore ? "Winner: AC Milan"
                        : firstScore == secondScore ? "Winner: DRAW" : "Winner: Real Madrid");
            }
        });
        secondBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(firstScore + " X " + ++secondScore);
                lastScorer.setText("Last scorer: Real Madrid");
                winner.setText(firstScore > secondScore ? "Winner: AC Milan"
                        : firstScore == secondScore ? "Winner: DRAW" : "Winner: Real Madrid");
            }
        });
    }


    public static void main(String[] args) {
        new Match().setVisible(true);
    }
}

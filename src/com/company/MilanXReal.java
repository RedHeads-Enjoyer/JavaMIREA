package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanXReal extends JFrame {

    private int milanScore = 0;
    private int realScore = 0;
    private Timer timer;

    JButton milanBtn = new JButton("AC Milan");
    JButton realBtn = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel time = new JLabel("Time: 10");
    Label winner = new Label("Winner: DRAW");

    public MilanXReal() {
        super("Milan X Real");
        setLayout(new FlowLayout());
        setSize(400, 400);

        timer = new Timer(1000, new ActionListener() { // Таймер на 10 секунд игры, после завершения - оповещение и блокировка кнопок
            int sec = 10;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sec == 0) {
                    JOptionPane.showMessageDialog(null, "Time is over","Alert",JOptionPane.INFORMATION_MESSAGE);
                    timer.stop();
                    if (milanScore > realScore) winner.setText("Winner: AC Milan");
                    else if (milanScore < realScore) winner.setText("Winner: Real Madrid");
                    else winner.setText("Winner: DRAW");
                    milanBtn.setEnabled(false);
                    realBtn.setEnabled(false);
                }
                else {
                    sec -= 1;
                    time.setText("Time: " + String.valueOf(sec));
                }
            }
        });

        milanBtn.addActionListener(new ActionListener() { // Увеличение счета для AC Milan
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore += 1;
                result.setText("Result: " + milanScore + " X " + realScore);
                last.setText("Last Scorer: AC Milan");
            }
        });

        realBtn.addActionListener(new ActionListener() { // Увеличение счета для Real Madrid
            @Override
            public void actionPerformed(ActionEvent e) {
                realScore += 1;
                result.setText("Result: " + milanScore + " X " + realScore);
                last.setText("Last Scorer: Real Madrid");
            }
        });

        add(milanBtn);
        add(realBtn);
        add(result);
        add(last);
        add(time);
        add(winner);
        timer.start();
        setVisible(true);
    }
}

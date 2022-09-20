package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Anime extends JFrame {
    private Timer timer;
    String filename;

    public Anime() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon[] imageIcons = new ImageIcon[105];

        for (int i = 0; i < 105; i++) {
            filename = "frame_" + new DecimalFormat( "000" ).format(i) + "_delay-0.08s.jpg";
            imageIcons[i] = new ImageIcon(filename);
        }

        timer = new Timer(80, new ActionListener() {
            int framePosition = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (framePosition % 10 == 0) frame.setTitle("༼ つ ◕_◕ ༽つ");
                else if (framePosition % 10 == 5) frame.setTitle("(っ˘ڡ˘ς) вкусно поел");
                label.setIcon(imageIcons[framePosition % 105]);
                framePosition++;
            }
        });

        frame.setSize(640, 360);
        frame.add(label);
        timer.start();
        frame.setVisible(true);
    }
}


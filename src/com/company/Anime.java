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

        frame.setTitle("༼ つ ◕_◕ ༽つ");
        frame.setTitle("(っ˘ڡ˘ς) вкусно поел");



        timer = new Timer(40, new ActionListener() {
            int framePosition = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (framePosition % 10 == 0) frame.setTitle("༼ つ ◕_◕ ༽つ");
                else if (framePosition % 10 == 5) frame.setTitle("(っ˘ڡ˘ς) вкусно поел");
                filename = "frame_" + new DecimalFormat( "000" ).format(framePosition % 105) + "_delay-0.08s.gif";
                ImageIcon image = new ImageIcon(filename);
                label.setIcon(image);
                framePosition++;
            }
        });

        frame.setSize(640, 360);
        frame.add(label);
        timer.start();
        frame.setVisible(true);
    }
}


package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface IDocument {
    public default JFrame document() {
        JFrame jFrame = new JFrame();
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu inew = new JMenu("New");
        JMenu iopen = new JMenu("Open");

        JMenuItem isave = new JMenuItem("Save");
        JMenuItem iexit = new JMenuItem("Exit");

        JMenuItem nmusic = new JMenuItem("mp3");
        JMenuItem nimage = new JMenuItem("PNG");
        JMenuItem ntext = new JMenuItem("text");
        JMenuItem omusic = new JMenuItem("mp3");
        JMenuItem oimage = new JMenuItem("PNG");
        JMenuItem otext = new JMenuItem("text");

        file.add(inew);
        file.add(iopen);
        file.add(isave);
        file.add(iexit);

        // Вкладка New
        inew.add(nmusic);
        inew.add(nimage);
        inew.add(ntext);

        // Вкладка Open
        iopen.add(omusic);
        iopen.add(oimage);
        iopen.add(otext);

        // Создание / открытие текстового документа
        ntext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                ((TextDocument) new CreateTextDocument().CreateNew()).document1();
            }
        });
        otext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                ((TextDocument) new CreateTextDocument().CreateNew()).document1();
            }
        });

        // Создание / открытие изображееия
        nimage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                ((ImageDocument) new CreateImageDocument().CreateNew()).document1();
            }
        });
        oimage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                ((ImageDocument) new CreateImageDocument().CreateNew()).document1();
            }
        });

        // Выход
        iexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });

        // Созранение
        isave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saved!","Save",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        jMenuBar.add(file);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        return jFrame;
    }
}

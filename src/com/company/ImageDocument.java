package com.company;

import javax.swing.*;

public class ImageDocument implements IDocument {
    public void document1() {
        JFrame jFrame = (IDocument.super.document());
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("img.png");
        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }
}

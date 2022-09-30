package com.company;

import javax.swing.*;
import java.awt.*;

public class TextDocument extends JFrame implements IDocument{

    public void document1() {
        JFrame jFrame = (IDocument.super.document());
        JTextField jTextField = new JTextField();
        jFrame.add(jTextField);
        jFrame.setVisible(true);
    }
}

package work32;


import javax.swing.*;
import java.awt.*;

public class Element {
    public static JButton customButton(String title, int width, int height){
        JButton newButton = new JButton();
        newButton.setSize(width,height);
        newButton.setText(title);
        newButton.setBackground(Color.decode("#D9D9D9"));
        newButton.setFocusPainted(false);
        newButton.setFont(new Font("Inter", 0, 12));
        return  newButton;
    }

    public static JLabel customJlabel(String title, int fontSize, int width, int height){
        JLabel newJlabel = new JLabel(title);
        newJlabel.setSize(width, height);
        newJlabel.setFont(new Font("Inter",0, fontSize));
        newJlabel.setOpaque(true);
        return newJlabel;
    }

    public static JLabel customError(String title, int width, int height){
        JLabel newJlabel = new JLabel(title);
        newJlabel.setSize(width, height);
        newJlabel.setFont(new Font("Inter",0, 12));
        newJlabel.setBackground(Color.decode("#D9D9D9"));
        newJlabel.setForeground(Color.red);
        newJlabel.setOpaque(true);
        return newJlabel;
    }

    public static JTextField customJTextField(){
        JTextField newJTextField = new JTextField();
        newJTextField.setSize(160,20);
        newJTextField.setBackground(Color.decode("#D9D9D9"));
        newJTextField.setFont(new Font("Inter",0,12));
        newJTextField.setMargin(new Insets(0,10,0,10));
        return newJTextField;
    }


    public static JTextArea customJTextArea(int width, int height){
        JTextArea newJTextArea = new JTextArea();
        newJTextArea.setSize(width,height);
        newJTextArea.setBackground(Color.decode("#D9D9D9"));
        newJTextArea.setFont(new Font("Inter",0,14));
        newJTextArea.setForeground(Color.black);
        newJTextArea.setMargin(new Insets(0,10,0,10));
        return newJTextArea;
    }
}

package src;

import javax.swing.*;

class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        JButton button1 = new JButton("Button");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
package Homework.Fourth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new MyWindow();
    }

    static class MyWindow extends JFrame {
        public MyWindow(){
            setTitle("chat");
            setBounds(500,500,300,300);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(null);
            JButton buttonSend = new JButton("send");
            buttonSend.setBounds(160, 220, 120, 32);
            add(buttonSend);
            JTextField fieldForMsg = new JTextField();
            fieldForMsg.setBounds(10, 220, 145, 32);
            add(fieldForMsg);
            fieldForMsg.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(fieldForMsg.getText());

                }
            });
            setResizable(false);
            setVisible(true);
        }
    }
}



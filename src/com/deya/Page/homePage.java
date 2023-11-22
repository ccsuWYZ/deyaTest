package com.deya.Page;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author lee
 * @date 2023-11-22 14:52:33
 * @description
 */
public class homePage extends JFrame{

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPanel jpl;

    public homePage() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("射线追踪");

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("信道建模");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("传播修正");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("德雅实验室");
        frame.setContentPane(new homePage().jpl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);
    }
}

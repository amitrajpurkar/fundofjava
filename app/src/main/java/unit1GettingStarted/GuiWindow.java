package unit1GettingStarted;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        frame.setTitle("My First GUI Window");

        frame = fillPanelsUsingBorderLayout(frame, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.GREEN, Color.LIGHT_GRAY);

        //frame = fillPanelUsingGridLayout(frame, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.GREEN);
        
        // setting visible needs to be last command, else subsequent changes after set-visible are not seen
        frame.setVisible(true);
    }

    private static JFrame fillPanelUsingGridLayout(JFrame frame, Color q1, Color q2, Color q3, Color q4) {
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new java.awt.GridLayout(2, 2));

        JPanel quarter1 = new JPanel();
        quarter1.setBackground(q1);
        JLabel label1 = new JLabel("Quarter 1");
        quarter1.add(label1);
        contentPane.add(quarter1);
        
        JPanel quarter2 = new JPanel();
        quarter2.setBackground(q2);
        JLabel label2 = new JLabel("Quarter 2");
        quarter2.add(label2);
        contentPane.add(quarter2);
        
        JPanel quarter3 = new JPanel();
        quarter3.setBackground(q3);
        JLabel label3 = new JLabel("Quarter 3");
        quarter3.add(label3);
        contentPane.add(quarter3);
        
        JPanel quarter4 = new JPanel();
        quarter4.setBackground(q4);
        JLabel label4 = new JLabel("Quarter 4");
        quarter4.add(label4);
        contentPane.add(quarter4);

        return frame;
    }

    private static JFrame fillPanelsUsingBorderLayout(JFrame frame, Color nth, Color sth, Color wst, Color est, Color ctr) {
        JPanel north = new JPanel();
        north.setBackground(nth);
        JLabel nthlabel = new JLabel("North");
        north.add(nthlabel);
        frame.getContentPane().add(north, BorderLayout.NORTH);

        JPanel south = new JPanel();
        south.setBackground(sth);
        JLabel sthlabel = new JLabel("South");
        south.add(sthlabel);
        frame.getContentPane().add(south, BorderLayout.SOUTH);

        JPanel west = new JPanel();
        west.setBackground(wst);
        JLabel wstlabel = new JLabel("West");
        west.add(wstlabel);
        frame.getContentPane().add(west, BorderLayout.WEST);

        JPanel east = new JPanel();
        east.setBackground(est);
        JLabel estlabel = new JLabel("East");
        east.add(estlabel);
        frame.getContentPane().add(east, BorderLayout.EAST);

        JPanel center = new JPanel();
        center.setBackground(ctr);
        JLabel ctrlabel = new JLabel("Center");
        center.add(ctrlabel);
        frame.getContentPane().add(center, BorderLayout.CENTER);

        return frame;
    }
}

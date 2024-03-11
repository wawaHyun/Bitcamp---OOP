
package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame{

    Index(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("homepage");
        this.setLayout(new GridLayout(3,3,10,10));
        JButton btn1 = new JButton("join");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(btn1);
        setSize(600,600);
        setLocation(100,100);
        setVisible(true);


        JButton accountBtn = new JButton("create account");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(accountBtn);
        setSize(600,600);
        setLocation(100,100);
        setVisible(true);


        JButton listViewBtn = new JButton("list");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(listViewBtn);
        setSize(600,600);
        setLocation(100,100);
        setVisible(true);


    }

    public static void main() {
        System.out.println("welcome and exit index!");
        new Index();
    }
}
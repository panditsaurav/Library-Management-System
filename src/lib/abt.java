/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author pandi
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class abt extends JFrame implements ActionListener{

	private JPanel contentPane;

        public static void main(String[] args) {
            new abt().setVisible(true);			
	}
    
        public abt() {
            
            super("Library Management System (About Us) ");
            
            setBackground(new Color(100, 100,100));
            setBounds(500, 250, 700, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
          
            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 250));
            l3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("version 1.1");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Tahoma", Font.BOLD, 25));
            l5.setBounds(150, 150, 300, 40);
            contentPane.add(l5);
        
            JTextArea l7 = new JTextArea("A library management system is software\n that is designed & developed to manage all\n the in-house functions of a library.\n That requires maintaining a database of \nnew books and the books borrowed by \nusers along with their due dates. \nThis system  automates all your library’s activities.\nThe best and an easy  way to maintain, organize, \nand handle number of books systematically\n is to implement a library management system software.");
            l7.setFont(new Font("Tahoma", Font.BOLD, 20));
            l7.setBounds(70, 260, 700, 280);
            contentPane.add(l7);

            JLabel l10 = new JLabel("Developed by Saurav Siddhesh Akshay Shruti");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 550, 600, 34);
            contentPane.add(l10);
            contentPane.setBackground(Color.WHITE);
            
            JButton b2 = new JButton("Back");
            b2.addActionListener(this);
            b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
            b2.setFont(new Font("Tahoma", Font.BOLD, 15));
            b2.setBounds(500, 578, 108, 33);
            b2.setBackground(Color.WHITE);
            b2.setForeground(Color.BLACK);
            contentPane.add(b2);
                
	}

   
    public void actionPerformed(ActionEvent ae) {
        
        this.setVisible(false);
	new Home().setVisible(true);
  
    }
        

}
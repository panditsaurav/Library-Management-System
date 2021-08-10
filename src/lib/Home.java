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
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6;

	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {
            super("Library Management System (Home)");
            setBounds(400, 150, 1000, 800);
            setBackground(new Color(255, 255, 204));
            contentPane = new JPanel();
            contentPane.setBackground(new Color(255, 255, 204));
            setContentPane(contentPane);
            contentPane.setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(268, 30, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon("C:/Users/pandi/OneDrive/Documents/NetBeansProjects/lib/src/img/add_book.jpeg");
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(60, 140, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon("C:/Users/pandi/OneDrive/Documents/NetBeansProjects/lib/src/img/stat.jpeg");
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(300, 160, 134, 128);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon("C:/Users/pandi/OneDrive/Documents/NetBeansProjects/lib/src/img/add_student.jpeg");
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(530, 140, 225, 152);
            contentPane.add(l4);

            b1 = new JButton("Add Books");
            b1.setFont(new Font("Tahoma", Font.PLAIN, 18));
            b1.addActionListener(this);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(60, 320, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Statistics");
            b2.setFont(new Font("Tahoma", Font.PLAIN, 18));
            b2.addActionListener(this);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.setBounds(313, 320, 139, 44);
            contentPane.add(b2);

            b3 = new JButton("Add Student");
            b3.setFont(new Font("Tahoma", Font.PLAIN, 18));
            b3.addActionListener(this);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            b3.setBounds(562, 320, 167, 44);
            contentPane.add(b3);

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(12,34, 67), 3), "Perform Operations", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(150, 150, 150)));
            panel.setBounds(20, 120, 750, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);

            b4 = new JButton("Issue Book");
            b4.setFont(new Font("Tahoma", Font.PLAIN, 18));
            b4.addActionListener(this);
            b4.setBackground(Color.BLACK);
            b4.setForeground(Color.WHITE);
            b4.setBounds(76, 620, 143, 41);
            contentPane.add(b4);

            b5 = new JButton("Return Book");
            b5.setFont(new Font("Tahoma", Font.PLAIN, 18));
            b5.addActionListener(this);
            b5.setBackground(Color.BLACK);
            b5.setForeground(Color.WHITE);
            b5.setBounds(310, 620, 159, 41);
            contentPane.add(b5);

            b6 = new JButton("About Us");
            b6.setFont(new Font("Tahoma", Font.PLAIN, 18));
            b6.addActionListener(this);
            b6.setBackground(Color.BLACK);
            b6.setForeground(Color.WHITE);
            b6.setBounds(562, 620, 159, 41);
            contentPane.add(b6);

           JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon("C:/Users/pandi/OneDrive/Documents/NetBeansProjects/lib/src/img/issue_book.jpeg");
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l5 = new JLabel(i12);
            l5.setBounds(60, 440, 159, 163);
            contentPane.add(l5);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon("C:/Users/pandi/OneDrive/Documents/NetBeansProjects/lib/src/img/return_book.jpeg");
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l6 = new JLabel(i15);
            l6.setBounds(332, 440, 139, 152);
            contentPane.add(l6);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon("C:/Users/pandi/OneDrive/Documents/NetBeansProjects/lib/src/img/abt.jpeg");
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            l7 = new JLabel(i18);
            l7.setBounds(562, 440, 157, 152);
            contentPane.add(l7);

            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(100, 200, 160), 3), "Perform Actions", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
            panel2.setBounds(20, 420, 750, 270);
            panel2.setBackground(Color.WHITE);
            contentPane.add(panel2);
            
            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
	}
        
        
        public void actionPerformed(ActionEvent ae){
           
            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new Addbook().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
               new Statistics().setVisible(true);
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new AddStudent().setVisible(true);
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new Issuebook().setVisible(true);
            }
            if(ae.getSource() == b5){
                this.setVisible(false);
                new Returnbook().setVisible(true);
            
            }
            if(ae.getSource() == b6){
                this.setVisible(false);
                new abt().setVisible(true);
            
            }
            
        }
}
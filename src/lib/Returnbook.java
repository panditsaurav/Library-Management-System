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
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class Returnbook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JButton b1,b2,b3;
    private JDateChooser dateChooser;

    public static void main(String[] args) {
	new Returnbook().setVisible(true);
    }

    public void delete() {
        try {
            conn con = new conn();
            String sql = "delete from issueBook where book_id=?";
           PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, textField.getText());
            int i = st.executeUpdate();
            if (i > 0)
                JOptionPane.showConfirmDialog(null, "Book Returned");
            else
                JOptionPane.showMessageDialog(null, "error in Deleting");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
	}
    }

    
    public Returnbook() {
        super("Library Management System ");
        setBounds(450, 300, 617, 363);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel lblNewLabel = new JLabel("Book_id");
	lblNewLabel.setForeground(new Color(0, 0, 0));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel.setBounds(52, 52, 87, 24);
	contentPane.add(lblNewLabel);

	JLabel lblStudentid = new JLabel("Student_id");
	lblStudentid.setForeground(Color.BLACK);
	lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblStudentid.setBounds(243, 52, 87, 24);
	contentPane.add(lblStudentid);

	JLabel lblBook = new JLabel("Book");
	lblBook.setForeground(Color.BLACK);
	lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBook.setBounds(52, 98, 71, 24);
	contentPane.add(lblBook);

	JLabel lblName = new JLabel("Name");
	lblName.setForeground(Color.BLACK);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(300, 98, 71, 24);
	contentPane.add(lblName);

        JLabel lblCourse = new JLabel("Course");
	lblCourse.setForeground(Color.BLACK);
	lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblCourse.setBounds(52, 143, 87, 24);
	contentPane.add(lblCourse);

        JLabel lblBranch = new JLabel("Branch");
	lblBranch.setForeground(Color.BLACK);
	lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBranch.setBounds(303, 144, 68, 24);
	contentPane.add(lblBranch);

	JLabel lblDateOfIssue = new JLabel("Date of Issue");
	lblDateOfIssue.setForeground(Color.BLACK);
	lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfIssue.setBounds(52, 188, 105, 29);
	contentPane.add(lblDateOfIssue);

	JLabel lblDateOfReturn = new JLabel("Date of Return");
	lblDateOfReturn.setForeground(Color.BLACK);
	lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfReturn.setBounds(52, 234, 118, 29);
	contentPane.add(lblDateOfReturn);

        textField = new JTextField();
	textField.setForeground(new Color(105, 105, 105));
	textField.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField.setBounds(128, 56, 105, 20);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setForeground(new Color(105, 105, 105));
	textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField_1.setBounds(340, 56, 93, 20);
	contentPane.add(textField_1);
	textField_1.setColumns(10);

	b1 = new JButton("Search");
	b1.addActionListener(this);
        b1.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b1.setBounds(443, 52, 105, 29);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
	contentPane.add(b1);

	textField_2 = new JTextField();
	textField_2.setEditable(false);
	textField_2.setForeground(new Color(0, 100, 0));
	textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_2.setBounds(128, 102, 162, 20);
	contentPane.add(textField_2);
	textField_2.setColumns(10);

	textField_3 = new JTextField();
	textField_3.setEditable(false);
	textField_3.setForeground(new Color(0, 100, 0));
	textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_3.setColumns(10);
	textField_3.setBounds(369, 102, 179, 20);
	contentPane.add(textField_3);

        textField_4 = new JTextField();
	textField_4.setEditable(false);
	textField_4.setForeground(new Color(0, 100, 0));
	textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_4.setColumns(10);
	textField_4.setBounds(128, 147, 162, 20);
	contentPane.add(textField_4);

	textField_5 = new JTextField();
	textField_5.setForeground(new Color(0, 100, 0));
	textField_5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_5.setEditable(false);
	textField_5.setColumns(10);
	textField_5.setBounds(369, 147, 179, 20);
	contentPane.add(textField_5);

	textField_6 = new JTextField();
	textField_6.setForeground(new Color(0, 100, 0));
	textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_6.setEditable(false);
	textField_6.setColumns(10);
	textField_6.setBounds(167, 194, 162, 20);
	contentPane.add(textField_6);

	dateChooser = new JDateChooser();
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	dateChooser.setBounds(167, 234, 172, 29);
	contentPane.add(dateChooser);

	b2 = new JButton("Return");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setBounds(369, 179, 149, 30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);

	contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b3.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b3.setBounds(369, 231, 149, 30);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
	contentPane.add(b3);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(200, 80, 5), 3, true), "Return Book",
			TitledBorder.CENTER, TitledBorder.TOP, null, new Color(220, 20, 60)));
	panel.setBounds(10, 24, 569, 269);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from proj.issueBook where book_id = ? and student_id =?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField.getText());
		st.setString(2, textField_1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    textField_2.setText(rs.getString("bname"));
                    textField_3.setText(rs.getString("name"));
                    textField_4.setText(rs.getString("course"));
                    textField_5.setText(rs.getString("branch"));
                    textField_6.setText(rs.getString("doi"));
		}
		st.close();
		rs.close();
		
            }
           if(ae.getSource() == b2){
                String sql = "insert into returnbook(book_id, student_id, bname, name,course, branch,doi, dor) values(?, ?, ?, ?, ?, ?,?,?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField.getText());
		st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, textField_3.getText());
		st.setString(5, textField_4.getText());
		st.setString(6, textField_5.getText());
		st.setString(7, textField_6.getText());
		st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
		int i = st.executeUpdate();
		if (i > 0) {
                    JOptionPane.showMessageDialog(null, "returned");
                    delete();
		} else
                    JOptionPane.showMessageDialog(null, "error");
		
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
}

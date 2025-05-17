package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
    	setTitle("LUMIERE QUIZ GAME");
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        

        JLabel heading = new JLabel("LUMIERE QUIZ GAME");
        heading.setBounds(62, 29, 430, 45);
        heading.setFont(new Font("Stencil", Font.BOLD, 40));
        heading.setForeground(new Color(128, 0, 0));
        getContentPane().add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(198, 85, 151, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(0, 0, 0));
        getContentPane().add(name);
        
        tfname = new JTextField();
        tfname.setBounds(109, 116, 319, 30);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        getContentPane().add(tfname);
        
        rules = new JButton("START");
        rules.setFont(new Font("Stencil", Font.PLAIN, 16));
        rules.setBounds(89, 172, 151, 39);
        rules.setBackground(new Color(128, 128, 128));
        rules.setForeground(new Color(0, 0, 0));
        rules.addActionListener(this);
        getContentPane().add(rules);
        
        back = new JButton("Back");
        back.setFont(new Font("Stencil", Font.PLAIN, 16));
        back.setBounds(277, 172, 157, 39);
        back.setBackground(new Color(128, 128, 128));
        back.setForeground(new Color(0, 0, 0));
        back.addActionListener(this);
        getContentPane().add(back);
        
        setSize(551, 297);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}

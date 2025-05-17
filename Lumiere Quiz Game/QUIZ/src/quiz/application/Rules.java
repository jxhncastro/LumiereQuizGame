package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
    	setTitle("LUMIERE QUIZ GAME");
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        
        JLabel heading = new JLabel("Welcome to LUMIERE QUIZ GAME");
        heading.setBounds(69, 11, 481, 59);
        heading.setFont(new Font("Stencil", Font.BOLD, 28));
        heading.setForeground(new Color(128, 0, 0));
        getContentPane().add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 94, 601, 329);
        rules.setFont(new Font("Stencil", Font.PLAIN, 16));
        rules.setText(
            "<html>1. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer.<br><br>2. You may have lot of options in life but here all the questions are compulsory<br><br>3. Crying is allowed but please do so quietly.<br><br>4. Only a fool asks and a wise answers (Be wise, not otherwise)<br><br>5. Do not get nervous if your friend is answering more questions.<br><br>6. Brace yourself, this paper is not for the faint hearted<br><br>7. May you know more than what John Snow knows, Good Luck<br><br><html>"
        );
        getContentPane().add(rules);
        
        back = new JButton("BACK");
        back.setFont(new Font("Stencil", Font.PLAIN, 16));
        back.setBounds(124, 422, 134, 40);
        back.setBackground(new Color(128, 128, 128));
        back.setForeground(new Color(0, 0, 0));
        back.addActionListener(this);
        getContentPane().add(back);
        
        start = new JButton("START");
        start.setFont(new Font("Stencil", Font.PLAIN, 16));
        start.setBounds(325, 422, 142, 40);
        start.setBackground(new Color(128, 128, 128));
        start.setForeground(new Color(0, 0, 0));
        start.addActionListener(this);
        getContentPane().add(start);
        
        JLabel rules_1 = new JLabel();
        rules_1.setText("RULES");
        rules_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 21));
        rules_1.setBounds(20, 70, 159, 48);
        getContentPane().add(rules_1);
        
        setSize(658, 529);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}

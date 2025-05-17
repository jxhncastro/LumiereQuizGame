package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
    	setTitle("LUMIERE QUIZ GAME");
        setBounds(400, 150, 650, 284);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        
        
        JLabel heading = new JLabel("THANKYOU FOR PLAYING LUMIERE QUIZ GAME");
        heading.setForeground(new Color(128, 0, 0));
        heading.setBounds(45, 30, 572, 62);
        heading.setFont(new Font("Stencil", Font.PLAIN, 26));
        getContentPane().add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(194, 103, 300, 30);
        lblscore.setFont(new Font("Stencil", Font.PLAIN, 26));
        getContentPane().add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 18));
        submit.setBounds(238, 174, 158, 43);
        submit.setBackground(new Color(128, 128, 128));
        submit.setForeground(new Color(0, 0, 0));
        submit.addActionListener(this);
        getContentPane().add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}

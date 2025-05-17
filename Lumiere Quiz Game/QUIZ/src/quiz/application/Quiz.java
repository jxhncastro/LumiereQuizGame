package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
    	setTitle("LUMIERE QUIZ GAME");
        this.name = name;
        setBounds(50, 0, 1431, 744);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        
        
        qno = new JLabel();
        qno.setBounds(51, 33, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(qno);
        
        question = new JLabel();
        question.setBounds(111, 33, 889, 45);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(question);
        
        questions[0][0] = "Who is generally acknowledged as the first President of the Philippines?";
        questions[0][1] = "Rodrigo Duterte";
        questions[0][2] = "Emilio Aguinaldo";
        questions[0][3] = "Corazon Aquino";
        questions[0][4] = "Ferdinand E. Marcos";

        questions[1][0] = "Name the oldest Philippine city.";
        questions[1][1] = "Cebu";
        questions[1][2] = "Manila";
        questions[1][3] = "Davao";
        questions[1][4] = "Laoag";

        questions[2][0] = "What is the capital of the Republic of the Philippines?";
        questions[2][1] = "Manila";
        questions[2][2] = "Batangas";
        questions[2][3] = "Cebu";
        questions[2][4] = "Laguna";

        questions[3][0] = "What city is known as the \"Summer Capital of the Philippines\"?";
        questions[3][1] = "Siargao";
        questions[3][2] = "Pagudpud";
        questions[3][3] = "Baguio City";
        questions[3][4] = "Boracay";

        questions[4][0] = "Philippines is located in which continent?";
        questions[4][1] = "Europe";
        questions[4][2] = "Africa";
        questions[4][3] = "South America";
        questions[4][4] = "ASIA";

        questions[5][0] = "Philippines national food is?";
        questions[5][1] = "Pinakbet";
        questions[5][2] = "Adobo";
        questions[5][3] = "Lechon";
        questions[5][4] = "Fried Chicken";

        questions[6][0] = "What is the longest mountain range in the Country?";
        questions[6][1] = "Sierra Madre";
        questions[6][2] = "Mt. Kalatungan";
        questions[6][3] = "Mt. Pulag";
        questions[6][4] = "Mt. Pinatubo";

        questions[7][0] = "The Filipino boxer that is known for his nickname as 'Pac-Man?' ";
        questions[7][1] = "Carlo Paalam";
        questions[7][2] = "Manny Pacquiao";
        questions[7][3] = "Bobby Pacquiao";
        questions[7][4] = "Jason Pagara";

        questions[8][0] = "Where is the highest peak in the Philippines?";
        questions[8][1] = "Mt. Apo";
        questions[8][2] = "Mt. Pinatubo";
        questions[8][3] = "Mt. Pulag";
        questions[8][4] = "Mt. Iraya";

        questions[9][0] = "The Mayon Volcano is located in what province in Region V?";
        questions[9][1] = "Albay";
        questions[9][2] = "Benguet";
        questions[9][3] = "Mountain Province";
        questions[9][4] = "Bohol";
        
        answers[0][1] = "Emilio Aguinaldo";
        answers[1][1] = "Cebu";
        answers[2][1] = "Manila";
        answers[3][1] = "Baguio City";
        answers[4][1] = "ASIA";
        answers[5][1] = "Adobo";
        answers[6][1] = "Sierra Madre";
        answers[7][1] = "Manny Pacquiao";
        answers[8][1] = "Mt. Apo";
        answers[9][1] = "Albay";
        
        opt1 = new JRadioButton();
        opt1.setBounds(111, 96, 497, 55);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(111, 154, 497, 55);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(111, 212, 497, 55);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(111, 270, 497, 54);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(600, 431, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(128, 128, 128));
        next.setForeground(new Color(0, 0, 0));
        next.addActionListener(this);
        getContentPane().add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(275, 431, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(128, 128, 128));
        lifeline.setForeground(new Color(0, 0, 0));
        lifeline.addActionListener(this);
        getContentPane().add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(441, 513, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(128, 128, 128));
        submit.setForeground(new Color(0, 0, 0));
        submit.addActionListener(this);
        submit.setEnabled(false);
        getContentPane().add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}

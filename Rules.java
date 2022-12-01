import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    JButton start, back;
    
    Rules() {
        setTitle("Rules Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome to the Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
         rules.setText(
             
     "<html>"+ 
                 
     "1. You must not use any mobile device during a quiz competition " + "<br><br>" +
     "2. Once this list has been published, you will not be able to change your selections " + "<br><br>" +
     "3. you will be asked to declare which of the specialist quizzes you will take part in" + "<br><br>" +
     "4. 10 questions will be given in all the subject one after another." + "<br><br>" +
     "5. Once a question is passed you cannot give an answer later " + "<br><br>" +
     "6. There is no negative marking for wrong answer." + "<br><br>" +
      "<html>"
            
        );
        add(rules);
             
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Select();
            
        } else {
            setVisible(false);
            new Logins();
        }
    }
    
    public static void main(String[] args) {
        new Rules();
    }
}

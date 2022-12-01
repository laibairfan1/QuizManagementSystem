import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logins extends JFrame implements ActionListener{
    JButton rules,back;
    Logins(){
        setTitle("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1200,500);
        setLocation(200,150);
        
        ImageIcon il=new ImageIcon(getClass().getResource("icons/login3.png"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,800,400);
        add(image);
        
        JLabel heading= new JLabel("QUIZ TIME");
        heading.setBounds(810,70,300,20);
        heading.setFont(new Font("ARIAL",Font.BOLD,27));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel heading1= new JLabel("Enter Your Name");
        heading1.setBounds(750,160,300,45);
        heading1.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        heading1.setForeground(new Color(30,143,252));
        add(heading1);
        
        JTextField tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(tfname);
         rules=new JButton("Rules");
        rules.setBounds(730,268,128,27);
        rules.setForeground(Color.white);
        rules.setBackground(Color.BLUE);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(915,270,128,27);
        back.setForeground(Color.white);
        back.setBackground(Color.BLUE);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==rules){
         new Rules();
     }
     else if(e.getSource()==back){
       setVisible(false);  
     }
    }
    public static void main(String[]args){
        new Logins();
       
     
    }
    
   
    
}

    




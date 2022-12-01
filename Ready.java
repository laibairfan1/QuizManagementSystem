
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ready extends JFrame implements ActionListener{
    
    JButton ready,not_ready;
    
    Ready(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        setLayout(null);
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    
        JLabel heading = new JLabel("Are You Ready");
        heading.setBounds(750, 130, 330, 55);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        ready = new JButton("Ready");
        ready.setBounds(735, 230, 120, 25);
         ready.setBackground(Color.BLACK);
       ready.setForeground(Color.WHITE);
        ready.addActionListener(this);
        add(ready);
        
        not_ready = new JButton("Nopes");
        not_ready.setBounds(915, 230, 120, 25);
        not_ready.setBackground(Color.BLACK);
        not_ready.setForeground(Color.WHITE);
        not_ready.addActionListener(this);
        add(not_ready); 
    }
        
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ready) {
            setVisible(false);
            new Logins();
        } else if (ae.getSource() == not_ready) {
            setVisible(false);
        }
    }
    public static void main(String[] args){
       new Ready();
        
        
        
    }
}


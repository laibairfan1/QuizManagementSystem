
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Select extends JFrame implements ActionListener {
     JButton java,dld,ps;
 JFrame fm;
     Select(){
        
         
         setTitle("Selection");
        setBounds(30,0,1420,830);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setVisible(true);
        
        JLabel heading= new JLabel("Select one type of a Quiz!!!");
        heading.setBounds(65,45,650,25);
        heading.setFont(new Font("Tahoma",Font.BOLD,28));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        java = new JButton("JAVA");
        java.setBounds(550,300,150,50);
        java.setFont(new Font("Tahoma",Font.PLAIN,22));
        java.setBackground(new Color(30,144,255));
        java.setBackground(Color.BLUE);
        java.setForeground(Color.WHITE);
        java.addActionListener(this);
        add(java);
        
        
        dld = new JButton("DLD");
         dld.setBounds(550,390,150,50);
        dld.setFont(new Font("Tahoma",Font.PLAIN,22));
        dld.setBackground(new Color(30,144,255));
        dld.setBackground(Color.BLUE);
        dld.setForeground(Color.WHITE);
        dld.addActionListener(this);
        add(dld);
        
        
        ps = new JButton("P & S");
        ps.setBounds(550,480,150,50);
        ps.setFont(new Font("Tahoma",Font.PLAIN,22));
        ps.setBackground(new Color(30,144,255));
        ps.addActionListener(this);
        ps.setBackground(Color.BLUE);
        ps.setForeground(Color.WHITE);
       
       add(ps);
       setVisible(true);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dld) {
            setVisible(false);
            new Quiz();
            new DLD();
    }
        else if(e.getSource() == java){
            setVisible(false);
            new Quiz1();
            new Java();
        }
        else if(e.getSource() == ps){
            setVisible(false);
            new Quiz2();
            new PS();
        }
    }

public static void main(String[]args){
new Select();
}
 }
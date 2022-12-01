
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Score extends JFrame implements ActionListener {
    
    Score(int score ){
        setBounds(400,150,750,550);
        setTitle("Score Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon il=new ImageIcon(getClass().getResource("icons/score.png"));
        Image i2=il.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        
         JLabel heading= new JLabel("Thankyou for playing the quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        setVisible(true);
        
        JLabel lblscore= new JLabel("Your Score Is "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(25,139,250));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Logins();
    }
    public static void main(String[]args){
       new Score(0); 
    }

    
}

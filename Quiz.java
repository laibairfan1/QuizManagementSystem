import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
 class Quiz extends JFrame implements ActionListener {
    
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String useranswers[][]= new String[10][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    JButton next,lifeline,submit;
    public static int timer=15;
    public static int ans_given=0;
    ButtonGroup groupoptions;
    public static int count=0;
    public static int score=0;
    String name;
    
    Quiz(){
       
       
        setBounds(50,0,1440,392);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon il=new ImageIcon(getClass().getResource("icons/quiz.jpg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,1400,392);
        add(image);
        
        
         qno= new JLabel();
        qno.setBounds(85,440,40,20);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);
        
         question= new JLabel();
        question.setBounds(135,435,800,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,22));
        add(question);
        
        questions[0][0] ="How many bits must each word have in 1-4 line de-multiplexer?";
        questions[0][1] ="1 Bits";
        questions[0][2] ="4 Bits";
        questions[0][3] ="2 Bits";
        questions[0][4] ="8 Bit";
        
        questions[1][0] ="If we add an inverter at the output of AND gate, what function is produced?";
        questions[1][1] ="NAND";
        questions[1][2] ="XOR";
        questions[1][3] ="OR";
        questions[1][4] ="NOR";
        
        questions[2][0] ="Which is also known as coincidence detector?";
        questions[2][1] ="OR";
        questions[2][2] ="NOR";
        questions[2][3] ="NOT";
        questions[2][4] ="AND";
        
        questions[3][0] ="For every possible combination of logical states in the "
                + "inputs, which table shows the logical state of a digital circuit output?";
        questions[3][1] ="Truth table";
        questions[3][2] ="Function table";
        questions[3][3] ="ASCII table";
        questions[3][4] ="Routing table";
        
        questions[4][0] ="The universal gate is?";
        questions[4][1] ="NAND gate";
        questions[4][2] ="OR gate";
        questions[4][3] ="Both";
        questions[4][4] ="None of the above";
        
        questions[5][0] ="Minterms are also called";
        questions[5][1] ="standard product";
        questions[5][2] ="standard sum";
        questions[5][3] ="Both";
        questions[5][4] ="None Of These";
        
        questions[6][0] ="The only function of NOT gate is?";
        questions[6][1] ="Invert input signal";
        questions[6][2] ="Stop Signal";
        questions[6][3] ="None of the above";
        questions[6][4] ="Both";
        
        questions[7][0] ="2’s complement of binary number 0101 is";
        questions[7][1] ="1011";
        questions[7][2] ="1111";
        questions[7][3] ="0011";
        questions[7][4] ="1101";
        
        questions[8][0] ="o convert BCD to seven segments which device is used.?";
        questions[8][1] ="Decoder";
        questions[8][2] ="Encoder";
        questions[8][3] ="Multiplexer";
        questions[8][4] ="De-Multiplexer";
        
        questions[9][0] =" counter circuit is usually constructed of?";
        questions[9][1] ="A number of flip-flops connected in cascade";
        questions[9][2] ="A number of latches connected in cascade form";
        questions[9][3] =" A number of NAND gates connected in cascade form";
        questions[9][4] ="A number of NOR gates connected in cascade form";
        
        
        answers[0][1]="1 Bits";
        answers[1][1]="NAND";
        answers[2][1]="AND";
        answers[3][1]="Truth table";
        answers[4][1]="NAND gate";
        answers[5][1]="standard product";
        answers[6][1]="Invert input signal";
        answers[7][1]="1011";
        answers[8][1]="Decoder";
        answers[9][1]="A number of flip-flops connected in cascade";
        
        opt1=new JRadioButton();
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt1);
        
        
        opt2=new JRadioButton();
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt2);
        
        opt3=new JRadioButton();
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt3);
        
        opt4 =new JRadioButton();
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt4);
        
       
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1000,515,100,30);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(Color.ORANGE);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50 LifeLine");
         lifeline.setBounds(979,560,180,30);
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
        lifeline.setBackground(Color.ORANGE);
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        
        submit = new JButton("Submit");
        submit.setBounds(1000,610,100,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(Color.ORANGE);
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        start(count);
    setVisible(true);     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==next){
            repaint();//count increament(used)
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given=1;
            if(groupoptions.getSelection()==null){
                useranswers[count][0]="";
            }
            else{
               useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
            
        }
        else if(ae.getSource()==lifeline){
            if(count==2 || count==4 || count==6 || count==8 || count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
        else if(ae.getSource()==submit){
            ans_given=1;
            if(groupoptions.getSelection()==null){
                useranswers[count][0]="";
            }
            else{
               useranswers[count][0]=groupoptions.getSelection().getActionCommand();//option which is selected by user
            }
            
                 for(int i=0;i<useranswers.length;i++){
                     if(useranswers[count][0].equals(answers[i][1])){
                         score+=10;
                     }
                     else{
                         score+=0;
                     }
                 }
                 setVisible(false);
                 
                 new Score(score);
                
                 
        }  }
    public void start(int count){
        qno.setText(""+(count+1)+".");
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
 }
    class DLD extends Quiz{
    public void paint(Graphics g){
        super.paint(g);
        String time ="Time Left- "+timer+" seconds ";//15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,15));
        
        if(timer>0){
            g.drawString(time,1100,500);
        }
        else{
            g.drawString("Times Up!!",1100,500); 
        }
        timer--;//14
    
    
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given==1){
            ans_given=0;
            timer=15;
        }
        else if(timer<0){
            timer=15;
            
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
             if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
             if(count==9){//if you have not press submit button at the end, it will be automatically submitted
                 if(groupoptions.getSelection()==null){
                useranswers[count][0]="";
            }
            else{
               useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
                 for(int i=0;i<useranswers.length;i++){
                     if(useranswers[count][0].equals(answers[i][1])){
                         score+=10;
                     }
                     else{
                         score+=0;
                     }
                 }
                 setVisible(false);
                 new Score(score);
                 
             }
             else{//next button
        
            if(groupoptions.getSelection()==null){
                useranswers[count][0]="";
            }
            else{
               useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
            count++;//0 //after addig 1
            start(count);
        }
        }
        
    }
     
public static void main(String[]args){
    new Quiz();
        new DLD();

}
 }

    


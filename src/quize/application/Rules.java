package quize.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;
    Rules (String name){
        this.name = name;
    getContentPane().setBackground(Color.white);   
    setLayout(null);
    
    JLabel heading = new JLabel("Welcome " + name + " to java programming quize");
    heading.setBounds(50,20,900,70);
    heading.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
    heading.setForeground( Color.red);
    add(heading);
    
    
    JLabel rules = new JLabel();
    rules.setBounds(20,90,900,490);
    rules.setFont(new Font("Tahoma", Font.PLAIN, 20));
    //rules.setForeground( Color.red);
    rules.setText(
      "<html>"+ 
                "1. All questions are compolsary ." + "<br><br>" +
                "2. Each question contain ten marks ." + "<br><br>" +
                "3. All question based on a programming of java ." + "<br><br>" +
                "4. Each question attepts only one time ." + "<br><br>" +
                "5. You can use the 50-50 Lifeline button only one time." + "<br><br>" +
                "6. Each quetion give you to only 30 sec . " + "<br><br>" +
                "7. After 30 sec quetion will jump automatically next question ." + "<br><br>" +
                "8. Good Luck !!! For your quiz ." + "<br><br>" +
            "<html>"
    );
    add(rules);
    
     
       back = new JButton("Back");
       back.setBounds(500, 550, 150, 30);
       back.setBackground(Color.black);
       back.setForeground(Color.white);
       back.addActionListener(this);
       add(back);
       
       start = new JButton("Start");
       start.setBounds(800, 550, 150, 30);
       start.setBackground(Color.black);
       start.setForeground(Color.white);
       start.addActionListener(this);
       add(start);
        
    setSize(1500, 700);
    setLocation(20,50);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource() == start) {
         setVisible(false);
       new Quiz(name);
     }else{
       setVisible(false);
       new Login();
     }
    }
    public static void main(String args[]) {
    new Rules("user");   
    }
}

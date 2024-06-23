package quize.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back; 
    JTextField tfname;
   Login(){
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quize1.jpg"));
       JLabel image = new JLabel(i1);
       image.setBounds(0,0,900,700);
       add(image);
       
       JLabel heading = new JLabel("Java Programming");
       heading.setBounds(1000,100,300,45);
       heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 32));
       heading.setForeground( Color.blue);
       add(heading);
       
       JLabel name = new JLabel("Enter your name");
       name.setBounds(1100,230,320,20);
       name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
       name.setForeground( Color.black);
       add(name);
       
       tfname = new JTextField();
       tfname.setBounds(1010,300,300,25);
       tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
       add(tfname);
       
       rules = new JButton("Rules");
       rules.setBounds(1010, 400, 120, 30);
       rules.setBackground(Color.black);
       rules.setForeground(Color.white);
       rules.addActionListener(this);
       add(rules);
       
       back = new JButton("Back");
       back.setBounds(1200, 400, 120, 30);
       back.setBackground(Color.black);
       back.setForeground(Color.white);
       back.addActionListener(this);
       add(back);
       
       setSize(1500,700);
       setLocation(20,50);
    setVisible(true);
   } 
   public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == rules){
        String name = tfname.getText();
        setVisible(false);
        new Rules(name);
    }else if(ae.getSource() == back){
      setVisible(false);
    }
   }

    public static void main(String args[]) {
       new Login();
    }
}

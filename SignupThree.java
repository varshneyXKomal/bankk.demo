
package bank.management.system;
import javax.swing.*;
import java.awt.*;
public class SignupThree extends JFrame {
    SignupThree(){
        setLayout(null);
    JLabel l1=new JLabel("Page3:Account Details");
    l1.setFont(new Font("Raleway",Font.BOLD,22));
    l1.setBounds(280,40,400,40);
    add(l1);
     JLabel type =new JLabel("Page3:Account Details");
     type.setFont(new Font("Raleway",Font.BOLD,22));
      type.setBounds(100,140,200,30);
      add(type);
    setSize(850,820);
    setLocation(350,0);
    setVisible(true);
    
            }
public static void main(String args[]){
new SignupThree();}
}

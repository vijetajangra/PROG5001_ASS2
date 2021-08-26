 import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class calcGUI here.
 *
 * @author (Vijeta)
 * @version (0.1 or 8/26/2021)
 */
public class calcGUI
{
    // instance variables - replace the example below with your own
    JFrame frame;
    JPanel panel;
    JTextField fieldArea;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot,buttonAdd,buttonSub,buttonMulti,buttonDiv,buttonEqual;
    // Constructor of class calcGUI
    public calcGUI(){
        frame =new JFrame();
        panel=new JPanel();
        fieldArea=new JTextField(10);
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        button0=new JButton("0");
        buttonDot=new JButton(".");
        buttonAdd=new JButton("+");
        buttonSub=new JButton("-");
        buttonMulti=new JButton("*");
        buttonDiv=new JButton("/");
        buttonEqual=new JButton("=");
    }
    // to set the value on the panel
    public void setValues(){
        panel.add(fieldArea);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonDot);
        panel.add(buttonAdd);
        panel.add(buttonSub);
        panel.add(buttonMulti);
        panel.add(buttonDiv);
        panel.add(buttonEqual);
        
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
    public static void main (String args[]){
    calcGUI calc=new calcGUI();
    calc.setValues();
  }
}

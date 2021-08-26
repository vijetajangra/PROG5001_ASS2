import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class calcGUI here.
 *
 * @author (Vijeta)
 * @version (0.1 or 8/26/2021)
 */
public class calcGUI extends JFrame
{
    // instance variables - replace the example below with your own
    JPanel panelTop;
    JTextField textArea;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot,buttonAdd,buttonSub,buttonMulti,buttonDiv,buttonEqual;
    // Constructor of class calcGUI
    public calcGUI(){
      
        panelTop=new JPanel();
	panelTop.setBackground(color.pink);
	panelTop.setBounds(10,10,360,35);
	add(panelTop);

	JPanel panelBottom=new JPanel();
	panelBottom.setBackground(color.gray);
	panelBottom.setBounds(10,50,360,200);
	add(panelBottom);
	
        textArea=new JTextField();
	textArea.setPreferresSize(new Dimension(350,25);
	add(panelBottom);
	panelTop.add(textArea);
	pack()'
	
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

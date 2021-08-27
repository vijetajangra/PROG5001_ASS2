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
    JPanel topPanel;
    JTextField textArea;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot,buttonAdd,buttonSub,buttonMulti,buttonDiv,buttonEqual;
    // Constructor of class calcGUI
    public calcGUI(){
      
        topPanel=new JPanel();
	topPanel.setBackground(color.pink);
	topPanel.setBounds(10,10,360,35);
	add(topPanel);

	JPanel bottomPanel=new JPanel();
	bottomPanel.setBackground(color.gray);
	bottomPanel.setBounds(10,50,360,200);
	add(bottomPanel);
	
        textArea=new JTextField();
	textArea.setPreferresSize(new Dimension(350,25);
	add(bottomPanel);
	topPanel.add(textArea);
	pack()'
	
          }
    // to set the value on the panel
    public void setValues(){
        bottomPanel.add(fieldArea);
        bottomPanel.add(button1);
        bottomPanel.add(button2);
        bottomPanel.add(button3);
        bottomPanel.add(button4);
        bottomPanel.add(button5);
        bottomPanel.add(button6);
        bottomPanel.add(button7);
        bottomPanel.add(button8);
        bottomPanel.add(button9);
        bottomPanel.add(button0);
        bottomPanel.add(buttonDot);
        bottomPanel.add(buttonAdd);
        bottomPanel.add(buttonSub);
        bottomPanel.add(buttonMulti);
        bottomPanel.add(buttonDiv);
        bottomPanel.add(buttonEqual);
        
        /**frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);*/
    }
    public static void main (String args[]){
    calcGUI calc=new calcGUI();
    calc.setValues();
  }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class calcGUI here.
 *
 * @author (Vijeta)
 * @version (0.1 or 8/26/2021)
 */
public class CalcGUI extends JFrame implements ActionListener{

    // instance variables - replace the example below with your own
    JPanel topPanel;
    JPanel bottomPanel;
    JTextField textArea;
    String expression="";
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot,buttonAdd,buttonSub,buttonMulti,buttonDiv,buttonEqual,buttonClear;
    // Constructor of class calcGUI
    public CalcGUI(){
        super("MY PROG5001 Calculator");
        setPreferredSize(new Dimension(400,400));
        setLayout(null);
        topPanel=new JPanel();
        topPanel.setBackground(Color.pink);
        topPanel.setBounds(10,10,360,35);
        add(topPanel);

        JPanel bottomPanel=new JPanel();
        bottomPanel.setBackground(Color.gray);
        bottomPanel.setBounds(10,50,360,200);
        add(bottomPanel);
    
        textArea=new JTextField();
        textArea.setPreferredSize(new Dimension(350,25));
        topPanel.add(textArea);
     
        //setting button to the panel
        button1=new JButton("1");
        button1.setActionCommand("CMD_One");
        button1.addActionListener(this);
        
        button2=new JButton("2");
        button2.setActionCommand("CMD_Two");
        button2.addActionListener(this);
        
        button3=new JButton("3");
        button3.setActionCommand("CMD_Three");
        button3.addActionListener(this);
        
        button4=new JButton("4");
        button4.setActionCommand("CMD_Four");
        button4.addActionListener(this);
        
        button5=new JButton("5");
        button5.setActionCommand("CMD_Five");
        button5.addActionListener(this);
        
        button6=new JButton("6");
        button6.setActionCommand("CMD_Six");
        button6.addActionListener(this);
        
        button7=new JButton("7");
        button7.setActionCommand("CMD_Seven");
        button7.addActionListener(this);
        
        button8=new JButton("8");
        button8.setActionCommand("CMD_Eight");
        button8.addActionListener(this);
        
        button9=new JButton("9");
        button9.setActionCommand("CMD_Nine");
        button9.addActionListener(this);
        
        button0=new JButton("0");
        button0.setActionCommand("CMD_Zero");
        button0.addActionListener(this);
        
        buttonDot=new JButton(".");
        buttonDot.setActionCommand("CMD_Dot");
        buttonDot.addActionListener(this);
        
        buttonAdd=new JButton("+");
        buttonAdd.setActionCommand("CMD_Add");
        buttonAdd.addActionListener(this);
        
        buttonSub=new JButton("-");
        buttonSub.setActionCommand("CMD_Sub");
        buttonSub.addActionListener(this);
        
        buttonMulti=new JButton("*");
        buttonMulti.setActionCommand("CMD_Multi");
        buttonMulti.addActionListener(this);
        
        buttonDiv=new JButton("/");
        buttonDiv.setActionCommand("CMD_Div");
        buttonDiv.addActionListener(this);
        
        buttonEqual=new JButton("=");
        buttonEqual.setActionCommand("CMD_Equal");
        buttonEqual.addActionListener(this);
        
        buttonClear=new JButton("C");
        
        
        // adding buttons on bottom Panel
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
        bottomPanel.add(buttonClear);
        
        pack();
    }
    public void actionPerformed(ActionEvent e){
        String command=e.getActionCommand();
        if(command.equals("CMD_One")){
            expression=expression+"1";
        }else
        if(command.equals("CMD_Two")){
        
            expression=expression+"2";
        }else
        if(command.equals("CMD_Three")){
        
            expression=expression+"3";
        }else
        if(command.equals("CMD_Four")){
        
            expression=expression+"4";
        }
        else
        if(command.equals("CMD_Five")){
        
            expression=expression+"5";
        }else
        if(command.equals("CMD_Six")){
        
            expression=expression+"6";
        }else
        if(command.equals("CMD_Seven")){
        
            expression=expression+"7";
        }else
        if(command.equals("CMD_Eight")){
        
            expression=expression+"8";
        }else
        if(command.equals("CMD_Nine")){
        
            expression=expression+"9";
        }else
        if(command.equals("CMD_Zero")){
        
            expression=expression+"0";
        }else
        if(command.equals("CMD_Dot")){
        
            expression=expression+".";
        }else
        if(command.equals("CMD_Add")){
        
            expression=expression+"+";
        }else
        if(command.equals("CMD_Sub")){
        
            expression=expression+"-";
        }else
        if(command.equals("CMD_Multi")){
        
            expression=expression+"*";
        }else
        if(command.equals("CMD_Div")){
        
            expression=expression+"/";
        }else
        if(command.equals("CMD_Equal")){
        
            expression=expression+"=";
        }
        
        textArea.setText(expression);

}
    
    public static void main (String args[]){
    CalcGUI calc=new CalcGUI();
    calc.setVisible(true);
    
  }
}

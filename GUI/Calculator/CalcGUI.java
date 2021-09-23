import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.util.*;

/**
 * CalcGUI class to build a basic calculator which will perform simple calculation by taking input from users
 *
 * @author (Vijeta)
 * @version (0.1 or 8/26/2021)
 */
public class CalcGUI extends JFrame implements ActionListener{

    // instance variables - replace the example below with your own
    JPanel topPanel;
    JPanel bottomPanel,centerPanel,rightPanel;
    JTextField display;
    String expression="";
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot,buttonAdd,buttonSub,buttonMulti,buttonDiv,buttonEqual,buttonClear,
    openBracket,closeBracket,buttonOff,buttonOn,Factorial,backSpace;
    String [] buttonCommands = { "CMD_One","CMD_Two","CMD_Three","CMD_Four","CMD_Five","CMD_Six","CMD_Seven","CMD_Eight","CMD_Nine","CMD_Zero","CMD_Dot","CMD_Add","CMD_Sub","CMD_Multi",
                                    "CMD_Div","CMD_Equal","CMD_CLR","CMD_BSP","CMD_OP","CMD_CL","CMD_FAC"};
    // Constructor of class calcGUI
    int status =0;
    public CalcGUI(){
        super("MY PROG5001 Calculator");
        setPreferredSize(new Dimension(400,400));
        CreateCalcGUI();
    }
    /**
     * A method to set GUI
     */
    private void CreateCalcGUI(){
        topPanel=new JPanel();
        topPanel.setBackground(Color.pink);
        GridLayout topPanelLayout = new GridLayout(0,1);
        topPanel.setBounds(10,10,360,35);
        topPanel.setLayout(topPanelLayout);
        //add(topPanel);
        
        centerPanel= new JPanel();
        centerPanel.setBackground(Color.green);
        GridLayout centerPanelLayout = new GridLayout(4,4);
        centerPanelLayout.setHgap(10);
        centerPanelLayout.setVgap(10);
        centerPanel.setLayout(centerPanelLayout);
        
        //
        
        rightPanel=new JPanel();
        GridLayout rightPanelLayout=new GridLayout(4,1);
        rightPanelLayout.setHgap(10);
        rightPanelLayout.setVgap(10);
        rightPanel.setLayout(rightPanelLayout);
        
        //
        
        JPanel bottomPanel=new JPanel();
        FlowLayout bottomPanelLayout=new FlowLayout();
        bottomPanelLayout.setHgap(5);
        bottomPanelLayout.setVgap(5);
        bottomPanelLayout.setAlignment(FlowLayout.LEADING);
        bottomPanel.setLayout(bottomPanelLayout);
        
        //bottomPanel.setBackground(Color.gray);
        //bottomPanel.setBounds(10,50,360,200);
        //add(bottomPanel);
        //
        BorderLayout mainLayout = new BorderLayout();
        setLayout(mainLayout);
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);
        add(bottomPanel,BorderLayout.SOUTH);
     
        
    
        display=new JTextField("0");
        Font textFont = new Font("SansSerif", Font.BOLD,24);
        display.setFont(textFont);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(100,35));
        topPanel.add(display);
     
        //setting button to the panel
        button1=new JButton("1");
        button1.setActionCommand("CMD_One");
        button1.addActionListener(this);
        button1.setPreferredSize(new Dimension(50,50));
        
        button2=new JButton("2");
        button2.setActionCommand("CMD_Two");
        button2.addActionListener(this);
        button2.setPreferredSize(new Dimension(50,50));
        
        button3=new JButton("3");
        button3.setActionCommand("CMD_Three");
        button3.addActionListener(this);
        button3.setPreferredSize(new Dimension(50,50));
        
        button4=new JButton("4");
        button4.setActionCommand("CMD_Four");
        button4.addActionListener(this);
        button4.setPreferredSize(new Dimension(50,50));
        
        button5=new JButton("5");
        button5.setActionCommand("CMD_Five");
        button5.addActionListener(this);
        button5.setPreferredSize(new Dimension(50,50));
        
        button6=new JButton("6");
        button6.setActionCommand("CMD_Six");
        button6.addActionListener(this);
        button6.setPreferredSize(new Dimension(50,50));
        
        button7=new JButton("7");
        button7.setActionCommand("CMD_Seven");
        button7.addActionListener(this);
        button7.setPreferredSize(new Dimension(50,50));
        
        button8=new JButton("8");
        button8.setActionCommand("CMD_Eight");
        button8.addActionListener(this);
        button8.setPreferredSize(new Dimension(50,50));
        
        button9=new JButton("9");
        button9.setActionCommand("CMD_Nine");
        button9.addActionListener(this);
        button9.setPreferredSize(new Dimension(50,50));
        
        button0=new JButton("0");
        button0.setActionCommand("CMD_Zero");
        button0.addActionListener(this);
        button0.setPreferredSize(new Dimension(50,50));
        
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
        buttonClear.setActionCommand("CMD_CLR");
        buttonClear.addActionListener(this);
        add(buttonClear, BorderLayout.SOUTH);
        
        backSpace=new JButton();
        backSpace.setPreferredSize(new Dimension(150,100));
        backSpace.addActionListener(this);
        backSpace.setActionCommand("CMD_BSP");
        rightPanel.add(backSpace);
        
        openBracket = new JButton("(");
        openBracket.addActionListener(this);
        openBracket.setActionCommand("CMD_OP");
        rightPanel.add(openBracket);
        
        closeBracket = new JButton("(");
        closeBracket.addActionListener(this);
        closeBracket.setActionCommand("CMD_CL");
        rightPanel.add(openBracket);
        
        buttonEqual=new JButton("=");
        buttonEqual.addActionListener(this);
        buttonEqual.setActionCommand("CMD_Equal");
        bottomPanel.add(buttonEqual);
        
        Factorial=new JButton("!");
        Factorial.setPreferredSize(new Dimension(70,50));
        Factorial.addActionListener(this);
        Factorial.setActionCommand("CMD_FAC");
        bottomPanel.add(Factorial);
        
        buttonOff=new JButton("OFF");
        buttonOff.setPreferredSize(new Dimension(145,50));
        buttonOff.addActionListener(this);
        buttonOff.setActionCommand("CMD_OFF");
        buttonOff.setForeground(new Color(255, 153, 153));
        buttonOff.setOpaque(true);
        bottomPanel.add(buttonOff);
        
        // adding buttons on bottom Panel
        centerPanel.add(button1);
        centerPanel.add(button2);
        centerPanel.add(button3);
        centerPanel.add(button4);
        centerPanel.add(button5);
        centerPanel.add(button6);
        centerPanel.add(button7);
        centerPanel.add(button8);
        centerPanel.add(button9);
        centerPanel.add(button0);
        centerPanel.add(buttonDot);
        centerPanel.add(buttonAdd);
        centerPanel.add(buttonSub);
        centerPanel.add(buttonMulti);
        centerPanel.add(buttonDiv);
        centerPanel.add(buttonEqual);
        centerPanel.add(buttonClear);
        
        pack();
    }
    public void actionPerformed(ActionEvent e){
        String command=e.getActionCommand();
        String text=display.getText();
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
        else
        if(command.equals("CMD_BSP")){
            int len= text.length();
            if(len!=0){
            text= text.substring(0,len-1);
            //expression=expression.substring(0,len-1);
            }
        }
        else
        if(command.equals("CMD_OP")){
            //displayText=displayText + "(";
            expression=expression + "(";
        }
        else
        if(command.equals("CMD_CL")){
            //displayText=displayText + ")";
            expression=expression + ")";
        }
        else
        if(command.equals("CMD_FAC")){
        //displayText=displayText + "!";
        expression=expression + "!";
        }
        else
        if(command.equals("CMD_OFF")){
            System.exit(0);
            
            //expression=expression + "(";
        }
        display.setText(expression);        
  }
  public void calculate(String text){
      String userInput = display.getText();
      String postFix=convert(userInput);
      double result=evaluate(postFix);
      String resultToShow=Double.toString(result);
      display.setText(resultToShow);
    }
     private int isOperator(char c){
        switch(c){
        case '+':
        case '-':
             return 1;
        case '*':
        case '/':
              return 2;
        }      
        return -1;
    }
    /**
     * 
     */
    public String convert(String infix){
      Stack<Character> stack = new Stack();
      String postFix = "";
      for (int i =0; i< infix.length(); i++){
          char c = infix.charAt(i);
           if(isOperator(c)>0){
            
            while (!stack.isEmpty() && (isOperator(c) <= isOperator(stack.peek()))){
                            postFix = postFix+stack.pop();
            }
            stack.push(c);
        }else
        if(c=='('){
        //left parenthesis
        stack.push(c);
        
        }else
        if(c==')'){
        //right parenthesis
        while(!stack.isEmpty() && stack.peek() != '('){
            postFix = postFix + stack.pop();
        }
        stack.pop();
        }else{
        //operand
        postFix = postFix + c;
        }
        
      }
      while(!stack.isEmpty()){
        postFix = postFix + stack.pop();
        }
        return postFix;
    }
    public double evaluate(String postFix){
        Stack<Double> stack=new Stack();
        double result = 0;
        for(int i = 0; i < postFix.length();i++){
            char c = postFix.charAt(i);
            if(isOperator (c)>0){
                double operand2 = Double.parseDouble("" + stack.pop());
                double operand1 = Double.parseDouble("" + stack.pop());
                if(c== '+'){
                    result= operand1 + operand2;
                    
                }else
                    if(c=='-'){
                        result= operand1 - operand2;
                }else
                if(c== '*'){
                    result= operand1*operand2;
                }else
                if(c=='/'){
                    result=operand1/operand2;
                }
            stack.push(result);
            }else{
                stack.push(Double.parseDouble("" + c));
            }
        }
        result = stack.pop();
        return result;
    }
    
    public static void main (String args[]){
    CalcGUI calc=new CalcGUI();
    calc.setVisible(true);
    
  }
}

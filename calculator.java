import javax.swing.*;
import java.awt.event.*; 
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
class button_creater{
		button_creater(){
		
		JFrame fr = new JFrame("Calculator");
		 try { 
            // set look and feel 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
		/*textfield*/
		JTextField input = new JTextField();
		input.setEditable(false);
		input.setBounds(50,50,210,50);				//x,y,w,h
		/*1-2-3 row*/
		JButton one = new JButton("1");
		one.setBounds(50,155,50,50);			//x,y,w,h
		
		one.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + one.getText());  
        }  
    }); 

		JButton two = new JButton("2");
		two.setBounds(105,155,50,50);
		two.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + two.getText());  
        }  
    }); 

		JButton three = new JButton("3");
		three.setBounds(160,155,50,50);
		three.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + three.getText());  
        }  
    }); 

		/*4-5-6*/
		JButton four = new JButton("4");
		four.setBounds(50,210,50,50);
		four.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + four.getText());  
        }  
    }); 


		JButton five = new JButton("5");
		five.setBounds(105,210,50,50);
		five.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + five.getText());  
        }  
    }); 

		JButton six = new JButton("6");
		six.setBounds(160,210,50,50);
		six.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + six.getText());  
        }  
    }); 


		/*7-8-9*/
		JButton seven = new JButton("7");
		seven.setBounds(50,265,50,50);			//x,y,w,h
		seven.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + seven.getText());  
        }  
    }); 

		JButton eight = new JButton("8");
		eight.setBounds(105,265,50,50);
		eight.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + eight.getText());  
        }  
    }); 

		JButton nine = new JButton("9");
		nine.setBounds(160,265,50,50);
		nine.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + nine.getText());  
        }  
    }); 



		JButton clear = new JButton("c");
		clear.setBounds(215,155,50,50);
		clear.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText("");  
        }  
    }); 
		JButton add_button = new JButton("+");
		add_button.setBounds(215,210,50,105);
		add_button.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + add_button.getText());  
        }  
    }); 



		JButton subtract = new JButton("-");
		subtract.setBounds(50,100,50,50);			//x,y,w,h
		subtract.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + subtract.getText());  
        }  
    }); 

		JButton multiply = new JButton("X");
		multiply.setBounds(160,100,50,50);			//x,y,w,h 
		multiply.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + '*');  
        }  
    }); 

		JButton divide = new JButton("/");
		divide.setBounds(215,100,50,50);
		divide.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + divide.getText());  
        }  
    }); 


		JButton point = new JButton(".");
		point.setBounds(105,100,50,50);
		point.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + point.getText());  
        }  
    }); 
		JButton calculate = new JButton("=");
		calculate.setBounds(100,315,50,50);
		calculate.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					try{
              ScriptEngineManager manager = new ScriptEngineManager();
              ScriptEngine engine = manager.getEngineByName("JavaScript");
              //System.out.println(engine.eval(input.getText()));
				Object res = engine.eval(input.getText());
				input.setText(res.toString());
						}
						catch(Exception ex){
							System.out.println("Syntax Error");
						}	
        }  
    });

		JButton close = new JButton("close");
		close.setBounds(10,10,30,30);
		close.addActionListener(e -> System.exit(0));
		fr.add(input);
		fr.add(one);
		fr.add(two);
		fr.add(three);
		fr.add(four);
		fr.add(five);
		fr.add(six);
		fr.add(seven);
		fr.add(eight);
		fr.add(nine);
		fr.add(clear);
		fr.add(add_button);
		fr.add(subtract);
		fr.add(close);
		fr.add(multiply);
		fr.add(divide);
		fr.add(point);
		fr.add(calculate);
		fr.setSize(400,400);
		fr.setLayout(null);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
public class calculator{
	public static void main(String[] args) {
		button_creater bt = new button_creater();
	}
}
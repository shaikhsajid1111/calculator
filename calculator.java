import javax.swing.*;
import java.awt.event.*; 
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.lang.*; 
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
class button_creater{
		ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        
		button_creater(){
		JFrame fr = new JFrame("Calculator");
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon/favicon.png"));  
		ImageIcon icon = new ImageIcon();
		fr.setIconImage(icon.getImage());
        try { 
  			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 

        } 
		/*textfield*/
		JTextField input = new JTextField();
		input.setEditable(false);
		input.setBounds(50,40,270,50);				//x,y,w,h
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

		JButton zero = new JButton("0");
		zero.setBounds(105,320,50,50);
		zero.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + zero.getText());  
        }  
    }); 


		JButton clear = new JButton("c");
		clear.setBounds(215,265,50,50);				//215,210,50,50
		clear.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText("");  
        }  
    }); 
		JButton delete_button = new JButton("Del");
		delete_button.setBounds(160,320,50,50);
		delete_button.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            		StringBuffer texts = new StringBuffer(input.getText());
            		//System.out.println(texts);
            		int len = texts.length();
            		//System.out.println(len);
            		texts.delete(len-1,len);
            		input.setText(texts.toString());

        }  
    }); 
		JButton add_button = new JButton("+");
		add_button.setBounds(215,155,50,50);
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
		JButton modulus = new JButton("%");
		modulus.setBounds(215,210,50,50);
		modulus.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
            input.setText(input.getText() + modulus.getText());  
        }  
    		}); 
		@SuppressWarnings("unchecked")
		JButton calculate = new JButton("=");
		calculate.setBounds(215,320,50,50);
		calculate.addActionListener(new ActionListener(){
			@SuppressWarnings("unchecked")  
			public void actionPerformed(ActionEvent e){  
				try{

					@SuppressWarnings("unchecked")
              		ScriptEngineManager manager = new ScriptEngineManager();
              		ScriptEngine engine = manager.getEngineByName("js");
					Object res = engine.eval(input.getText());
					input.setText(res.toString());
						}
				catch(Exception ex){
						
						input.setText("Syntax Error");
						System.out.println(ex);
						}	
        }  
    });
		JButton square = new JButton("n\u00b2");
		square.setBounds(50,320,50,50);
		square.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
            	try{
            		String str_num = input.getText();

            		Object result = engine.eval(str_num);
            		double num = Double.parseDouble(result.toString());

            		double square = num*num;
            		String converted_num = String.valueOf(square);
            		input.setText(converted_num);
            	}  
            	catch(Exception ex){
            		input.setText("Syntax Error");
            		System.out.println(ex);
            	}
        }  
    }); 
		/*factorial*/
		JButton fact = new JButton("!");
		fact.setBounds(270,100,50,50);			//x,y,wh
		fact.addActionListener(new ActionListener(){  
			 double factorial(double n){    
  					if (n < 2)    
    					return n;    
  					else    
    					return(n * factorial(n-1));    
 						}    
			public void actionPerformed(ActionEvent e){  
            	try{
            		String str_num = input.getText();
            		Object result = engine.eval(str_num);
            		double num = Double.parseDouble(result.toString());
        			double res = factorial(num);

            		String converted_num = String.valueOf(res);
            		input.setText(converted_num);
            	}  
            	catch(Exception ex){
            		input.setText("Syntax Error");
            		System.out.println(ex);
            	}
        }  
    }); 
		/*log button and action*/
		JButton log_button = new JButton("log");
		log_button.setBounds(270,155,50,50);			//x,y,wh
		log_button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
            	try{
            		String str_num = input.getText();
            		
            		Object result = engine.eval(str_num);
            		double num = Double.parseDouble(result.toString());

            		
              		double res = Math.log(num);
              		String converted_num = String.valueOf(res);
            		input.setText(converted_num);
            	}  
            	catch(Exception ex){
            		input.setText("Syntax Error");
            		System.out.println(ex);
            	}
        }  
    }); 
		/*square root*/
		JButton square_root = new JButton("\u221A");
		square_root.setBounds(270,210,50,50);			//x,y,wh
		square_root.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
            	try{
            		String str_num = input.getText();

            		Object result = engine.eval(str_num);
            		double num = Double.parseDouble(result.toString());

              		double res = Math.sqrt(num);
              		String converted_num = String.valueOf(res);
            		input.setText(converted_num);
            	}  
            	catch(Exception ex){
            		input.setText("Syntax Error");
            		System.out.println(ex);
            	}
        }  
    }); 
		/*Cube root*/
		JButton cube_root = new JButton("\u221A3");
		cube_root.setBounds(270,265,50,50);			//x,y,wh
		cube_root.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
            	try{
            		String str_num = input.getText();

            		Object result = engine.eval(str_num);
            		double num = Double.parseDouble(result.toString());

              		double res = Math.cbrt(num);
              		String converted_num = String.valueOf(res);
            		input.setText(converted_num);
            	}  
            	catch(Exception ex){
            		input.setText("Syntax Error");
            		System.out.println(ex);
            	}
        }  
    }); 
		JButton exponential = new JButton("e");
		exponential.setBounds(270,320,50,50);			//x,y,wh
		exponential.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
            	try{
            		String str_num = input.getText();

            		Object result = engine.eval(str_num);
            		double num = Double.parseDouble(result.toString());

              		double res = Math.exp(num);
              		String converted_num = String.valueOf(res);
            		input.setText(converted_num);
            	}  
            	catch(Exception ex){
            		input.setText("Syntax Error");
            		System.out.println(ex);
            	}
        }  
    }); 

		JButton close = new JButton("X");
		close.setBackground(Color.RED);
		close.setBounds(280,320+55,40,40);
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
		fr.add(zero);
		fr.add(clear);
		fr.add(delete_button);
		fr.add(add_button);
		fr.add(subtract);
		fr.add(close);
		fr.add(multiply);
		fr.add(divide);
		fr.add(point);
		fr.add(calculate);
		fr.add(square);
		fr.add(modulus);
		fr.add(fact);
		fr.add(log_button);
		fr.add(square_root);
		fr.add(cube_root);
		fr.add(exponential);
		fr.setResizable(false);
		fr.setSize(370,460);	
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
import javax.swing.*;
public static class button_creater{
	void create_button{
		
		JFrame fr = new JFrame("Calculator");
		/*1-2-3 row*/
		JButton one = new JButton("1");
		one.setBounds(50,100,50,50);			//x,y,w,h
		JButton two = new JButton("2");
		two.setBounds(105,100,50,50);
		JButton three = new JButton("3");
		three.setBounds(160,100,50,50);

		/*4-5-6*/
		JButton four = new JButton("4");
		four.setBounds(50,160,50,50);
		JButton five = new JButton("5");
		five.setBounds(105,160,50,50);
		JButton six = new JButton("6");
		six.setBounds(160,160,50,50);

		/*7-8-9*/
		JButton seven = new JButton("7");
		seven.setBounds(50,220,50,50);			//x,y,w,h
		JButton eight = new JButton("8");
		eight.setBounds(105,220,50,50);
		JButton nine = new JButton("9");
		nine.setBounds(160,220,50,50);
		



		fr.add(one);
		fr.add(two);
		fr.add(three);
		fr.add(four);
		fr.add(five);
		fr.add(six);
		fr.add(seven);
		fr.add(eight);
		fr.add(nine);
		fr.setSize(400,400);
		fr.setLayout(null);
		fr.setVisible(true);
	}

}
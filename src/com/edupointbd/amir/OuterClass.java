package com.edupointbd.amir;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
 

 class OuterClass extends Frame{
	 TextField textField;

	OuterClass(){
	
		textField = new TextField();
		textField.setBounds(60, 50, 170, 20);
		add(textField);
		
		Button button = new Button("Click me");
		button.setBounds(120, 120, 80, 30);
		add(button);
		
		Aevent2 oAevent = new Aevent2(this);
		
		button.addActionListener(oAevent);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterClass();
	}

	
	


}
 

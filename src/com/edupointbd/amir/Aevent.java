package com.edupointbd.amir;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aevent extends Frame implements ActionListener{
	
	TextField tField;
	
	public Aevent() {
		
		//creating component
		tField = new TextField();
		tField.setBounds(60, 50, 170, 20);
		
		Button button = new Button("Click me");
		button.setBounds(100, 120, 80, 30);
		
		//register listener
		
		button.addActionListener(this);// passing current instance
		
		add(button);
		add(tField);
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Aevent aevent = new Aevent();

	}

	public void actionPerformed(ActionEvent e) {
		tField.setText("welcome : I listening");
	}

}

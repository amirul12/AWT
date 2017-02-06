package com.edupointbd.amir;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class First2 {

	 

	public First2() {
		Frame frame = new Frame("Welcome");
		Button button = new Button("Click me");
		button.setBounds(30, 100, 50, 30);
		frame.add(button);
		
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		
 
	}
 
	public static void main(String[] args) {
		
		First2 first2 = new First2();
		
				

	}

}

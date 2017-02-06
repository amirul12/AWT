package com.edupointbd.amir;

import java.awt.Button;
import java.awt.Frame;

public class ButtonDemo {

 
	public static void main(String[] args) {

		Frame frame = new Frame("Button Example");
		
		Button button = new Button("Click Me");
		button.setBounds(100,100,80,30);
		frame.add(button);
		
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}

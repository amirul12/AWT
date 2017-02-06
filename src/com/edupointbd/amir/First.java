package com.edupointbd.amir;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class First extends Frame {
	
 
	public First() {
		 Button b = new Button("Click Me");
		 b.setBounds(30, 100, 80, 30);
		 add(b);
		 
		 setSize(300, 300);
		 setLayout(null);
		 setVisible(true);
 
	}
 
	public static void main(String[] args) {
		
		First first = new First();
 
		

	}
 

}

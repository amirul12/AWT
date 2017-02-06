package com.edupointbd.amir;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo2 {

 
	public static void main(String[] args) {
		
		Frame f= new Frame("Button Demo 2");

		final TextField tField  = new TextField();
		tField.setBounds(50, 50, 150, 20);
		
		Button button = new Button("Click");
		button.setBounds(100, 100, 30, 60);
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				  
				tField.setText("BanglaDesh");
			}
		});
		
		f.add(button);
		f.add(tField);
		f.setSize(400, 400);
		f.setLayout(null);
		 f.setVisible(true);
		
		
	}

}

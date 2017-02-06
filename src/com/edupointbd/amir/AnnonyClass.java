package com.edupointbd.amir;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnonyClass extends Frame{
	TextField tField ;
	AnnonyClass(){
		
		tField = new TextField();
		tField.setBounds(100, 100, 80, 40);
		add(tField);
		
		Button button = new Button("click me");
		button.setBounds(100, 150, 80, 40);
		add(button);
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				tField.setText("Annonymouse");
			}
		});
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		
	}
	

 
	public static void main(String[] args) {
		AnnonyClass annonyClass = new AnnonyClass();

	}

}

package com.edupointbd.amir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aevent2 implements ActionListener{
	OuterClass objClass;
	
	public Aevent2(OuterClass objClass) {
		this.objClass = objClass;
	}
	

	public void actionPerformed(ActionEvent e) {
	 objClass.textField.setText("welcome to You");
	
		
	}
	
	
	
	
}

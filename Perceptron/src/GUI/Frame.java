package GUI;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
public class Frame extends JFrame {
	
	public Frame(){
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension sizeScreen = myScreen.getScreenSize();
		int heightScreen = sizeScreen.height;
		int widhtScreen = sizeScreen.width;
		setSize(widhtScreen/2,heightScreen/2);
		setLocation(widhtScreen/4,heightScreen/4);
		setTitle("Perceptron");
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}


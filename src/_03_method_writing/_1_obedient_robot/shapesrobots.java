package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class shapesrobots {
	static Robot ap = new Robot("mini");
	
public static void main(String[] args) {
	String response = "yes";
	while (response.equals("yes")) {
		ap.setWindowColor(Color.GRAY);
	ap.hide();
	String shape = JOptionPane.showInputDialog("What shape would you like?");
	String colors = JOptionPane.showInputDialog("What color would you  like? (red, green, or blue");
	if (colors.equals("red")) {
		ap.setPenColor(Color.RED);
	} else if (colors.equals("green")) {
		ap.setPenColor(Color.GREEN);
	} else if (colors.equals("blue")) {
		ap.setPenColor(Color.BLUE);
	}
	
	if (shape.equals("square") ) {
		drawSqaure();
	} else if (shape.equals("triangle")) {
		drawTriangle();
	} else if (shape.equals("circle")) {
		drawCircle();
	}
	 response = JOptionPane.showInputDialog("DO you want to play again?");
	}
	
	
	
	
	
}
static void drawSqaure() {
	ap.penDown();
	ap.setSpeed(50);
	for (int b = 0; b < 4; b++) {
	ap.move(100);
	ap.turn(90);
	}
}
static void drawTriangle() {
	ap.penDown();
	ap.setSpeed(50);
	for (int g = 0; g < 3; g++) {
		ap.move(100);
		ap.turn(120);
	}
}
static void drawCircle() {
	ap.penDown();
	ap.setSpeed(50);
	for (int y = 0; y < 100; y ++) {
		ap.move(10);
		ap.turn(10);
	}
}

}

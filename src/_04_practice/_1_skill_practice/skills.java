package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skills {
public static void main(String[] args) {
	skills skills = new skills();
    skills.skill1();
    skills.skill2();
    skills.skill3();
    skills.skill4();
    skills.skill5();
}
void skill1() {
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int dimesInt = Integer.parseInt(dimes);
	JOptionPane.showMessageDialog(null, "You have " + dimesInt*10 + " dimes");
	String height = JOptionPane.showInputDialog("How tall are you?");
	int heightInt = Integer.parseInt(height);
	if (heightInt < 36) {
		JOptionPane.showMessageDialog(null, "Eat your wheaties");
	} 
	else {
		JOptionPane.showMessageDialog(null, "Nice");
	}
}
void skill2() {
	for (int i = 0; i < 31; i++) {
		if (i % 3 == 0) {
			System.out.println(i);
		}
	}
}
void skill3() {
	Random ran = new Random();
	int number = ran.nextInt(20);
	System.out.println(number);
	
	Random rans = new Random();
	int numbers = rans.nextInt(20);
	System.out.println(numbers);
	
	JOptionPane.showMessageDialog(null, "The difference of numbers is "+ (number - numbers));
	
}
void skill4() {
	String live = JOptionPane.showInputDialog("Do you live in San Diego");
	if (live.equals("yes")) {
		JOptionPane.showMessageDialog(null, "You live in America's finest city");
	} 
	else {
		JOptionPane.showMessageDialog(null, "Move to San Diego");
	}
	String cars = JOptionPane.showInputDialog("How many cars do you have?");
	int carsInt = Integer.parseInt(cars);
	if (carsInt == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation");
	}  else if (carsInt == 1)  {
		JOptionPane.showMessageDialog(null, "Cool");
	}
	else {
		JOptionPane.showMessageDialog(null, "You have a total of "+ carsInt*4+" wheels.");
	}
}
void skill5() {
	String school = JOptionPane.showInputDialog("What school do you go to?");
	JOptionPane.showMessageDialog(null,  school + " is an amazing school");
}
}

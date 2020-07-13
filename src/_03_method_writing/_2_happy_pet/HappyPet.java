package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int happiness = 0;
	public static void main(String[] args) {
		for(int p = 0; p < 5; p++) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What type of pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do for your " + pet, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle and groom", "Give food", "Go on a walk" }, null);
		}

if (task ==2) {
	 happiness = happiness + task;
	walkPet();
}
if (task ==1) {
	happiness = happiness + task;
	feedPet();
}
if (task ==0) {
	happiness = happiness + 4;
	cuddlePet();
	
}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void walkPet() {
		
		JOptionPane.showMessageDialog(null, "Your pet hopps around in gratitude. Your pet is at a happiness of " + happiness);
	}
	static void cuddlePet() {
		JOptionPane.showMessageDialog(null, "Your pet is extremely happy. Your pet is at a happiness of " + happiness);
	}
	static void feedPet() {
		JOptionPane.showMessageDialog(null, "Your pet sighs in content. Your pet is at a happiness of " + happiness);
	}
}
package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primenumbers {
	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog("Enter a number");
		int primeInt = Integer.parseInt(prime);
		boolean isPrime = true;
		for (int z = 2; z < primeInt; z++) {
			if (primeInt % z == 0) {
				isPrime = false;

			}
		}
		if (isPrime) {
			JOptionPane.showMessageDialog(null, "that is a prime number");

		} else {
			JOptionPane.showMessageDialog(null, "that is not a prime number");
		}

	}
}
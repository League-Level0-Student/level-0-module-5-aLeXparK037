package _01_algorithms._2_fibonacci;

public class shapes {
public static void main(String[] args) {
	int one = 0;
	int two = one + 1;
	int sum = one + two;
	System.out.println(one);
	System.out.println(two);
	System.out.println(sum);
	for (int z = 0; z < 10; z++) {
	one = two;
	two = sum;
	sum = one + two;
	System.out.println(sum);
	}
}
}

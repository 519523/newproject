package onepackage;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z;
		System.out.println("Enter two integers to calculate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of eneterd integers =" + z);

	}
}
//Rebecca Mantione: The main for the test class returns whether or not it is each thing

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Input String :");
		Scanner action = new Scanner(System.in); // reads the input
		String read = action.nextLine(); // saves it to a variable

		// Tests to see if it is a number
		if (TestClass.isNumber(read) == true) {
			System.out.println("number = true");
		} else {
			System.out.println("number = false");
		}

		// Tests to see if it is an id
		if (TestClass.isID(read) == true) {
			System.out.println("id = true");
		} else {
			System.out.println("id = false");
		}

		// Tests to see if it is a string
		if (TestClass.isString(read) == true) {
			System.out.println("string = true");
		} else {
			System.out.println("string = false");
		}

		// Tests to see if it is a comment
		if (TestClass.isComment(read) == true) {
			System.out.println("comment = true");
		} else {
			System.out.println("comment = false");
		}

	}

}

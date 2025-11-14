//Rebecca Mantione: Uses pattern/matcher classes to read data from a file and see if it matches 
//the regular expression

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner data; // For reading the data.
		PrintWriter result; // Character output stream for writing data.

		ArrayList<String> fileContent = new ArrayList<String>(); // An ArrayList for holding the data.

		try { // Create the input stream.
			data = new Scanner(new File("img_examples.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file!");
			return; // End the program by returning from main().
		}

		while (data.hasNext()) { // Read until end-of-file.
			String input = data.next();
			fileContent.add(input);
		}


		for (int iter = 0; iter < 16; iter++) { //Iterate through the array 
			String HTML = fileContent.get(iter) + " " + fileContent.get(iter + 1) + " " + fileContent.get(iter + 2) //stores each of the 4 HTML's to be checked
					+ " " + fileContent.get(iter + 3);
			iter = iter + 3;
			System.out.println("Input string: " + HTML);

			//Checks the HTML to see if they are valid
			Pattern number = Pattern
					.compile("(<img src=\"[^\"]*\" alt=\"[^\"]*\">)|(<img alt=\"[^\"]*\" src=\"[^\"]*\">)"); // Regular
																												// expression
			Matcher matcher = number.matcher(HTML); // Test string
			boolean matchFound = matcher.matches();
			if (matchFound) {
				System.out.println("match = true" + "\n");
			} else {
				System.out.println("match = false" + "\n");
			}
		}

		data.close();

	}

}

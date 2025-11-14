//Rebecca Mantione:Creates a transition table for each regular expressions
//and tests them to see what each input is

public class TestClass {

	static int[][] asciiTable = new int[128][4]; // initiates the empty 2d array

	public static boolean isNumber(String s) {
		char[] sArray = s.toCharArray();
		int col = 1;

		// Fills in the transition table
		for (int row = 0; row < 128; row++) {
			asciiTable[row][0] = row;
			if (48 < row && row < 58) {
				asciiTable[row][1] = 3;
				asciiTable[row][3] = 3;
				asciiTable[row][2] = 0;
			}
			if (row == 48) {
				asciiTable[row][1] = 2;
				asciiTable[row][3] = 3;
				asciiTable[row][2] = 0;

			}

		}

		// Tests to see if the inputs is accepted
		for (int i = 0; i < sArray.length; i++) {
			int ascii = sArray[i];
			for (int row = 0; row < 128; row++) {

				if (asciiTable[row][0] == ascii) {
					if (asciiTable[row][col] != 0) {
						int store = asciiTable[row][col];

						col = store;

					} else {
						return false;
					}

				}
			}

		}

		return true;

	}

	public static boolean isID(String s) {
		char[] sArray = s.toCharArray();
		int col = 1;

		// Fills in the transition table
		for (int row = 0; row < 128; row++) {
			asciiTable[row][0] = row;
			if (64 < row && row < 90) {
				asciiTable[row][1] = 2;
				asciiTable[row][2] = 2;
			}
			if (96 < row && row < 123) {
				asciiTable[row][1] = 2;
				asciiTable[row][2] = 2;
			}
			if (47 < row && row < 58) {
				asciiTable[row][1] = 0;
				asciiTable[row][2] = 2;
			}

		}

		// Tests to see if the inputs is accepted
		for (int i = 0; i < sArray.length; i++) {
			int ascii = sArray[i];
			for (int row = 0; row < 128; row++) {

				if (asciiTable[row][0] == ascii) {
					if (asciiTable[row][col] != 0) {
						int store = asciiTable[row][col];

						col = store;

					} else {
						return false;
					}

				}
			}

		}

		return true;

	}

	public static boolean isString(String s) {
		char[] sArray = s.toCharArray();
		int col = 1;

		// Fills in the transition table
		for (int row = 0; row < 128; row++) {
			asciiTable[row][0] = row;
			if (row == 34) {
				asciiTable[row][1] = 2;
				asciiTable[row][2] = 3;
				asciiTable[row][3] = 0;

			}
			if (31 < row && row < 34) {
				asciiTable[row][1] = 0;
				asciiTable[row][2] = 2;
				asciiTable[row][3] = 0;
			}
			if (34 < row && row < 127) {
				asciiTable[row][1] = 0;
				asciiTable[row][2] = 2;
				asciiTable[row][3] = 0;
			}

		}

		// Tests to see if the inputs is accepted
		for (int i = 0; i < sArray.length; i++) {
			int ascii = sArray[i];
			for (int row = 0; row < 128; row++) {

				if (asciiTable[row][0] == ascii) {
					if (asciiTable[row][col] != 0) {
						int store = asciiTable[row][col];

						col = store;

					} else {
						return false;
					}

				}
			}

		}
		int end = sArray.length - 1;

		// Checks to make sure it ends with "
		if (sArray[end] != 34) {
			return false;
		}

		return true;

	}

	public static boolean isComment(String s) {
		char[] sArray = s.toCharArray();

		// Checks to make sure it is not just /
		if (sArray.length == 1) {
			return false;
		}
		int col = 1;

		// Fills in the transition table
		for (int row = 0; row < 128; row++) {
			asciiTable[row][0] = row;
			if (row == 47) {
				asciiTable[row][1] = 2;
				asciiTable[row][2] = 3;
				asciiTable[row][3] = 3;

			}
			if (31 < row && row < 47) {
				asciiTable[row][1] = 0;
				asciiTable[row][2] = 0;
				asciiTable[row][3] = 3;
			}
			if (47 < row && row < 127) {
				asciiTable[row][1] = 0;
				asciiTable[row][2] = 0;
				asciiTable[row][3] = 3;
			}

		}

		// Tests to see if the inputs is accepted
		for (int i = 0; i < sArray.length; i++) {
			int ascii = sArray[i];
			for (int row = 0; row < 128; row++) {
				if (asciiTable[row][0] == ascii) {
					if (asciiTable[row][col] != 0) {
						int store = asciiTable[row][col];

						col = store;

					} else {
						return false;
					}

				}
			}

		}

		return true;

	}
}

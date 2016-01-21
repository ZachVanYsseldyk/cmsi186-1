class Alphabetception {
	public static void main(String args[]) {
		char charecter = 'x';
		int numCharecter = (int) charecter;
		if (97 <= numCharecter && numCharecter <= 109) {
			System.out.println("Your charecter, '" + charecter + "', is in the first half of the alphabet. Nice.");
			if (97 <= numCharecter && numCharecter <= 103) {
				System.out.println("Your charecter, '" + charecter + "', is in the first quarter of the alphabet. Nice.");
				if (97 <= numCharecter && numCharecter <= 100) {
					System.out.println("Your charecter, '" + charecter + "', is in the first eighth of the alphabet. Nice.");
				}
				if (100 < numCharecter && numCharecter <= 103) {
					System.out.println("Your charecter, '" + charecter + "', is in the second eighth of the alphabet. Nice.");
				}
			}
			if (103 < numCharecter && numCharecter <= 109) {
				System.out.println("Your charecter, '" + charecter + "', is in the second quarter of the alphabet. Nice.");
				if (103 < numCharecter && numCharecter <= 106) {
					System.out.println("Your charecter, '" + charecter + "', is in the third eighth of the alphabet. Nice.");
				}
				if (106 < numCharecter && numCharecter <= 109) {
					System.out.println("Your charecter, '" + charecter + "', is in the fourth eighth of the alphabet. Nice.");
				}
			}
		}
		if (109 < numCharecter && numCharecter <= 122) {
			System.out.println("Your charecter, '" + charecter + "', is in the second half of the alphabet. Nice.");
			if (109 < numCharecter && numCharecter <= 116) {
				System.out.println("Your charecter, '" + charecter + "', is in the third quarter of the alphabet. Nice.");
				if (109 < numCharecter && numCharecter <= 113) {
					System.out.println("Your charecter, '" + charecter + "', is in the fifth eighth of the alphabet. Nice.");
				}
				if (113 < numCharecter && numCharecter <= 116) {
					System.out.println("Your charecter, '" + charecter + "', is in the sixth eighth of the alphabet. Nice.");
				}
			}
			if (116 < numCharecter && numCharecter <= 122) {
				System.out.println("Your charecter, '" + charecter + "', is in the fourth quarter of the alphabet. Nice.");
				if (116 < numCharecter && numCharecter <= 118) {
					System.out.println("Your charecter, '" + charecter + "', is in the seventh eighth of the alphabet. Nice.");
				}
				if (118 < numCharecter && numCharecter <= 122) {
					System.out.println("Your charecter, '" + charecter + "', is in the eighth eighth (last part woohoo so much typing) of the alphabet. Nice.");
				}
			}
		}
	}
}

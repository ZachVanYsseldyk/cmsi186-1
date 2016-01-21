class LCM {
	public static void main(String args[]) {
		int biggerNumber = 7;
		int smallerNumber = 3;
		int result = 0;
		for (int i = biggerNumber; i <= smallerNumber*biggerNumber; i = i + biggerNumber) {
			if (i%smallerNumber == 0) {
				result = i;
				break;
			}
		}
		System.out.println("The LCM for " + biggerNumber + " and " + smallerNumber + " is... " + result + "! Dang it's nice to have the computer do all the work huh?");
	}
}

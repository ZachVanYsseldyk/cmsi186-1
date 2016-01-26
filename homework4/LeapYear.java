class LeapYear {
	public static void main(String[] args) {
		String input = args[0];
		int number = Integer.parseInt(input);
		if (number % 4 == 0) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
	}
}

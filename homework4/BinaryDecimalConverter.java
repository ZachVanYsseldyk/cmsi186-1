class BinaryDecimalConverter {
	//I learned this way of reading binary from going to tutoring in the Keck Lab! Hope this is okay!
  public static void main(String[] args) {
  	String input = args[0];
  	int total = 0;
  	boolean isBinary = true;
  	for(int i = 0; i < input.length(); i++) {
  		if (input.substring(i, i+1).equals("1")) {
  			total = total*2+1;
  		} else if (input.substring(i, i+1).equals("0")) {
  			total = total*2;
  		} else {
  			System.out.println("Not a binary number!!");
  			isBinary = false;
  			break;
  		}
  	}
  	if (isBinary == true) {
  	System.out.println("Your total is... " + total + "!!! YAY!");
  	} 
  }
}

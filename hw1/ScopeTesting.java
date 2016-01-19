class ScopeTesting {
  public static void main(String args[]) {
    int i;
    for (i = 0; i < 10; i++) {
      char favoriteLetter = 'r';
      if (i < 7) {
        System.out.println("Actually not small enough");
      }
      else {
        boolean large = false;
        System.out.println(favoriteLetter);
      }
      System.out.println(large);
      System.out.println(favoriteLetter);
    }
    System.out.println(favoriteLetter);
  }
}

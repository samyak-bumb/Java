public static void main(String[] args) {
  int a = 10;

  // (a = 11) is an assignment, NOT comparison.
  // This sets a = 11 and returns 11 (which is true).
  if (a == 11) { // corrected to comparison
    System.out.println("I am 11");
  } else {
    System.out.println("I am not 11");
  }
}

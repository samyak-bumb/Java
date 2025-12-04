public static void main(String[] args) {
  // Sample string with double and triple spaces
  String text = "This  line has   double and triple spaces.";

  // contains() → checks if specific sequence exists in the string
  boolean hasDoubleSpace = text.contains("  "); // two spaces
  boolean hasTripleSpace = text.contains("   "); // three spaces

  System.out.println("Contains double spaces? " + hasDoubleSpace);
  System.out.println("Contains triple spaces? " + hasTripleSpace);
}

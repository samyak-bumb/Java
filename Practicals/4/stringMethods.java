class stringMethods {

  public static void main(String[] args) {
    String s1 = "Java Programming";
    String s2 = "java programming";

    System.out.println("Length: " + s1.length());
    System.out.println("Char at 3: " + s1.charAt(3));
    System.out.println("Substring(5): " + s1.substring(5));
    System.out.println("Substring(0,4): " + s1.substring(0, 4));
    System.out.println("Equals: " + s1.equals(s2));
    System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
    System.out.println("Compare To: " + s1.compareTo(s2));
    System.out.println("Concat: " + s1.concat(" is fun"));
    System.out.println("To Upper Case: " + s1.toUpperCase());
    System.out.println("To Lower Case: " + s1.toLowerCase());
    System.out.println("Starts With 'Java': " + s1.startsWith("Java"));
    System.out.println("Ends With 'ing': " + s1.endsWith("ing"));
    System.out.println("Contains 'Pro': " + s1.contains("Pro"));
    System.out.println("Replace: " + s1.replace("Java", "Python"));
    System.out.println("Index Of 'a': " + s1.indexOf('a'));
    System.out.println("Last Index Of 'a': " + s1.lastIndexOf('a'));
    System.out.println("Trim: " + ("  Hello  ".trim()));
    System.out.println("Is Empty: " + s1.isEmpty());
  }
}

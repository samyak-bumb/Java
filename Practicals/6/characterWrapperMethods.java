class characterWrapperMethods {

  public static void main(String[] args) {
    Character ch = 'A';

    System.out.println("Character: " + ch);
    System.out.println("isLetter(): " + Character.isLetter(ch));
    System.out.println("isDigit('5'): " + Character.isDigit('5'));
    System.out.println("isLowerCase('a'): " + Character.isLowerCase('a'));
    System.out.println("isUpperCase('A'): " + Character.isUpperCase('A'));
    System.out.println("toLowerCase('A'): " + Character.toLowerCase('A'));
    System.out.println("toUpperCase('b'): " + Character.toUpperCase('b'));
    System.out.println("isWhitespace(' '): " + Character.isWhitespace(' '));
  }
}

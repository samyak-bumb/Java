// Strings represent text in Java and are IMMUTABLE (cannot be changed once created).

public class strings {

  public static void main(String[] args) {
    // Creating strings
    String greeting = "Jai, Jinendra!";
    String name = "idk";

    // String concatenation → joining strings
    String personalizedGreeting = greeting + " My name is " + name + ".";
    System.out.println(personalizedGreeting);

    // =====================================================
    //  COMMON STRING METHODS (BASIC OPERATIONS)
    // =====================================================

    // 1. length() → returns number of characters
    int length = personalizedGreeting.length();
    System.out.println("1. Length: " + length);

    // 2. toUpperCase(), toLowerCase() → change case
    System.out.println("2. Uppercase: " + personalizedGreeting.toUpperCase());
    System.out.println("   Lowercase: " + personalizedGreeting.toLowerCase());

    // 3. contains() → checks if substring exists
    System.out.println(
      "3. Contains name? " + personalizedGreeting.contains(name)
    );

    // 4. substring() → extracts part of the string
    String subString = personalizedGreeting.substring(7, 18);
    System.out.println("4. Substring (7 to 18): " + subString);

    // 5. charAt() → returns character at index
    System.out.println(
      "5. Character at index 5: " + personalizedGreeting.charAt(5)
    );

    // =====================================================
    //  POSITION & SEARCH METHODS
    // =====================================================

    // 6. indexOf(), lastIndexOf() → search positions
    System.out.println(
      "6. First index of 'a': " + personalizedGreeting.indexOf('a')
    );
    System.out.println(
      "   Last index of 'a': " + personalizedGreeting.lastIndexOf('a')
    );

    // 7. equals(), equalsIgnoreCase() → compare strings
    System.out.println("7. Equals 'idk'? " + name.equals("idk"));
    System.out.println(
      "   EqualsIgnoreCase 'IDK'? " + name.equalsIgnoreCase("IDK")
    );

    // 8. startsWith(), endsWith() → check beginning/end
    System.out.println("8. Starts with 'Jai'? " + greeting.startsWith("Jai"));
    System.out.println("   Ends with '!': " + greeting.endsWith("!"));

    // =====================================================
    //  MODIFYING STRING CONTENT
    // =====================================================

    // 9. replace() → replace part of the string
    System.out.println(
      "9. Replace 'idk' → 'Friend': " +
      personalizedGreeting.replace("idk", "Friend")
    );

    // 10. trim() → removes outer spaces
    String spaced = "   Hello World   ";
    System.out.println("10. Trimmed: '" + spaced.trim() + "'");

    // =====================================================
    //  SPLIT & CHECKING METHODS
    // =====================================================

    // 11. split() → splits string into array
    System.out.println("11. Split words:");
    String[] words = personalizedGreeting.split(" ");
    for (String w : words) {
      System.out.println("   " + w);
    }

    // 12. isEmpty(), isBlank() → check for empty/blank
    String emptyString = "";
    System.out.println("12. isEmpty(): " + emptyString.isEmpty());
    System.out.println("    isBlank() on '   ': " + "   ".isBlank());

    // =====================================================
    //  COMPARISON & EXTRA METHODS
    // =====================================================

    // 13. compareTo() → compares alphabetically
    System.out.println("13. Compare 'abc' to 'abd': " + "abc".compareTo("abd"));

    // 14. concat() → joins strings
    System.out.println("14. Concat: " + greeting.concat(" Welcome!"));

    // 15. valueOf() → converts values to string
    int n = 123;
    System.out.println("15. String.valueOf(): " + String.valueOf(n));
  }
}

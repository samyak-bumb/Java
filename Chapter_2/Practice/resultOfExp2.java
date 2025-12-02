public static void main(String[] args) {
  int x = 7;

  // Expression: a = 7 + 49/7 + 35/7
  // Division has higher precedence than addition
  // So Java solves: (49/7) and (35/7) before adding

  int a = 7 + 49 / 7 + 35 / 7;

  // Step-by-step:
  // 49 / 7 = 7   → integer division
  // 35 / 7 = 5   → integer division
  // Then a = 7 + 7 + 5 = 19

  System.out.println("Value of a = " + a); // prints 19
}

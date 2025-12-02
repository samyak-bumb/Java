public static void main(String[] args) {
  // Given: float a = 7/4 * 9/2

  // Issue: without 'f', Java does INTEGER division → loses decimals.
  // Fix: use float literals (7f, 9f) so every operation happens in FLOAT.

  float a = ((7f / 4) * 9f) / 2;
  //   ===
  // Precedence note:
  // 1) () parentheses are solved first → highest precedence
  // 2) Inside them, / and * have equal precedence → solved left to right
  // 3) Final / 2 is applied after multiplication
  //   ===

  // Step-by-step:
  // Step 1: (7f / 4) = 1.75       // float division
  // Step 2: 1.75 * 9f = 15.75      // same precedence, left→right
  // Step 3: 15.75 / 2 = 7.875      // final division

  System.out.println(a); // Output: 7.875
}

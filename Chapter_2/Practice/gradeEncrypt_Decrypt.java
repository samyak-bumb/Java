public static void main(String[] args) {
  char grade = 'B';
  // TODO: Explain Typecasting
  //   Encrypting the grade
  grade = (char) (grade + 1);
  System.out.println("Your new grade is " + grade);

  // Decrypting the grade
  grade = (char) (grade - 1);
  System.out.println("Your original grade is " + grade);
}

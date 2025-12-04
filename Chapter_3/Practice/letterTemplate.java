public static void main(String[] args) {
  // This is the base template of the letter.
  // <|name|> is a placeholder that we will replace later.
  String letter = "Dear <|name|>, Thanks a lot";

  // replace(oldValue, newValue)
  // This method replaces the placeholder <|name|> with the actual name.
  // Here we are replacing <|name|> → "Idk"
  String filledLetter = letter.replace("<|name|>", "Idk");

  // Prints the final letter with the name filled in.
  System.out.println(filledLetter);
}

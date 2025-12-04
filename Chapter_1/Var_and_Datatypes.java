/**
 * Day 01 - Var_and_Datatypes.java
 * Understanding Variables & Data Types
 */

// Primitive data types (Interinic)
/*
 * int: Integer data type for whole numbers
 * - Range -(2^32)/2 to +(2^32)/2 - 1
 * - Size 4 bytes (32 bits)
 *
 * double: Floating-point data type for decimal numbers
 * - size 8 bytes (64 bits)
 *
 * char: Character data type for single characters
 * - Range 0 to 65,535 (Unicode characters)
 * - Size 2 bytes (16 bits)
 *
 * boolean: Boolean data type for true/false values
 * Size depends on the JVM implementation (typically 1 bit)
 *
 * float: Floating-point data type for single-precision decimal numbers
 * - Size 4 bytes (32 bits)
 *
 * short: Short integer data type for smaller whole numbers
 * - Range -(2^16)/2 to +(2^16)/2 - 1
 * - Size 2 bytes (16 bits)
 *
 * long: Long integer data type for larger whole numbers
 * - Range -(2^64)/2 to +(2^64)/2 - 1
 * - Size 8 bytes (64 bits)
 *
 * byte: Byte data type for very small whole numbers
 * - Range -128 to +127
 * - Size 1 byte (8 bits)
 */

// Non-Primitive data types in Java (Derived)
/*
 * Classes: Blueprint for creating objects
 * Objects: Instances of classes
 * String: Sequence of characters for text
 * Arrays: Collection of elements of the same type
 * Interfaces: Contract for classes to implement methods
 * Enums: Special data type for a fixed set of constants
 */

public static void main(String[] args) {
  System.out.println("sum");
  int a = 5;
  int b = 10;
  int sum = a + b;
  System.out.println("the sum of " + sum);
}

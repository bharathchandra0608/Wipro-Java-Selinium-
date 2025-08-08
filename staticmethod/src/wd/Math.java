package wd;

public class Math {

    // Static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to print a message
    public static void greet() {
        System.out.println("Welcome to Math!");
    }

    public static void main(String[] args) {
        // Calling static methods directly using class name (recommended)
        Math.greet();  // Output: Welcome to MathUtility!
        
        int result = Math.add(10, 20);
        System.out.println("Sum: " + result);  // Output: Sum: 30
    }
}

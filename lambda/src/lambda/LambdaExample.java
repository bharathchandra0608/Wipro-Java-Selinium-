package lambda;
interface MathOperation {
    int operate(int a, int b);  
}

public class LambdaExample {
	 public static void main(String[] args) {

	        MathOperation addition = (a, b) -> a + b;

	        MathOperation subtraction = (a, b) -> a - b;

	        MathOperation multiplication = (a, b) -> a * b;

	        MathOperation division = (a, b) -> b != 0 ? a / b : 0;

	        System.out.println("Addition: " + addition.operate(10, 5));        // 15
	        System.out.println("Subtraction: " + subtraction.operate(10, 5));  // 5
	        System.out.println("Multiplication: " + multiplication.operate(10, 5)); // 50
	        System.out.println("Division: " + division.operate(10, 5));        // 2
	    }
}

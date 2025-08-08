package abstractt;

abstract class Shape {
   
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 4;
    
    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class ClassShape {

	public static void main(String[] args) {
		Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area(); 
        s2.area(); 
		

	}

}

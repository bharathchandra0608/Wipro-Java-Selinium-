package constructors;

public class student {
    String name;
    int age;

    
    public student() {
        name = "Unknown";
        age = 0;
    }

    public student(String n) {
        name = n;
        age = 0;
    }

    public student(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        student s1 = new student();             
        student s2 = new student("bharath");      
        student s3 = new student("chandra", 22); 

        s1.display();
        s2.display();
        s3.display();
    }
}
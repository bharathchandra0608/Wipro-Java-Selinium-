package polymorphism;

public class MethodOverloading {
        public static void meLoad(String name , int age) {
        	System.out.println("name is " + name + "age is " + age);
        }
        
        
        public static void meLoad(int age , int rollNum , int marks ) {
        	System.out.println("age of me is " + age + " with roll number " + rollNum + " having marks " +marks );
        }
        
       public static void main(String [] args) {
    	   String sairam = "sairam";
    	   meLoad(23 , 12,100);
    	   meLoad("balu" , 100);
       }
}

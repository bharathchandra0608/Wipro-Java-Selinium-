package classobject;

class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }

    void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("------------------------");
    }
}

public class bookdetails {

	public static void main(String[] args) {
		 Book b1 = new Book("Java for Beginners", 450.0);
	        Book b2 = new Book("Python Made Easy", 399.0);
	        Book b3 = new Book("Data Structures", 650.0);

	        b1.displayDetails();
	        b2.displayDetails();
	        b3.displayDetails();

	}

}

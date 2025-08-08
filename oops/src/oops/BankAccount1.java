package oops;

class BankAccount {
    private double balance;  

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}

public class BankAccount1 {

	public static void main(String[] args) {
		 BankAccount myAccount = new BankAccount();

	        myAccount.deposit(1000);     
	        myAccount.withdraw(500);     
	        myAccount.withdraw(600);   
	        System.out.println("Current Balance: " + myAccount.getBalance());

	}

}

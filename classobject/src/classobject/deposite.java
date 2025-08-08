package classobject;

class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class deposite {

	public static void main(String[] args) {
		 BankAccount myAccount = new BankAccount(1000);

	        myAccount.showBalance();    
	        myAccount.deposit(500);     
	        myAccount.withdraw(300);    
	        myAccount.withdraw(1500);   
	        myAccount.showBalance();
	}

}

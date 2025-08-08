package exception;

import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    public static final int CORRECT_PIN = 1234;
    public static double currentBalance = 1000.00; 
    public static void validatePin(int enteredPin) throws InvalidPinException {
        if (enteredPin != CORRECT_PIN) {
            throw new InvalidPinException("Invalid PIN entered!");
        }
    }

    public static double withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (currentBalance < amount) {
            throw new InsufficientBalanceException("Insufficient balance. Your current balance is Rs. " + currentBalance);
        }
        currentBalance -= amount;
        return currentBalance;
    }
}

public class ATMCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinAttempts = 0;
        final int MAX_ATTEMPTS = 3; 
        String transactionOutcome = "Transaction not initiated."; 

        System.out.println("Insert ATM Card....");

        try { 
            boolean pinValidated = false;
            while (pinAttempts < MAX_ATTEMPTS) {
                System.out.print("Enter your 4-digit PIN: ");
                int pin = sc.nextInt();

                try {
                    ATM.validatePin(pin);
                    System.out.println("PIN verified! Access granted.");
                    pinValidated = true;
                    transactionOutcome = "PIN validated successfully.";
                    break; 
                } catch (InvalidPinException e) {
                    pinAttempts++;
                    System.out.println("Access Denied: " + e.getMessage());
                    if (pinAttempts < MAX_ATTEMPTS) {
                        System.out.println("You have " + (MAX_ATTEMPTS - pinAttempts) + " attempt(s) remaining.");
                    } else {
                        System.out.println("Card blocked. Too many incorrect PIN attempts.");
                        transactionOutcome = "Transaction failed: Card blocked for 24 hours due to incorrect PIN.";
                        return; 
                    }
                }
            }

            if (pinValidated) {
                System.out.println("Current Balance: Rs. " + ATM.currentBalance);
                System.out.print("Enter amount to withdraw: Rs. ");
                double withdrawAmount = sc.nextDouble();

                try {
                    double newBalance = ATM.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful. Remaining Balance: Rs. " + newBalance);
                    transactionOutcome = "Withdrawal successful of Rs. " + withdrawAmount;
                } catch (InsufficientBalanceException e) {
                    System.err.println("Withdrawal Failed: " + e.getMessage());
                    transactionOutcome = "Withdrawal failed: " + e.getMessage();
                } catch (IllegalArgumentException e) {
                    System.err.println("Withdrawal Failed: " + e.getMessage());
                    transactionOutcome = "Withdrawal failed: Invalid amount entered.";
                }
            }
        } catch (Exception e) {
          
            System.err.println("An unexpected error occurred during the transaction: " + e.getMessage());
            transactionOutcome = "Transaction failed: Unexpected error - " + e.getClass().getSimpleName();
        } finally {
            
            System.out.println("\n--- Transaction Log ---");
            System.out.println("Timestamp: " + new java.util.Date());
            System.out.println("Final Transaction Outcome: " + transactionOutcome);
            System.out.println("-----------------------");
            sc.close(); 
            System.out.println("Transaction session ended. Please remove your card.");
        }
    }
}
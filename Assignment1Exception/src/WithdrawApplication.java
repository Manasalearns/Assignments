import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class IllegalBankTransactionException extends Exception {
    public IllegalBankTransactionException(String message) {
        super(message);
    }
}

class SavingAccount {
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if (amount < 0) {
            throw new IllegalBankTransactionException("Cannot withdraw a negative amount");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class WithdrawApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        double balance = scanner.nextDouble();

        SavingAccount savingAcc = new SavingAccount(balance);

        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            savingAcc.withdraw(amount);
            System.out.println("Withdrawal successful. New balance: " + savingAcc.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance. Please enter a lower amount.");
        } catch (IllegalBankTransactionException e) {
            System.out.println("Illegal bank transaction. Please enter a positive amount.");
        }
    }
}

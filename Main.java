import java.util.ArrayList;
import java.util.List;

interface Account {
  void deposit(double amount);
  void withdraw(double amount);
  double calculateInterest();
  double getBalance();
}

class SavingsAccount implements Account {
  private double balance;
  private double interestRate;

    SavingsAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    CurrentAccount(double initialDeposit, double overdraftLimit) {
        this.balance = initialDeposit;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class Bank {
    private List<Account> accounts;

    Bank() {
        accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 1.25);
        CurrentAccount currentAccount = new CurrentAccount(5000, 1000.0);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(1000);
        currentAccount.deposit(40);

        savingsAccount.withdraw(150);

        System.out.println("Account balance - Savings: " + savingsAccount.getBalance());
        System.out.println("Account balance - Current: " + currentAccount.getBalance());

        double interest = savingsAccount.calculateInterest();
        System.out.println("Interest earned on savings account: " + interest);

        savingsAccount.deposit(interest);
        
        System.out.println("After applying interest - Savings: " + savingsAccount.getBalance());
        System.out.println("After applying interest - Current: " + currentAccount.getBalance());
    }
}
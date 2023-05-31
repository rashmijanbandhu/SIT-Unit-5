class BankAccount {
    double balance;
    Object lock = new Object();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
       // synchronized (lock) {
            balance += amount;
      //  }
    }

    public void withdraw(double amount) {
        //synchronized (lock) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
       //}
    }

    public double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class Sync {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        DepositThread depositThread = new DepositThread(account, 500);
        WithdrawThread withdrawThread = new WithdrawThread(account, 200);

        depositThread.start();
        withdrawThread.start();

        // depositThread.join();
        // withdrawThread.join();

        System.out.println("Current balance: " + account.getBalance());
    }
}


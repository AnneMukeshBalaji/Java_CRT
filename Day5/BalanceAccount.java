package Day5;

public class BalanceAccount {
  private String accountHolder;
  private String accountNumber;
  private double balance;

  public BalanceAccount(String accountHolder, String accountNumber, double balance) {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void deposite(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposite : " + amount);
    } else {
      System.out.println("Invalid Amount ");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdraw : " + amount);
    } else {
      System.out.println("Insuficient fund or invalid amount!");
    }
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAccountHolder() {
    return this.accountHolder;
  }

  public String getAccountName() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }
}

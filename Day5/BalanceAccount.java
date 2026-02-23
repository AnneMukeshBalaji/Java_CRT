package Day5;

public class BalanceAccount {
  private String accountHolder;
  private String accountNumber;
  private double balance;

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

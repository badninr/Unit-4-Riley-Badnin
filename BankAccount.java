import java.text.DecimalFormat;

public class BankAccount {

  //----------------------------------------------------------------------------

  //Variables
  private double balance;

  //----------------------------------------------------------------------------

  //Constructor
  public BankAccount() {
    balance = 10000.0;
  }

  //----------------------------------------------------------------------------

  //Getters
  public double getBalance(){
    return balance;
  }

  //----------------------------------------------------------------------------

  //Decimal format for money
  DecimalFormat money = new DecimalFormat ("######0.00");

  //----------------------------------------------------------------------------

  //Methods
  public void withdrawl(double withdrawlAmt){
    balance = balance - withdrawlAmt;
    System.out.println("You made a withdrawl of $" + money.format(withdrawlAmt) + ".");
    if (balance < 0){
      System.out.println("You're now in debt.");
    }
  }

  public void deposit(double depositAmt){
    balance = balance - depositAmt;
    System.out.println("You made a deposit of $" + money.format(depositAmt) + ".");
  }

  public String toString(){
    String balanceReport = "Your current balance is $" + money.format(balance) + ".";
    return balanceReport;
  }

  //----------------------------------------------------------------------------
}

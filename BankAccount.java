import java.text.DecimalFormat;

public class BankAccount {

  //----------------------------------------------------------------------------

  //Variables
  private double checkingBalance;
  private double savingsBalance;
  private String name;
  private int accountNum;
  private double interestRate;


  //----------------------------------------------------------------------------

  //Constructor
  public BankAccount() {
    checkingBalance = 5000.0;
    savingsBalance = 10000.0;
    accountNum = (int)((Math.random()*100000)+100000);
    interestRate = 1.09;
  }

  //----------------------------------------------------------------------------

  //Getters
  public double getCheckingBalance(){
    return checkingBalance;
  }

  public double getSavingsBalance(){
    return savingsBalance;
  }

  //----------------------------------------------------------------------------

  //Decimal format for money
  DecimalFormat money = new DecimalFormat ("#,###,###,###,###,###,##0.00");

  //----------------------------------------------------------------------------

  //Methods
  public void savingsWithdrawl(double savingsWithdrawlAmt){
    savingsBalance = savingsBalance - savingsWithdrawlAmt;
    System.out.println("You made a savings withdrawl of $" + money.format(savingsWithdrawlAmt) + ".");
    if (savingsBalance < 0){
      System.out.println("You're now in debt.");
    }
  }

  public void savingsDeposit(double savingsDepositAmt){
    savingsBalance = savingsBalance + savingsDepositAmt;
    System.out.println("You made a savings deposit of $" + money.format(savingsDepositAmt)
     + ". After interest, your new savings balance is $" + (savingsBalance*interestRate) + ".");
    savingsBalance = savingsBalance*interestRate;
  }

  public void checkingWithdrawl(double checkingWithdrawlAmt){
    checkingBalance = checkingBalance - checkingWithdrawlAmt;
    System.out.println("You made a checking withdrawl of $" + money.format(checkingWithdrawlAmt) + ".");
    if (checkingBalance < 0){
      System.out.println("You're now in debt.");
    }
  }

  public void checkingDeposit(double checkingDepositAmt){
    checkingBalance = checkingBalance + checkingDepositAmt;
    System.out.println("You made a checking deposit of $" + money.format(checkingDepositAmt) + ".");
  }

  public void setName(String nameInput){
    name = nameInput;
  }

  public String toString(){
    String balanceReport = "------------------------------\nAccount name: " + name +
    " \nAccount number: " + accountNum +
     "\nCurrent checking balance: $" + money.format(checkingBalance) +
     "\nCurrent savings balance: $" + money.format(savingsBalance) +
     "\n------------------------------";
    return balanceReport;
  }

  //----------------------------------------------------------------------------
}

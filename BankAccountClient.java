import java.util.Scanner;

public class BankAccountClient {
  public static void main(String[] args) {
    System.out.println("Your checking balance is $5,000 and your savings balance is $10,000.
    Your savings interest rate is 0.09% ");

    //--------------------------------------------------------------------------

    //Creating Scanner and Bank Account objects
    BankAccount myAccount = new BankAccount();
    Scanner scan = new Scanner(System.in);

    //Asking for name
    System.out.println("What name would you like your account under?");
    String name = scan.next();
    myAccount.setName(name);

    //--------------------------------------------------------------------------

    //Begin While loop for however long the user wants to interact with account
    boolean accessAccount = true;
    while (accessAccount){

    //--------------------------------------------------------------------------

        //Asking what account user would like to change
        System.out.println("Would you like to access your checking or savings account?");
        String acctChoice = scan.next();

        //----------------------------------------------------------------------

        //Asking what user would like to do
        System.out.println("Would you like to make a deposit or withdrawl?");
        String response = scan.next();

        //----------------------------------------------------------------------

        //Begin While loop for checking if user input is valid
        boolean inputsValid = false;
        while (inputsValid == false) {

        //----------------------------------------------------------------------

          //Checking checking inputs
          if (acctChoice.equals("checking")){
              if(response.equals("withdrawl")){
                  inputsValid = true;
                  System.out.println("How much would you like to withdraw?");
                  double withdrawlAmt = scan.nextDouble();
                  myAccount.checkingWithdrawl(withdrawlAmt);
                  System.out.println(myAccount.toString());

              } else if(response.equals("deposit")){
                  inputsValid = true;
                  System.out.println ("How much would you like to deposit?");
                  double depositAmt = scan.nextDouble();
                  myAccount.checkingDeposit(depositAmt);
                  System.out.println(myAccount.toString());

              } else{
                  System.out.println("Not a valid answer.");
                  System.out.println("Would you like to make a deposit or withdrawl?");
                  response = scan.next();
                  inputsValid = false;
              }
          }

          //----------------------------------------------------------------------

          //Checking savings inputs
          else if (acctChoice.equals("savings")){
            if(response.equals("withdrawl")){
                inputsValid = true;
                System.out.println("How much would you like to withdraw?");
                double withdrawlAmt = scan.nextDouble();
                myAccount.savingsWithdrawl(withdrawlAmt);
                System.out.println(myAccount.toString());

            } else if(response.equals("deposit")){
                inputsValid = true;
                System.out.println ("How much would you like to deposit?");
                double depositAmt = scan.nextDouble();
                myAccount.savingsDeposit(depositAmt);
                System.out.println(myAccount.toString());

            } else{
                System.out.println("Not a valid answer.");
                System.out.println("Would you like to make a deposit or withdrawl?");
                response = scan.next();
                inputsValid = false;
            }
        }

    //--------------------------------------------------------------------------

      //Ending While loop for checking user inputs
      }

    //--------------------------------------------------------------------------

        //Checking if user wants to interact anymore
        System.out.println("Would you like to do anything else? Type y or n.");
        String again = scan.next();
        if (again.equals("y")){
          accessAccount = true;
        } else if (again.equals("n")){
          accessAccount = false;
        } else {
          System.out.println("Not a valid input.");
        }

      //------------------------------------------------------------------------

      //Ending While loop for seeing if user would like to interact
      }

    //--------------------------------------------------------------------------

  }
}

/*
A Simple Car Loan Payment Calculator
  Calculate the monthly car payment a user should expect to make after taking out a car loan.
  Will include:
    Car loan amount
    Interest rate of the loan
    Length of the loan (in years)
    Down payment 
*/
public class CarLoan {

    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        //Check if the load is valid.
        if(loanLength <= 0 || interestRate <=0) {
            System.out.println("Error! You must take out a valid car loan.");
        }
        //Check if the car can be paid without loan
        else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        }
        //Calculate the auto loan.
        else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Monthly Payment: $" + monthlyPayment);
        }
    }
}

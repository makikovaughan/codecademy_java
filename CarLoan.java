/*
A Simple Car Loan Payment Calculator
  Calculate the monthly car payment a user should expect to make after 
taking out a car loan.
  Will include:
    Car loan amount
    Interest rate of the loan
    Length of the loan (in years)
    Down payment
*/
public class CarLoan {

    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    public CarLoan() {
        carLoan = 10000;
        loanLength = 3;
        interestRate = 5;
        downPayment = 2000;
    }

    public static void main(String[] args) {

        CarLoan myCar = new CarLoan();

        //Check if the load is valid.
        if(myCar.loanLength <= 0 || myCar.interestRate <=0) {
            System.out.println("Error! You must take out a valid car 
loan.");
        }
        //Check if the car can be paid without loan
        else if (myCar.downPayment >= myCar.carLoan) {
            System.out.println("The car can be paid in full.");
        }
        //Calculate the auto loan.
        else {
            int remainingBalance = myCar.carLoan - myCar.downPayment;
            int months = myCar.loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * myCar.interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Monthly Payment: $" + monthlyPayment);
        }
    }
}


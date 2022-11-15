/*
This is a calculator.
It was created by Makiko Vaughan in 2022.
*/

//Class: Calculator
public class Calculator {

    //Constructor
    public Calculator() {

    }

    //Method: add() returns integer
    public int add(int a, int b) {
        return a + b;
    }

    //Method: subtract() returns integer
    public int subtract(int a, int b) {
        return a - b;
    }

    //Method: multiply() returns integer
    public int multiply(int a, int b) {
        return a * b;
    }

    //Method: divide() returns integer
    public int divide(int a, int b) {
        return a / b;
    }

    //Method: modulo() returns integer
    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        //Calculator object variable
        Calculator myCalculator = new Calculator();

        //Render the value of add() method
        System.out.println("5 + 7 = " + myCalculator.add(5, 7));

        //Render the value of subtract() method
        System.out.println("45 - 11 = " + myCalculator.subtract(45, 11));

        //Render the value of modulo() method
        System.out.println("45 % 11 = " + myCalculator.modulo(45, 11));

        //Render the value of divide() method
        System.out.println("40 / 5 = " + myCalculator.divide(40, 5));


    }
}
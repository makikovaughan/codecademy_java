// Import statement:
import java.util.ArrayList;

class PrimeDirective {

    // Add your methods here:
    public static boolean isPrime(int number) {

    /*
    Use loop to modulo the number from 2 to number - 1
    if the modulo is 0, then return false.
    if it goes up to number - 1, and modulo is not 0, then it's a prime number and return true.
    */

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        if(number == 2) {
            return true;
        }
        else if(number < 1){
            return false;
        }
        else {
            return true;
        }
    }

    //Return ArrayList of integers
    public static ArrayList<Integer> onlyPrimes(int[] numbers) {

        //Create a varibale of ArrayList
        ArrayList<Integer> primes = new ArrayList<Integer>();

        //Add prime number to Array List
        for(int number : numbers) {
            if(isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    //Check the number of arrays is even or odd
    public void checkOddEven(int[] number) {
        for(int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 0) {
                System.out.println(number[i] + " is even number");
            }
            else {
                System.out.println(number[i] + " is odd number");
            }
        }
    }

    // Check if the number is fibonacci
    public static boolean isFibonacci(int number) {

        if (number == 0 || number == 1) {
            return true;
        }
        else if(number < 0) {
            return false;
        }

        int n0 = 0, n1 = 1, fibonacci = 0;

        for(int i = 2; i <= number; i++) {
            fibonacci = n0 + n1;
            if(number == fibonacci) {
                return true;
            }
            n0 = n1;
            n1 = fibonacci;
        }
        return false;
    }

    // Return fibonacci array list
    public static ArrayList<Integer> onlyFibonacci(int[] numbers) {

        //Create a varibale of ArrayList
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        //Add prime number to Array List
        for(int number : numbers) {
            if(isFibonacci(number)) {
                fibonacci.add(number);
            }
        }
        return fibonacci;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        //Test the isPrime() method
        System.out.println("7 is " + pd.isPrime(7));
        System.out.println("28 is " + pd.isPrime(28));
        System.out.println("2 is " + pd.isPrime(2));
        System.out.println("0 is " + pd.isPrime(0));

        //Test out pd.onlyPrimes()
        System.out.println(pd.onlyPrimes(numbers));

        //Call checkOddEven()
        pd.checkOddEven(numbers);

        //Test isFibonnaci
        System.out.println(isFibonacci(610));
        System.out.println(isFibonacci(609));

        //Call pd.onlyFibonacci()
        System.out.println(pd.onlyFibonacci(numbers));
    }

}

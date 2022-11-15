/*
Write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:

For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print FizzBuzz.
*/

//Import ArrayList package
import java.util.ArrayList;

public class FizzBuzz {

    //Method to add 1 to 100 in the array list
    public static ArrayList<Integer> addArrayList (ArrayList<Integer> myArray) {
        for(int i = 0; i < 100; i++ ) {
            myArray.add(i + 1);
        }
        return myArray;
    }

    //Render Fizz Buzz
    public static void renderArrayList (ArrayList<Integer> myArray) {

        for(int num : myArray) {
            if((num % 3 == 0) && (num % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if(num % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(num % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {

        //Create an Array List
        ArrayList<Integer> myFizzBuzz = new ArrayList<Integer>();

        //Add 1 to 100 to the array list
        myFizzBuzz = addArrayList(myFizzBuzz);

        //Render the array list with Fizz Buzz
        renderArrayList(myFizzBuzz);

    }
}
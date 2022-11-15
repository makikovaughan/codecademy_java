public class Magic2 {

    public static void main(String[] args) {
        //original number
        int myNumber = 810;

        //Set it equal to the original number (myNumber) multiplied by itself.
        int magicNumber = myNumber * myNumber;

        //Set it equal to the previous result plus the original number (myNumber).
        magicNumber += myNumber;

        //Set it equal to the previous result divided by the original number.
        magicNumber /= myNumber;

        //Set it equal to the previous result plus 17.
        magicNumber += 17;

        //Set it equal to the previous result minus the original number.
        magicNumber -= myNumber;

        //Set it equal to the previous result divided by 6.
        magicNumber /= 6;

        //Print out the value of the last step.
        System.out.println("Magic Number is: " + magicNumber);
    }
}

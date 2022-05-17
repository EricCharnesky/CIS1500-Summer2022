package chapter2;

public class Chapter2 {
    public static void main(String[] args) {

        // declaring a variable
        int yourNumber;

        // assign the value 10 to the variable yourNumber
        yourNumber = 10;

        System.out.println("Your number is:" + yourNumber);

        // declare and assign - I like this way
        int myFavoriteNumber = 42;

        System.out.println("My favorite number is: " + myFavoriteNumber);

        double numberWithADecimal = 7.7;

        yourNumber = 12;

        // a double can hold and int
        numberWithADecimal = 12;

        // java doesn't care about your variable names
        // people care you your variable names
        int a = 10;
        int b = 20;
        int c = 30;


        // but an int can't hold a double
        // yourNumber = 7.7;

        numberWithADecimal = yourNumber;

        System.out.println("Number with a decmial's value is: " + numberWithADecimal);

        System.out.println("Your number is:" + yourNumber);
    }
}

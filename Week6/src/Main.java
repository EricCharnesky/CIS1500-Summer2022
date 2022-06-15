import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Chair ericsChair = new Chair();
        ericsChair.setColor("black");
        ericsChair.setHasArms(true);
        ericsChair.setMinimumHeightInCentimeters(20);
        ericsChair.setMaximumHeightInCentimeters(40);
        ericsChair.adjustChairHeight(5);
        printChairDetails(ericsChair, "Eric");
        ericsChair.adjustChairHeight(-10);
        printChairDetails(ericsChair, "Eric");
        ericsChair.adjustChairHeight(100);
        printChairDetails(ericsChair, "Eric");
        ericsChair.adjustChairHeight(-100);
        printChairDetails(ericsChair, "Eric");

        Chair jebsChair = new Chair();
        jebsChair.setColor("grey");
        jebsChair.setHasArms(false);
        printChairDetails(jebsChair, "Jeb");

    }

    public static void printChairDetails(Chair chair, String ownersName){
        System.out.println(ownersName + "'s chair color is: " + chair.getColor());
        System.out.println(ownersName + "'s chair has arms: " + chair.hasArms());
        System.out.println(ownersName + "'s chair height in cm is: " + chair.getHeightInCentimeters());

    }
}
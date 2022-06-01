package project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = keyboard.nextLine();

        System.out.println(name + ", how many kittens do you have?");
        int numberOfKittens = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", how many weeks old are the kittens?");
        int ageInWeeks = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", what is their average weight in grams?");
        int averageWeightInGrams = Integer.parseInt(keyboard.nextLine());

        if ( ageInWeeks <= 4 ){
            double formulaNeededPerDay = averageWeightInGrams / 100.0 * 5 * numberOfKittens;
            double formulaNeededPerWeek = formulaNeededPerDay * 7;
            System.out.println("You will need to buy " + formulaNeededPerWeek + "mls formula for the week");
        } else if ( ageInWeeks <= 8 ){
            double formulaNeededPerDay = 20 * numberOfKittens;
            double formulaNeededPerWeek = formulaNeededPerDay * 7;
            System.out.println("You will need to buy " + formulaNeededPerWeek + "mls formula for the week");

            double gramsOfWetFoodPerDay = averageWeightInGrams / 100.0 * 10 * numberOfKittens;
            double gramsOfWetFoodPerWeek = gramsOfWetFoodPerDay * 7;

            System.out.println("You will need to buy " + gramsOfWetFoodPerWeek + " grams of wet food for the week");
        } else {
            double gramsOfWetFoodPerDay = 100 * numberOfKittens;
            double gramsOfWetFoodPerWeek = gramsOfWetFoodPerDay * 7;
            System.out.println("You will need to buy " + gramsOfWetFoodPerWeek + " grams of wet food for the week");
        }

    }
}
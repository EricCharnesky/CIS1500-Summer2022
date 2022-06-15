import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String choice = "";
        int turnCount = 0;

        while (!choice.equalsIgnoreCase("get me out of here!")){
            choice = getPlayerChoice();
            if (checkForValidChoice(choice)){
                turnCount++;
            }
        }

        System.out.println("You got out of the game in " + turnCount + " turns!");

    }

    public static boolean checkForValidChoice(String choice){
        Scanner keyboard = new Scanner(System.in);

        if ( choice.equalsIgnoreCase("go north")){
            System.out.println("You go north towards the forest");
        } else if ( choice.equalsIgnoreCase("go east")){
            System.out.println("You go east towards the mountains");
        }else if ( choice.equalsIgnoreCase("go south")){
            System.out.println("You go south towards the ocean");
        }else if ( choice.equalsIgnoreCase("go west")){
            System.out.println("You go west towards the swamp");
        }else if ( choice.equalsIgnoreCase("jump")){
            System.out.println("You jump up and down");
        }else if ( choice.equalsIgnoreCase("hide")){
            System.out.println("You hide from the monster");
        }else if ( choice.equalsIgnoreCase("eat")){
            System.out.println("You eat some beans");
        }else if ( choice.equalsIgnoreCase("fight")){
            System.out.println("You fight the monster and get wounded, you need to sleep to recover");
            String sleep = "";
            while (!sleep.equalsIgnoreCase("sleep")){
                System.out.println("You need to sleep");
                sleep = keyboard.nextLine();
            }
            System.out.println("You sleep and feel all better!");
        } else if (choice.equalsIgnoreCase("get me out of here!")){
            // nothing happens
        }

        else{
            System.out.println("You can, 'go north', 'go east', 'go south', 'go west'" +
                    " 'jump', 'hide', 'eat', and 'fight'");
            return false;
        }
        return true;
    }

    public static String getPlayerChoice(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What do you want to do?");
        String choice = keyboard.nextLine();
        return choice;
    }
}
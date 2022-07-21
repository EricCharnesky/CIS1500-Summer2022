import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numberOfValues = 0;

        while (numberOfValues < 3 || numberOfValues > 10) {

            System.out.println("Please enter the number of values for the ticket 3-10 ");
            numberOfValues = Integer.parseInt(keyboard.nextLine());
        }

        int maxValue = 0;

        while (maxValue > 100 || maxValue < 1) {

            System.out.println("Please enter the max value for the numbers, no more than 100 ");
            maxValue = Integer.parseInt(keyboard.nextLine());
        }

        LottoTicket winningTicket = new LottoTicket(numberOfValues, maxValue);
        System.out.println("Winning Ticket:");
        printTicket(winningTicket);

        LottoTicket anotherTicket = new LottoTicket(numberOfValues, maxValue);

        int numberOfTicketsUntilFindingAWinner = 1;

        while (!anotherTicket.isWinner(winningTicket)){
            anotherTicket = new LottoTicket(numberOfValues, maxValue);
            printTicket(anotherTicket);
            numberOfTicketsUntilFindingAWinner++;
        }

        System.out.println("It took " + numberOfTicketsUntilFindingAWinner + " tickets to find a winner!");
    }


    public static void printTicket(LottoTicket ticket){
        for ( int number : ticket.getNumbers()){
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare new scanner
        int userInput;
        Scanner sc = new Scanner(System.in);

        // create Dice objects
        Dice diceOne = new Dice();
        Dice diceTwo = new Dice();

        // while loop to repeat input prompt
        while(true) {
            System.out.println("-----------------");
            System.out.println("1 - Roll Dice");
            System.out.println("2 - Exit Program");
            System.out.println("-----------------");
            userInput = sc.nextInt();

            if(userInput == 1) {
                System.out.print("[" + diceOne.roll() + "]");
                System.out.println("[" + diceTwo.roll() + "]");
            }
            else if (userInput == 2) {
                System.out.println("Exiting Program");
                return;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomInt = random.nextInt(3);
        String ComputerMove = null;
        String OurMove;
        HashMap<Integer, String> moves = new HashMap<>();
        moves.put(0, "ROCK");
        moves.put(1, "PAPER");
        moves.put(2, "SCISSORS");
        System.out.println("Welcome to Rock-Paper-Scissors! Please enter \"rock\", \"paper\", \"scissors\", or \"quit\" to exit.");
        System.out.println("Please choose your move: ");
        while (true) {
            OurMove = scanner.nextLine();
            if (OurMove.equalsIgnoreCase("rock") ||
                    OurMove.equalsIgnoreCase("paper") ||
                    OurMove.equalsIgnoreCase("scissors")) {
                ComputerMove = moves.get(randomInt);
                break;
            } else if (OurMove.equalsIgnoreCase("quit")){
                System.out.println("Thanks for trying!");
                break;
            } else {
                System.out.println("Wrong type, please try again!");
            }
        }
        if (ComputerMove != null) {
            System.out.println("RESULT: \n"+ "Your move: " + OurMove + "\n" + "Computer move: " + ComputerMove);
            if (OurMove.equalsIgnoreCase("rock") && ComputerMove.equals("ROCK"))
                System.out.println("ITS A TIE!");
            if (OurMove.equalsIgnoreCase("paper") && ComputerMove.equals("PAPER"))
                System.out.println("ITS A TIE!");
            if (OurMove.equalsIgnoreCase("scissors") && ComputerMove.equals("SCISSORS"))
                System.out.println("ITS A TIE!");
            if (OurMove.equalsIgnoreCase("paper") && ComputerMove.equals("ROCK"))
                System.out.println("YOU WIN!");
            if (OurMove.equalsIgnoreCase("scissors") && ComputerMove.equals("PAPER"))
                System.out.println("YOU WIN!");
            if (OurMove.equalsIgnoreCase("rock") && ComputerMove.equals("SCISSORS"))
                System.out.println("YOU WIN!");
            if (OurMove.equalsIgnoreCase("scissors") && ComputerMove.equals("ROCK"))
                System.out.println("YOU LOSE!");
            if (OurMove.equalsIgnoreCase("rock") && ComputerMove.equals("PAPER"))
                System.out.println("YOU LOSE!");
            if (OurMove.equalsIgnoreCase("paper") && ComputerMove.equals("SCISSORS"))
                System.out.println("YOU LOSE!");
        }
    }
}
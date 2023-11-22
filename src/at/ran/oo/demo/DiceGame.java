package at.ran.oo.demo;



import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static int myValue = 0;
    public static void main(String[] args) {
        System.out.println(myValue);
        boolean isDiceGameFinished = false;
        Random playerRandom = new Random();
        Random computerRandom = new Random();
        Scanner scanner = new Scanner(System.in);

        //Regeln
        System.out.println("Sie und der Computer wuerfeln 6 Mal.");
        System.out.println("Wer am meisten Punkte hat, gewinnt!");
        System.out.println("Geben Sie 1 ein, um zu wuerfeln.");

        while (!isDiceGameFinished) {
            int playerScore = 0;
            int computerScore = 0;

            for (int throwCounter = 0; throwCounter < 6; throwCounter++) {
                int selection = scanner.nextInt();

                if (selection == 1) {
                    int playerThrow = playerRandom.nextInt(1, 7);
                    int computerThrow = computerRandom.nextInt(1, 7);

                    playerScore += playerThrow;
                    computerScore += computerThrow;

                    printInfo(playerThrow, playerScore, computerThrow, computerScore);
                }
            }

            //Ende
            isDiceGameFinished = isDiceGameIsFinished(playerScore, computerScore);
        }
        scanner.close();
    }

    private static boolean isDiceGameIsFinished(int playerScore, int computerScore) {
        boolean isDiceFinished;
        System.out.println(myValue);
        System.out.println(" ");
        if (playerScore > computerScore) {
            System.out.println("Sie haben gewonnen! :)");
        } else if (playerScore < computerScore) {
            System.out.println("Sie haben verloren! :(");
        } else {
            System.out.println("Unentschieden! :|");
        }
        isDiceFinished = true;
        return isDiceFinished;
    }

    private static void printInfo(int playerThrow, int playerScore, int computerThrow, int computerScore) {
        System.out.println("Sie haben eine " + playerThrow + " gewuerfelt.");
        System.out.println("Sie haben insgesamt " + playerScore + " Punkte.");
        System.out.println(" ");
        System.out.println("Der Computer hat eine " + computerThrow + " gewuerfelt.");
        System.out.println("Der Computer hat insgesamt " + computerScore + " Punkte.");
    }
}

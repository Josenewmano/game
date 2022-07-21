/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        WordChooser chooser = new WordChooser();
        Masker masker = new Masker();
        Game game = new Game(chooser, masker);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Today the word to guess is:");
      
        do {
            System.out.println(game.getWordToGuess());
            System.out.printf("Enter one letter to guess (%d attempts remaining):\n", game.getRemainingAttempts());
            String input = scanner.nextLine();
            if (game.guessLetter(input.charAt(0))){
                System.out.println("Right!");
            } else {
                System.out.println("Wrong!");
            }
        } while (!game.isGameWon() && !game.isGameLost());

        if (game.isGameWon()) {
          System.out.println("You have won!");
        } else {
          System.out.println("You have lost!");
        }
         
        scanner.close();
 
    }
}

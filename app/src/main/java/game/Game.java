package game;

import java.util.ArrayList;


public class Game {
  String wordToGuess = "";
  Integer remainingAttempts = 10;
  ArrayList<Character> guessedLetters = new ArrayList<Character>();
  Masker masker;

  public Game(WordChooser wordChooser, Masker masker) {
    wordToGuess = wordChooser.getRandomWordFromDictionary();
    this.masker = masker;
  }
  
  public static void main(String[] args) {    
  }


  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }

  public Boolean guessLetter(Character x) {
    if (this.wordToGuess.indexOf(x) == -1) {
      remainingAttempts--;
      return false;
    } else {
      guessedLetters.add(x);
      return true;
    }
  }

  public String getWordToGuess() {
    return masker.getMaskedWord(this.wordToGuess, guessedLetters);
  }

  public Boolean isGameLost() {
    return remainingAttempts == 0;
  }

  public Boolean isGameWon() {

    for(int i = 1; i < this.wordToGuess.length(); i++) {
      Character currentLetter = this.wordToGuess.charAt(i);
      if (!guessedLetters.contains(currentLetter)) {
        return false;
      }
    }
    return true;
  }
}



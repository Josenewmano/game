package game;

import java.util.ArrayList;

public class Game {
  String wordToGuess = "";
  Integer remainingAttempts = 10;
  ArrayList<Character> guessedLetters = new ArrayList<Character>();

  public Game(WordChooser wordChooser) {
    wordToGuess = wordChooser.getRandomWordFromDictionary();
  }
  
  public static void main(String[] args) {    
  }

  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder();      
    for (int i = 0; i < this.wordToGuess.length(); i++) {     
      Character currentLetter = wordToGuess.charAt(0);
      if (i == 0) {
          builder.append(currentLetter);
      } else {
          builder.append("_");
      }
    }
    return builder.toString();
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
  
  
}



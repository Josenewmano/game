package game;

import java.util.ArrayList;

public class Masker {

  public String getMaskedWord(String word, ArrayList<Character> guessedLetters) {
    StringBuilder builder = new StringBuilder();      
    for (int i = 0; i < word.length(); i++) {     
      Character currentLetter = word.charAt(i);
      if (guessedLetters.indexOf(currentLetter) != -1 || i == 0) {
          builder.append(currentLetter);
      } else {
          builder.append("_");
      }
    }
    return builder.toString();
  }
  
}

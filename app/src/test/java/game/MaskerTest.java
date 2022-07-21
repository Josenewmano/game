package game;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class MaskerTest {

  @Test public void getMaskedWordOnlyShowsFirstLetterAtStart() {
    Masker masker = new Masker();
    String word = "MAKERS";
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    assertEquals("M_____", masker.getMaskedWord(word, guessedLetters));
  }

  @Test public void getMaskedWordDisplaysCorrectlyGuessedLetters() {
    Masker masker = new Masker();
    String word = "MAKERS";
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('K');
    guessedLetters.add('S');
    assertEquals("M_K__S", masker.getMaskedWord(word, guessedLetters));
  }
  
}

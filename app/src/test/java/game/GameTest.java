package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.mockito.Mockito.*;


public class GameTest {

  @Test public void attemptsStartAtZero() {
    WordChooser mockedChooser = mock(WordChooser.class);
    Masker mockedMasker = mock(Masker.class);
    Game game = new Game(mockedChooser, mockedMasker);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test public void guessLetterReducesNumbeOfAttemptsWhenLetterWrong() {
    WordChooser mockedChooser = mock(WordChooser.class);
    Masker mockedMasker = mock(Masker.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser, mockedMasker);
    game.guessLetter('B');
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(9));
  }

  @Test public void guessLetterDoersNotReduceNumberOfAttemptsWhenLetterRight() {
    WordChooser mockedChooser = mock(WordChooser.class);
    Masker mockedMasker = mock(Masker.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser, mockedMasker);
    game.guessLetter('M');
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test public void isGameLost() {
    WordChooser mockedChooser = mock(WordChooser.class);
    Masker mockedMasker = mock(Masker.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser, mockedMasker);
    for(int i = 0; i < 10; i++) {
      game.guessLetter('Z');
    }
    assertTrue(game.isGameLost());
  }

  @Test public void isGameWon() {
    WordChooser mockedChooser = mock(WordChooser.class);
    Masker mockedMasker = mock(Masker.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAAN");
    Game game = new Game(mockedChooser, mockedMasker);
    game.guessLetter('A');
    game.guessLetter('N');
    assertTrue(game.isGameWon());
  }


}

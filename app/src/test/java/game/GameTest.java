package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.mockito.Mockito.*;


public class GameTest {
  @Test public void testsGetsWordToGuess() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void attemptsStartAtZero() {
    WordChooser mockedChooser = mock(WordChooser.class);
    Game game = new Game(mockedChooser);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test public void guessLetterReducesNumbeOfAttemptsWhenLetterWrong() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser);  
    game.guessLetter('B');
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(9));
  }

  @Test public void guessLetterDoersNotReduceNumberOfAttemptsWhenLetterRight() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser);  
    game.guessLetter('M');
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }
}

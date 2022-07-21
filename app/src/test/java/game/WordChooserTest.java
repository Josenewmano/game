package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.Arrays;

public class WordChooserTest {
  @Test public void testRandomWord() {
      WordChooser wordChooser = new WordChooser();
      String[] MOCK_DICT = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
      assertTrue(Arrays.asList(MOCK_DICT).contains(wordChooser.getRandomWordFromDictionary()));
  }
}

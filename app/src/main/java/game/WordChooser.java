package game;
import java.util.Random;


public class WordChooser {
  public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"}; 


  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[rand.nextInt(DICTIONARY.length)];
  }

  public static void main(String[] args) {    
  }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      //Getting game inputs
      System.out.println("Welcome to Hangman!");
      System.out.println("What word would you like to have the other player(s) guess?");
      String wordInput = keyboard.nextLine();
      wordInput = wordInput.toLowerCase();
      System.out.println("Would you like to add a category (Answer Y or N)?");
      String addCategory = keyboard.nextLine();
      String category = "";
      if(addCategory.equals("Y"))
      {
        System.out.println("What would you like to make the category?");
        category = keyboard.nextLine();
      }
      //Analyzing inputs and game prep
      int wordLength = wordInput.length();
      int correctLettersGuessed = 0;
      int wrongGuesses = 0;
      String correctGuesses = "*";
      String emptyLetter = "*";
      String newGuess
      int guessIndex
      while(wordLength != correctGuesses.length())
      {
        correctGuesses = emptyLetter + correctGuesses;
      }
      //resetting the frame (outside of loop so loop starts with analyzing guesses)
      for(int i = 50; i>0; i--)
      {
        System.out.println("\n");
      }
      System.out.println("Category: " + category);
      hangmanASCII(wrongGuesses);
      System.out.println(correctGuesses);

      //gameplay loop starts
      while(correctGuesses != wordLength)
      {
        //User Guesses a Letter
        System.out.println("Please input your guess");
        newGuess = keyboard.nextLine();
        guessIndex = wordInput.indexOf(newGuess);
        if(newGuess.length() == 1)
        {
          //if wrong letter
          if(guessIndex == -1)
          {
            wrongGuesses++;
            if(wrongGuesses == 6)
            {
              for(int i = 50; i>0; i--)
              {
                System.out.println("\n");
              }
              System.out.println("Game Over");
              System.out.println("Better Luck Next Time")
              System.out.println("Category: " + category);
              hangmanASCII(wrongGuesses);
              System.out.println(wordInput);
              break;
            }
          }
          //if right letter
          else
          {
            correctGuesses = correctGuesses.substring(0, guessIndex) + newGuess + correctGuesses.substring(guessIndex + 1);
            correctLettersGuessed++
            if(correctGuesses == wordLength)
            {
              System.out.println()
            }
          }
        }
      }
      
      
    }

    public static void hangmanASCII(int wrongGuesses)
    {
      if(wrongGuesses == 0)
      {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      else if(wrongGuesses == 1)
      {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      else if(wrongGuesses == 2)
      {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      else if(wrongGuesses == 3)
      {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      else if(wrongGuesses == 4)
      {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      else if(wrongGuesses == 5)
      {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println(" /    |");
        System.out.println("      |");
        System.out.println("=========");
      }
      else if(wrongGuesses == 6)
      {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println(" / \\  |");
        System.out.println("      |");
        System.out.println("=========");
      }
    }
}

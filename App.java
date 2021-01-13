import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      //Getting game inputs
      System.out.println("Welcome to Hangman!");
      System.out.println("What word would you like to have the other player(s) guess?");
      String wordInput = keyboard.nextLine();
      wordInput = wordInput.toLowerCase();
      String wordInputTwo = wordInput;
      System.out.println("Would you like to add a category (Answer Y or N)?");
      String addCategory = keyboard.nextLine();
      addCategory = addCategory.toLowerCase();
      String category = "";
      if(addCategory.equals("y"))
      {
        System.out.println("What would you like to make the category?");
        category = keyboard.nextLine();
      }
      //Analyzing inputs and game prep
      int wordLength = wordInput.length();
      int correctLettersGuessed = 0;
      int wrongGuesses = 0;
      String wrongLettersGuessed = "";
      String correctGuesses = "*";
      String emptyLetter = "*";
      String newGuess;
      int guessIndex;

      //makes 'correctGuesses' variable have right number of "*"
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
      while(correctLettersGuessed != wordLength)
      {
        //User Guesses a Letter
        System.out.println("Please input your guess");
        newGuess = keyboard.nextLine();
        newGuess = newGuess.toLowerCase();
        guessIndex = wordInput.indexOf(newGuess);
        if(newGuess.length() == 1)
        {
          //if wrong letter
          if(guessIndex == -1)
          {
            wrongGuesses++;
            wrongLettersGuessed = wrongLettersGuessed + " " + newGuess;
            //if lost game
            if(wrongGuesses == 6)
            {
              for(int i = 50; i>0; i--)
              {
                System.out.println("\n");
              }
              System.out.println("Game Over");
              System.out.println("Better Luck Next Time");
              System.out.println("Category: " + category);
              hangmanASCII(wrongGuesses);
              System.out.println(wordInput);
              break;
            }
          }
          //if right letter
          else
          {
            while(wordInputTwo.indexOf(newGuess) != -1)
            {
              guessIndex = wordInputTwo.indexOf(newGuess);
              correctGuesses = correctGuesses.substring(0, guessIndex) + newGuess + correctGuesses.substring(guessIndex + 1);
              wordInputTwo = wordInputTwo.substring(0, guessIndex) + "*" + wordInputTwo.substring(guessIndex + 1);
              correctLettersGuessed++;
            }
            //if won game
            if(correctLettersGuessed == wordLength)
            {
              for(int i = 50; i>0; i--)
              {
                System.out.println("\n");
              }
              System.out.println("Congratulations!!!");
              System.out.println("You win!!!");
              System.out.println("Category: " + category);
              hangmanASCII(wrongGuesses);
              System.out.println(wordInput);
              break;
            }
          }
          for(int i = 50; i>0; i--)
          {
            System.out.println("\n");
          }
          if(!(wrongLettersGuessed.equals("")))
          {
            System.out.println("Wrong Letters: " + wrongLettersGuessed);
          }
          System.out.println("Category: " + category);
          hangmanASCII(wrongGuesses);
          System.out.println(correctGuesses);
        }
        else
        {
          System.out.println("Please only input one character at a time");
        }
      }
      keyboard.close();
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

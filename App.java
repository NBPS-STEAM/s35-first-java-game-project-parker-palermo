import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Welcome to Hangman!");
      System.out.println("What word would you like to have the other player(s) guess?");
      String wordInput = keyboard.nextLine();
      System.out.println("Would you like to add a category (Answer Y or N)?");
      String addCategory = keyboard.nextLine();
      String category = "";
      if(addCategory.equals("Y"))
      {
        System.out.println("What would you like to make the category?");
        category = keyboard.nextLine();
      }
      int wordLength = wordInput.length();
      int lettersGuessed = 0;
      while(lettersGuessed != wordLength)
      {
        for(int i = 50; i>0; i--)
        {
          System.out.println("\n");
        }
        System.out.println("Category: " + category);

      }
      
      
    }

    public String hangmanASCII(int wrongGuesses)
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
    }
}

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
      int wrongGuesses = 0;
      String correctGuesses = "*";
      String emptyLetter = "*"
      for(int i = 1; i<wordLength; i++)
      {
        emptyLetter + correctGuesses;
      }
      while(lettersGuessed != wordLength)
      {
        for(int i = 50; i>0; i--)
        {
          System.out.println("\n");
        }
        System.out.println("Category: " + category);
        hangmanASCII(wrongGuesses);
        System.out.println(correctGuesses);
        break;
      }
      
      
    }
    public static <Integer> Indices(String str, char c){
    List<Integer> list = new ArrayList<>(); // define list
    
    String guessString = "******";  
    for(int i = 0; i < str.length; i++){ // go through each char in str
        if(str.charAt(i) == c){ // if the chars match
            String start = guessString.substring(0,i);
            String end = guessString.substring(i+1);

            guessString = start + c + end;
            
        }
    }
    return list; // return list
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

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Welcome to Hangman!");
      System.out.println("What word would you like to have the other player(s) guess?");
      String wordInput = keyboard.nextLine();
      System.out.println("Would you like to add a category (Answer Y or N)?");
      String addCategory = keyboard.nextLine();
      String category;
      if(addCategory == "Y")
      {
        System.out.println("What would you like to make the category?");
        category = keyboard.nextLine();
      }
      
    }
}

// 1. IMPORT Scanner CLASS 
import java.util.Scanner; 

public class Main {
   public static void main(String []args) {
      System.out.println("Let's play MadLibs!");

      // 2. Set up a Scanner OBJECT
      Scanner input = new Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter: ");
      String player = input.nextLine();
      System.out.println("Welcome " + player);

      // Create variables for each placeholder word 
      System.out.println("Enter a noun: ");
      String noun = input.nextLine(); 
      System.out.print("Enter a number: ");
      int number =  input.nextInt(); 
      System.out.println("Enter a mode of transportation: ");
      String modeOfTransportation1 = input.nextLine(); 
      System.out.println("Enter a sport: "); 
      String sport = input.nextLine(); 
      System.out.println("Enter an adjective: ");
      String adjective1 = input.nextLine(); 
      System.out.println("Enter a food: "); 
      String food1 = input.nextLine();
      System.out.println("Enter another food: ");  
      String food2 = input.nextLine();
      System.out.println("Enter a drink: "); 
      String drink = input.nextLine(); 
      System.out.println("Enter a game: "); 
      String game = input.nextLine();
      System.out.println("Enter a mode of transportation: ");  
      String modeOfTransportation2 = input.nextLine(); 
      System.out.println("Enter an adjective: "); 
      String adjective2 = input.nextLine(); 
      // Print your story line by line 
      System.out.println("Today we are going to the " + noun);
      System.out.println("It will take " + number + " minuites to get there.");
      System.out.println("We will get there by " + modeOfTransportation1 + ".");
      System.out.println("While we are there we will play " + sport + ".");
      System.out.println("It will be " + adjective1 + ". Then we will eat lunch."); 
      System.out.println("We will eat " + food1 + " and " + food2 + "."); 
      System.out.println("We will drink " + drink + ".");
      System.out.println("After that we will play a " + game + "."); 
      System.out.println("Then we will take a " + modeOfTransportation2 + " to get home."); 
      System.out.println("This day was " + adjective2 + "!");
   }
}

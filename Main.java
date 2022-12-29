import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create a dictionary to store the users
        static Dictionary<Integer, User> dict = new Dictionary<Integer, User>();
        dict.put(1, new User("John", "Doe", 1));
        dict.put(2, new User("Jane", "Dog", 2));

        // ask user for their id
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your id: ");
        int id = in.nextInt();

        // get user object with the id
        User user = dict.get(id);


        // create a menu for the user to choose from
        System.out.println("--------------------------------------------");
        System.out.println("\tWelcome to the FitCheck app!");
        System.out.println("--------------------------------------------");
        System.out.println("Please choose from the following options:");
        System.out.println("1. Add a new item to your closet");
        System.out.println("2. Remove an item from your closet");
        System.out.println("3. View your wardrobe");
        System.out.println("4. View your outfit");
        System.out.println("5. Exit the app");
        System.out.println("--------------------------------------------");
        System.out.println("Please enter your choice: ");
        int choice = in.nextInt();
        

        // while loop to keep the program running until the user wants to exit
        while ( choice != 5 ) {
            

            // switch statement to determine which option the user has chosen
            switch (choice) {
                case 1:
                    // add a new item to the wardrobe
                    // ask user what category of clothing they want to add
                    System.out.println("What category of clothing would you like to add?");
                    String category = in.nextLine();
                    // ask user what colour the clothing is
                    System.out.println("What colour is the clothing?");
                    String colour = in.nextLine();
                    // ask user what the name of the clothing is
                    System.out.println("What is the name of the clothing?");
                    String name = in.nextLine();
                    // ask user which closet they want to add the clothing to
                    System.out.println("Which closet would you like to add the clothing to? \n Winter, Summer, Fall, Spring");
                    String closet = in.nextLine();

                    // add the clothing to the closet
                    user.openCloset(closet).addClothing(name, colour, category);
                    // print out the clothing that was added
                    System.out.println("You have added " + name + " to your " + closet + " closet.");



                    break;
                case 2:
                    // remove an item from the wardrobe
                    break;
                case 3:
                    // view the wardrobe
                    break;
                case 4:
                    // view the outfit
                    break;
                default:
                    // if the user enters an invalid option
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            
            
            // create a menu for the user to choose from
            System.out.println("--------------------------------------------");
            System.out.println("Please choose from the following options:");
            System.out.println("1. Add a new item to your wardrobe");
            System.out.println("2. Remove an item from your wardrobe");
            System.out.println("3. View your wardrobe");
            System.out.println("4. View your outfit");
            System.out.println("5. Exit the app");
            System.out.println("--------------------------------------------");
            System.out.println("Please enter your choice: ");
            choice = in.nextInt();
        }


    }

}

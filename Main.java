import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        // create a dictionary to store the users
        ArrayList<User> dict = new ArrayList<User>();
        dict.add(new User("1234", "John Doe"));
        dict.add(new User("5678", "Jane Doe"));

        // ask user for their id
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your id: ");
        String id = in.nextLine();

        // get user object with the id
        User user = getUser(id, dict);


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
            in.nextLine();

            // switch statement to determine which option the user has chosen
            switch (choice) {
                case 1:
                    // add a new item to the wardrobe
                    // ask user what category of clothing they want to add
                    System.out.println("\nWhat category of clothing would you like to add?");
                    // find which category the user has chosen and store it in a variable called category
                    String category = in.nextLine();

                    // ask user what colour the clothing is
                    System.out.println("\nWhat colour is the clothing?");
                    String colour = in.nextLine();

                    // ask user what the name of the clothing is
                    System.out.println("\nWhat is the name of the clothing?");
                    String name = in.nextLine();

                    // create a new clothing object
                    Clothing clothing = new Clothing(name, colour, Clothing.Category.valueOf(category.toUpperCase()));

                    // ask user which closet they want to add the clothing to
                    System.out.println("\nWhich closet would you like to add the clothing to? \n Winter, Summer, Fall, Spring");
                    String closet = in.nextLine();
                    System.out.println(closet);
                    
                    while (!(closet.equalsIgnoreCase("winter") || closet.equalsIgnoreCase("summer") || closet.equalsIgnoreCase("fall") || closet.equalsIgnoreCase("spring"))) {
                        System.out.println("\nInvalid closet. Please try again.");
                        closet = in.nextLine();
                    }

                    // add the clothing to the closet
                    if (closet.equalsIgnoreCase("winter"))
                    {
                        user.getWinterCloset().addItem(clothing);
                        System.out.println("You have added " + name + " to your " + closet + " closet.");

                        // print out the items in the given closet
                        System.out.println("Here are the items in your " + closet + " closet:");
                        user.getWinterCloset().getItems();
                    }
                    else if (closet.equalsIgnoreCase("summer"))
                    {
                        user.getSummerCloset().addItem(clothing);
                        System.out.println("You have added " + name + " to your " + closet + " closet.");

                        // print out the items in the given closet
                        System.out.println("Here are the items in your " + closet + " closet:");
                        user.getWinterCloset().getItems();
                    }
                    else if (closet.equalsIgnoreCase("fall"))
                    {
                        user.getFallCloset().addItem(clothing);
                        System.out.println("You have added " + name + " to your " + closet + " closet.");

                        // print out the items in the given closet
                        System.out.println("Here are the items in your " + closet + " closet:");
                        user.getWinterCloset().getItems();
                    }
                    else if (closet.equalsIgnoreCase("spring"))
                    {
                        user.getSpringCloset().addItem(clothing);
                        System.out.println("You have added " + name + " to your " + closet + " closet.");

                        // print out the items in the given closet
                        System.out.println("Here are the items in your " + closet + " closet:");
                        user.getWinterCloset().getItems();
                    }



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

    public static User getUser(String id, ArrayList<User> dict) {
        for (User user : dict) {
            if (user.getId().equals(id)) {
                System.out.println(id + " is a valid id.");
                return user;
            }
        }
        System.out.println(id + " is not a valid id.");
        return null;
    }

}

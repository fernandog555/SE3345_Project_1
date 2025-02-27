import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        GenericSingleLinkedList<Product> list = new GenericSingleLinkedList<>();

        boolean programRunning = true;
        int choice;

        // Keep the program running until the user exits out. 
        while(programRunning)
        {
            System.out.println("\n/** Operations on List **/\n");

            System.out.println("1. Make empty");
            System.out.println("2. Find ID");
            System.out.println("3. Insert at Front");
            System.out.println("4. Delete from Front");
            System.out.println("5. Delete ID");
            System.out.println("6. Print all Records");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");

            // Catch any inputs from the user that are not allowed, such as letters, special characters, etc. 
            // The input will only accept integers. If we find an error, we throw a warning message to the user 
            // and prompt them to try again.
            try
            {
                choice = scan.nextInt();

                switch (choice)
                {
                    case 1:
                        /*
                         *  1. Make empty
                         *  Clear out the entire linked list.
                         */

                        System.out.println("The list has been deleted.");
                        list.makeEmpty();
                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                    case 2:
                        /*
                         *  2. Find ID
                         *  Input the ID to be found, and print out the details of that ID.
                         *  If ID is not found, print error message.
                         */

                        System.out.print("Enter ID: ");
                        int searchID = scan.nextInt();

                        Product findProduct = list.findID(searchID);
                        if (findProduct == null)
                        {
                            System.out.println("\nID not found! Please try again.");
                        }
                        else
                        {
                            findProduct.printID();
                        }
                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                    case 3:
                        /*
                         *  3. Insert at Front
                         *  Input all the product details associated with the ID, and add to the front of the list.
                         */

                        System.out.print("Enter Product ID: ");
                        int id = scan.nextInt();
                        scan.nextLine();

                        System.out.print("Enter Product Name: ");
                        String name = scan.nextLine();

                        System.out.print("Enter Supplier Name: ");
                        String supplier = scan.nextLine();

                        Product newProduct = new Product(id, name, supplier);
                        if (list.insertAtFront(newProduct))
                        {
                            System.out.println("\nProduct has been added successfully!");
                        }
                        else
                        {
                            System.out.println("Error: Product ID already exists! Please try again.");
                        }

                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                    case 4:
                        /*
                         *  4. Delete from Front
                         *  Print the ID details from the first item on the list, then delete.
                         */

                        Product deletedFront = list.deleteFromFront();
                        if (deletedFront != null)
                        {
                            deletedFront.printID();
                            System.out.println("First item deleted.");
                        }
                        else
                        {
                            System.out.println("List is empty.");
                        }
                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                    case 5:
                        /*
                         *  5. Delete ID
                         *  Print the ID detail of the selected product, then delete.
                         */

                        System.out.print("Enter ID to delete: ");
                        int idToDelete = scan.nextInt();
                        scan.nextLine();
                        
                        Product deleted = list.delete(idToDelete);
                        if (deleted != null)
                        {
                            deleted.printID();
                            System.out.println("Product deleted successfully!");
                        }
                        else
                        {
                            System.out.println("ID not found.");
                        }
                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                    case 6:
                        /*
                         *  6. Print all Records
                         *  Traverse the linked list and print all the records.
                         */

                        list.printAllRecords();
                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                    case 7:
                        /*
                         * 7. Exit
                         *  Quit the program. For every other option after task completion display menu again.
                         */

                        programRunning = false;
                        System.out.println("\List will be deleted. Goodbye!");
                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                    default:
                        /*
                         * Incorrect input, prompt to retry again.
                         */
                        System.out.println("Error: Invalid choice. Please enter a number between 1 and 7.");
                        System.out.println("\n/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
                        break;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scan.nextLine();
            }
        }
        scan.close(); // added this to make the java compiler to shut up lmao
    }
}

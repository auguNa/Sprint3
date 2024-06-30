import java.util.Scanner;


import static Application.*;

public class Menu {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("***AGENDA***");
            System.out.println("1.Create Contact");
            System.out.println("2.List Contacts");
            System.out.println("3.Delete Contact");
            System.out.println("4.EXIT");
            System.out.print("Select an option: ");

            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    createContact();
                    break;
                case 2:
                    listContacts();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    System.out.println("Application ended.. ");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 0);
    }
}

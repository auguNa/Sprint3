import Agenda.AddressBook;
import Agenda.ContactFactory;
import Address.GenericContactFactory;

import java.util.Scanner;

public class Application {
    private static AddressBook addressBook = new AddressBook();
    static Scanner sc = new Scanner(System.in);


         public static void createContact() {
            System.out.print("Enter the number of address details (e.g., street, city, state, postal code, etc.): ");
            int numDetails = sc.nextInt();
            sc.nextLine();

            String[] details = new String[numDetails];
            for (int i = 0; i < numDetails; i++) {
                System.out.print("Enter detail " + (i + 1) + ": ");
                details[i] = sc.nextLine();
            }

            ContactFactory factory = new GenericContactFactory();
            addressBook.addAddress(factory, details);

            System.out.print("Enter phone number: ");
            String phoneNumber = sc.nextLine();
            addressBook.addPhoneNumber(factory, phoneNumber);
        }

        public static void listContacts () {
            addressBook.displayContacts();
        }

        public static void deleteContact() {
            System.out.print("Enter contact number to delete: ");
            int index = sc.nextInt();
            sc.nextLine();
            addressBook.deleteContact(index - 1); // convert to zero-based index
        }
    }

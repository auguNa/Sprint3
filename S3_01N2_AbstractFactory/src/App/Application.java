package App;

import ContactFactory.ContactFactory;
import ContactFactory.GenericContactFactory;


import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);
    private static AddressBook addressBook = new AddressBook();

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
        System.out.println("New contact Created.");
    }


    public static void listContacts() {
        if (addressBook.isEmpty()) {
            System.out.println("The address book is empty.");
        } else {
            addressBook.displayContacts();
        }
    }

    public static void deleteContact() {
        System.out.print("Enter contact id to delete: ");
        int index = sc.nextInt();
        sc.nextLine();
        addressBook.deleteContact(index - 1);
        System.out.println("Contact Deleted");
    }
}

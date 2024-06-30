package App;

import Address.Address;
import ContactFactory.ContactFactory;
import Phone.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Address> addresses = new ArrayList<>();
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public void addAddress(ContactFactory factory, String... details) {
        addresses.add(factory.createAddress(details));
    }

    public void addPhoneNumber(ContactFactory factory, String number) {
        phoneNumbers.add(factory.createPhoneNumber(number));
    }

    public void deleteContact(int index) {
        if (index < addresses.size()) {
            addresses.remove(index);
            phoneNumbers.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void displayContacts() {
        for (int i = 0; i < addresses.size(); i++) {
            System.out.print("Contact " + (i + 1) + ": ");
            addresses.get(i).display();
            phoneNumbers.get(i).display();
        }
    }
}


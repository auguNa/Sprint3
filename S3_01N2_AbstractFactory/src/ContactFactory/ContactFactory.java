package Address;

import Phone.PhoneNumber;

public interface ContactFactory {
    Address createAddress(String... details);
    PhoneNumber createPhoneNumber(String number);
}



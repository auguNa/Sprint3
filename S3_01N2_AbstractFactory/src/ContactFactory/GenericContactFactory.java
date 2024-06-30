package ContactFactory;

import Address.*;
import Phone.GenericPhoneNumber;
import Phone.PhoneNumber;

public class GenericContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String... details) {
        return new GenericAddress(details);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new GenericPhoneNumber(number);
    }

}
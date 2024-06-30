package Agenda;

public class GenericPhoneNumber implements PhoneNumber {
    private String number;

    public GenericPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("Phone Number: " + number);
    }
}
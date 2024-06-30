package Address;

public class GenericAddress implements Address {
    private String[] details;

    public GenericAddress(String... details) {
        this.details = details;
    }
    @Override
    public void display() {
        System.out.print("Address: ");
        for (String detail : details) {
            System.out.print(detail + " ");
        }
        System.out.println();
    }
}
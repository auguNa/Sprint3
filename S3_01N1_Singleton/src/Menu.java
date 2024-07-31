import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static Undo undo = Undo.getInstance();
    private static int option;

    public static void printMenu() {
        do {
            System.out.println("***UNDO MENU***");
            System.out.println("1.ADD");
            System.out.println("2.REMOVE");
            System.out.println("3.LIST");
            System.out.println("4.EXIT");
            System.out.print("Select an option: ");
            try {
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        Undo.add();
                        break;
                    case 2:
                        undo.remove();
                        break;
                    case 3:
                        undo.list();
                        break;
                    case 4:
                        System.out.println("Application ended.. ");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e.getMessage() + " - Please enter a integer");
            }
        } while (option != 0);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public final class Undo {
    private static volatile Undo instance;
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> undoCommandList = new ArrayList<>();

    private Undo() {
    }

    public static Undo getInstance() {
        Undo result = instance;
        if (instance == null) {
            synchronized (Undo.class) {
                if (instance == null) {
                    instance = new Undo();
                }
            }
        }
        return instance;
    }

    public static void add() {
        System.out.println("Add data: ");
        String data = sc.nextLine();
        undoCommandList.add(data);
        System.out.println("Data added.");
    }

    public static void remove() {
        if (!undoCommandList.isEmpty()) {
            undoCommandList.remove(undoCommandList.size() - 1);
            System.out.println("Last data removed.");
        } else {
            System.out.println("No data to remove.");
        }
    }

    public static void list() {
        if (!undoCommandList.isEmpty()) {
            System.out.println("Undo Command List:");
            for (int i = 0; i < undoCommandList.size(); i++) {
                System.out.println((i + 1) + ". " + undoCommandList.get(i));
            }
        } else {
            System.out.println("No data to list.");
        }
    }
}

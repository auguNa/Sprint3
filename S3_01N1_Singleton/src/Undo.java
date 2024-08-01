import java.util.ArrayList;
import java.util.Scanner;

public final class Undo {
    private static volatile Undo instance;
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

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add data: ");
        String data = sc.nextLine();
        undoCommandList.add(data);
        System.out.println("Data added.");

    }

    public void remove() {
        if (!undoCommandList.isEmpty()) {
            undoCommandList.remove(undoCommandList.size() - 1);
            System.out.println("Last data removed.");
        } else {
            System.out.println("No data to remove.");
        }
    }

    public void list() {
        if (!undoCommandList.isEmpty()) {
            int index = 1;
            for (String command : undoCommandList) {
                System.out.println(index + ". " + command);
                index++;
            }
        } else {
            System.out.println("No data to list.");
        }
    }
}

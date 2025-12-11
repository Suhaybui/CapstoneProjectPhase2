package capstone;

public class Main {
    public static void main(String[] args) {
        DataManager manager = new DataManager();

        manager.insert("A", "Apple");
        manager.insert("B", "Banana");
        manager.insert("C", "Carrot");

        System.out.println(manager.get("B"));

        manager.remove("A");

        manager.iterate();
    }
}

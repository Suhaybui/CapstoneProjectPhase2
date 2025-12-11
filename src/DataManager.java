package capstone;

import java.util.HashMap;
import java.util.LinkedList;

public class DataManager {
    private HashMap<String, Node> map = new HashMap<>();
    private LinkedList<Node> list = new LinkedList<>();

    public void insert(String key, Object value) {
        Node node = new Node(key, value);
        map.put(key, node);
        list.add(node);
    }

    public Object get(String key) {
        Node n = map.get(key);
        return n != null ? n.getValue() : null;
    }

    public void remove(String key) {
        Node n = map.remove(key);
        if (n != null) list.remove(n);
    }

    public void iterate() {
        for (Node n : list) {
            System.out.println(n.getKey() + " → " + n.getValue());
        }
    }
}

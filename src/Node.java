package capstone;

public class Node {
    private String key;
    private Object value;
    private long timestamp;

    public Node(String key, Object value) {
        this.key = key;
        this.value = value;
        this.timestamp = System.currentTimeMillis();
    }

    public String getKey() { return key; }
    public Object getValue() { return value; }
    public long getTimestamp() { return timestamp; }
}

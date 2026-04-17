public interface Document {
    void open();
    Document clone();
    String getType();
}
public abstract class Book {
    protected String title;
    protected String author;
    protected int quantity;
    protected String type;

    public Book(String title, String author, int quantity, String type) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void displayDetails();
}

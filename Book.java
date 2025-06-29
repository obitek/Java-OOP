
public class Book {
    private String title;
    private String author;
    private float price;
    
    // set the title
    public void setTitle(String title) {
        this.title = title;
    }
    // set the author
    public void setAuthor(String author) {
        this.author = author;
    }
    // set the price
    public void setPrice(float price) {
        this.price = price;
    }
    
    // returns title
    public String getTitle() {
        return this.title;
    }
    // returns author
    public String getAuthor() {
        return this.author;
    }
    // returns price
    public float getPrice() {
        return this.price;
    }
    
    // returns the title, author and price 
    public String toString() {
        return "Title - " + this.title + "\nAuthor - "
            + this.author + "\nPrice - "+ String.format("%.2f", this.price);
    }
}

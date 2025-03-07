package Books;

public class AudioBook implements Book {
    private final String title;
    private final double price;
    private final String type;

    public AudioBook(String title, double price)
    {
        this.title = title;
        this.price = price;
        this.type = "Livre audio";
    }

    public String getType()
    {
        return this.type;
    }

    public String getTitle()
    {
        return this.title;
    }

    public double getPrice()
    {
        return this.price;
    }
}

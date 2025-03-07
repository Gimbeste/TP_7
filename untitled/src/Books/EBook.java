package Books;

public class EBook implements Book {
    private final String title;
    private final double price;
    private final String type;

    public EBook(String title, double price)
    {
        this.title = title;
        this.price = price;
        this.type = "E-book";
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

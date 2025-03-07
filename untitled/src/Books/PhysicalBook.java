package Books;

public class PhysicalBook implements Book {
    private final String title;
    private final double price;
    private final String type;

    public PhysicalBook(String title, double price)
    {
        this.title = title;
        this.price = price;
        this.type = "Physique";
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

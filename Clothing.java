public class Clothing
{
    //propertiets of the clothing class
    public static enum Category {JACKET, TOP, BOTTOM};

    private String name;
    private String colour;
    private Category category;

    //constructor method
    public Clothing(String name, String colour, Category category)
    {
        this.name = name;
        this.colour = colour;
     	this.category = category;

    }

    public String getName()
    {
        return name;
    }

    public String getColour()
    {
        return colour;
    }

    public Category getCategory()
    {
        return category;
    }

    public void changeName(String name)
    {
        this.name = name;
    }

    public void changeColour(String colour)
    {
        this.colour = colour;
    }

    public void changeCategory(Category category)
    {
        this.category = category;
    }
}
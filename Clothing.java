public class Clothing
{
    //propertiets of the clothing class
    public static enum Category {JACKET, TOP, BOTTOM};
    public String name;
    public String colour;
    public Category category;

    //constructor method
    public Clothing(String name, String colour, Category category)
    {
        this.name = name;
        this.colour = colour;
     	this.category = category;

    }

    public String getname()
    {
        return name;
    }

    public String getcolour()
    {
        return colour;
    }

    public Category getCategory()
    {
        return category;
    }

    public void changename(String name)
    {
        this.name = name;
    }

    public void changecolour(String colour)
    {
        this.colour = colour;
    }

    public void changecategory(Category category)
    {
        this.category = category;
    }
}
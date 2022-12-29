import java.util.ArrayList;



public class Closet
//this is the generic closet that does not have a speficied range of temperatures
//this is just the basics of how a closet is going to work
//would we also require a user?
{
    public String name;
    //another one that has the USER ID
    public ArrayList<Clothing>  jackets = new ArrayList<Clothing>();
    public ArrayList<Clothing>  tops = new ArrayList<Clothing>();	
    public ArrayList<Clothing>  bottoms = new ArrayList<Clothing>();

    public int max; //the MAX temp
    public int min; //the MIN temp
    public ArrayList<String> colours = new ArrayList<Clothing>();


    public void openCloset()
    {
        System.out.println("Jackets: ");
        for (int i = 0; i < jackets.size(); i++)
        {
            System.out.println(jackets.get(i).getname());
        }
        System.out.println("Tops: ");
        for (int i = 0; i < tops.size(); i++)
        {
            System.out.println(tops.get(i).getname());
        }
        System.out.println("Bottoms: ");
        for (int i = 0; i < bottoms.size(); i++)
        {
            System.out.println(tops.get(i).getname());
        }
        
    } 

    public void addItem(Clothing clothing)
    {
        if (clothing.getCategory() == Clothing.Category.JACKET)
        {
            jackets.add(clothing);
        }
        if (clothing.getCategory() == Clothing.Category.TOP)
        {
            tops.add(clothing);
        }
        if (clothing.getCategory() == Clothing.Category.BOTTOM)
        {
            bottoms.add(clothing);
        }
    }

//ok so thought process time, this is just the basic skeleton of a closet object, but for our specific systems functionality, we want it to be so that each user
//has 4 different closets for them. So then we need a user object that has the variables for each of their specific closets.
}
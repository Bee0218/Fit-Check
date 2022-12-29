public class User
{
    public String id;
    public String name;
    public Closet fallcloset;
    public Closet wintercloset;
    public Closet springcloset;
    public Closet summercloset;




    public User(String id, String name)
    {
        this.id = id;
        this.name = name;
        fallcloset = null;
        wintercloset = null;
        springcloset = null;
        summercloset = null;
    }

    public String getId()
    {
        return id;
    }

    public getCloset()
    {
        return closet;
    }

}
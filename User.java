import java.util.Scanner;

public class User
{
    public String id;
    public String name;
    public Closet fallCloset;
    public Closet winterCloset;
    public Closet springCloset;
    public Closet summerCloset;




    public User(String id, String name)
    {
        this.id = id;
        this.name = name;
        fallCloset = null;
        winterCloset = null;
        springCloset = null;
        summerCloset = null;
    }

    public String getId()
    {
        return id;
    }

    public Closet getWinterCloset()
    {
        return winterCloset;
    }

    public Closet getFallCloset()
    {
        return fallCloset;
    }

    public Closet getSpringCloset()
    {
        return springCloset;
    }

    public Closet getSummerCloset()
    {
        return summerCloset;
    }
    
}

abstract class engineering
{
    abstract void disp();
}

class computer extends engineering implements programming
{
    public void disp()
    {
        System.out.println("I am Pranali");
    }
    public void coding()
    {
        System.out.println("I am doing code");
    }
}

class mechanical extends engineering implements drawing
{
    public void disp()
    {
        System.out.println("I am Learner");
    }
    public void draw()
    {
        System.out.println("I am Performing a Drawing");
    }
}

interface programming
{
    void coding();
}

interface drawing
{
    void draw();
}

public class Main
{
    public static void main(String[] args)
    {
        computer c=new computer();
        mechanical m= new mechanical();
        c.disp();
        c.coding();
        m.disp();
        m.draw();
        
    }
}
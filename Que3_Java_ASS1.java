abstract class vegetable
{
    String color;
}
class Potato extends vegetable
{
    public String toString()
    {
        color="Skin Color";
        //System.out.print("I am Potato");
        return color;
    }
}
class Bringle extends vegetable
{

    public String toString()
    {
        color="Voilet";
       // System.out.print("I am Bringle");
        return color;
    }
}
class Tomato extends vegetable
{
   
    public String toString()
    {
        color="Red";
        //System.out.print("I am Potato");
        return color;
    } 
}

public class Main
{
    public static void main(String[] args)
    {
        Potato p= new Potato();
        System.out.print(p+"\n");
        Tomato t= new Tomato();
        System.out.print(t+"\n");
        Bringle b= new Bringle();
        System.out.print(b+"\n");
    }
}
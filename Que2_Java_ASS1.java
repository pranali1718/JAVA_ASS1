interface GP
{
   void GPP(); 
}

interface parent1 extends GP
{
    void pp1();
}

interface parent2 extends GP
{
    void pp2();
}

interface child extends parent1,parent2
{
    void cpp12();
}

class Family implements child
{
    public void GPP()
    {
        System.out.println("I am Head of family");
    }
    public void pp1()
    {
        System.out.println("Parent 1 ");
    }
    public void pp2()
    {
        System.out.println("Parent 2");
    }
    public void cpp12()
    {
        System.out.println("I am Cutest Member of family");
    }
}

public class Main
{
     public static void main(String[] args)
    {
        Family p = new Family();
        p.GPP();
        p.pp1();
        p.pp2();
        p.cpp12();
        
    }
}
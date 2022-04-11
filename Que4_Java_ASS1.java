interface Transport
{
    void deliver();
}
abstract class Animal
{
    abstract void deliver();
}
class Tiger extends Animal
{
    public void deliver()
    {
        System.out.println("I am Tiger");
    }
}
class Camel extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("I am Camel");
    }
}
class Deer extends Animal
{
    public void deliver()
    {
        System.out.println("I am Deer");
    }
}
class Donkey extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("I am Donkey");   
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Animal[] t1 = new Tiger[2];
		t1[1] = new Tiger();
		t1[1].deliver();
		Animal[] t2 = new Camel[3];
		t2[2] = new Camel();
		t2[2].deliver();
		Animal[] t3 =new Deer[4];
		t3[3] = new Deer();
		t3[3].deliver();
		Animal[] t4 = new Donkey[5];
		t4[4] = new Donkey();
		t4[4].deliver();
        //Animal D = new Deer();
        //a.deliver();
    }
}

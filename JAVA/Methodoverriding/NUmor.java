package Methodoverriding;



class A
{
    int i = 10;
}
 
class B extends A
{
    int i = 20;
}
 
public class NUmor
{
    public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
    }
}

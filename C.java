class A
{
    int a=45;
}
class B extends A
{
    int a=50;
    void display()
    {
        System.out.println("Superclass variable="+super.a);
        System.out.println("Subclass variable="+a);
    }
}
class C
{
    public static void main(String[] args)
    {
        B x=new B();
        x.display();
    }
}
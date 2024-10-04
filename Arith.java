class Arith
{
   public static void main(String []args)
   {
    try {
        int a,b,c;
        a=2;
        b=0;
        c=a/b;
        System.out.println(c);
    }
     catch (Exception e) 
     {
        System.out.print("Cannot devide by zero");
    }
    finally
    {
        System.out.print("Finally block");
    }
   }
}
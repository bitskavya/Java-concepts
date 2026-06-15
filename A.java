class A
{
   void display()
   {
     System.out.println("display of A");
    }
}
class B extends A
{
    void show()
    {
      System.out.println("show of B");
    }
}
class Single
{
   public static void main(String args[])
   {
      B b=new B();
      b.display();
      b.show();
   }
} 
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
class C extends B
{
   void work()
   {
      System.out.println("work of c");
   }
}
class Multilevel
{
   public static void main(String args[])
   {
      C c=new C();
      c.display();//method of A
      c.show();//method of B
      c.work();//method of C
   }
} 
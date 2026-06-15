class Person
{
  protected String name;//protected modifier
  int age;//default modifier
  public void talk()//public modifier
  {
     System.out.println("Iam "+name);
     System.out.println("My age is"+age);
  }
}
class AccessDemo
{
   public static void main(String args[])
   {
     Person p=new Person();
     p.name="sweet";
     p.age=21;
     p.talk();
   }
} 
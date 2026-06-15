class Person
{
  String name;
  int age;
  void talk()
  {
     System.out.println("Iam "+name);
     System.out.println("My age is"+age);
  }
}
class PersonDemo
{
   public static void main(String args[])
   {
     Person p=new Person();
     p.name="Sweety";
     p.age=40;
     p.talk();
     System.out.println(p);
   }
} 
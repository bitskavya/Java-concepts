class Person
{
  String name;
  int age;
  Person()//non parameterized constructor
{
  name="sweety";
  age=18;
}
  void talk()
  {
     System.out.println("Iam "+name);
     System.out.println("My age is"+age);
  }
}
class ConDemo
{
   public static void main(String args[])
   {
     Person p=new Person();
     p.talk();
     System.out.println(p);
   }
} 
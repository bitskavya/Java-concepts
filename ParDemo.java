class Person
{
  String name;
  int age;
  Person(String n,int a)//parameterized constructor
{
  name= n;
  age= a;
}
  void talk()
  {
     System.out.println("Iam "+name);
     System.out.println("My age is"+age);
  }
}
class ParDemo
{
   public static void main(String args[])
   {
     Person p=new Person("sweety",20);
     p.talk();
     Person p1=new Person("bunny",19);
     p1.talk();
     
   }
} 
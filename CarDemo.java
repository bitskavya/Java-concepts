class Car
{
  String name;
  int price;
  void regno()
  {
     System.out.println("name "+name);
     System.out.println("price is"+price);
  }
}
class CarDemo
{
   public static void main(String args[])
   {
     Car c=new Car();
     c.name="Rollys Royce";
     c.price=10000000;
     c.regno();
     System.out.println(c);
   }
} 
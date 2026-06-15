class Book
{
  String name;
  int price;
  void purchase()
  {
     System.out.println("name "+name);
     System.out.println("price is"+price);
  }
}
class BookDemo
{
   public static void main(String args[])
   {
     Book b=new Book();
     b.name="Alone";
     b.price=400;
     b.purchase();
     System.out.println(b);
   }
} 
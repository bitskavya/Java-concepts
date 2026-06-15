abstract class Order
{
   public void bookProduct()
   {
	System.out.println("book is ready to deliver");
	System.out.println("order is placed");

   }
   public abstract void payment();
}
class Phonepay extends Order
{
   public void payment()
   {
	System.out.println("you can order it by phonepay ");
    }
  }
class Gpay extends Order
{
   public void payment()
   {
	System.out.println("you can order it by gpay");
    }
   }
class AbstractsDemo
{
    public static void main(String args[])
    {
	Phonepay p=new Phonepay();
	System.out.println("-----Phonepay-----");
	p.payment();
	p.bookProduct();
	
	Gpay g=new Gpay();
	System.out.println("-----Gpay-----");
	g.payment();
	g.bookProduct(); 
   }
}





abstract class Car
{
   public void fuelTank()
   {
	System.out.println("fill fuel into the tank");
	System.out.println("Drive the car");
   }
   public abstract void steering();
   public abstract void breaking();
}
class Maruthi extends Car
{
   public void steering()
   {
	System.out.println("maruthi uses manual steering");
    }
    public void breaking()
    {
	System.out.println("maruthi uses gas breaks");
	System.out.println("apply breaks to stop the car");
    }
}
class Santhro extends Car
{
   public void steering()
   {
	System.out.println("santhro uses power steering");
    }
    public void breaking()
    {
	System.out.println("santhro uses hydrallic breaks");
	System.out.println("apply breaks to stop the car");
    }
}
class AbstractDemo
{
    public static void main(String args[])
    {
	Maruthi m=new Maruthi();
	System.out.println("----Maruthi Car----");
	m.fuelTank();
	m.steering();
	m.breaking();

	Santhro s=new Santhro();
	System.out.println("----Santhro Car----");
	s.fuelTank();
	s.steering();
	s.breaking();
    }
}





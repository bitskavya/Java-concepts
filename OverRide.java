class Parent
{ 
    public void cal(int x)
    {
	System.out.println("Square: "+(x*x));
    }
}
class  Child extends Parent
{
    public void cal(int x)
    {
	super.cal(x);
	System.out.println("Cube: "+(x*x*x));
    }
}
class OverRide
{
    public static void main(String args[])
    {
	Child c=new Child();
	c.cal(5);
    }
}

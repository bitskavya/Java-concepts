class Addition
{
   public void sum(int x,int y)
   {
	System.out.println("sum of 2 int's= "+(x+y));
   }
   public void sum(int a,int b,int c)
   {
	System.out.println("sum of 2 values= "+(a+b+c));
   }
   public void sum(float a,float b)
   {
	System.out.println("sum of 2 float's= "+(a+b));
   }
}
class OverLoad
{
    public static void main(String args[])
    {
	Addition a=new Addition();
	a.sum(10,20);
	a.sum(10,200,30);
	a.sum(40.0f,60.0f);
    }
}

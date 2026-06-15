interface Father
{ 
    double INC=3000;
}
interface Mother
{
    double INC=5000;
}
class Child implements Father,Mother
{
    public void totalIncome()
    {
	System.out.println("total income: "+(Father.INC+Mother.INC));
    }
}
class Income
{
    public static void main(String args[])
    {
	Child c=new Child();
	c.totalIncome();
    }
}
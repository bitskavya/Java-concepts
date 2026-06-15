import java.util.Scanner;
class SumTwo
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter two values:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println("sum :"+c);
    }
}

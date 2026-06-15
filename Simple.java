import java.util.Scanner;
class Simple
{  
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
        double p,si;
	int t;
	float r;
	System.out.println("enter p,t&r values:");
	p=sc.nextDouble();
	t=sc.nextInt();
	r=sc.nextFloat();
	si=(p*t*r)/100;
	System.out.println("Simple Interest:"+si);
     }
}


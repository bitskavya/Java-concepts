class Ex1
{
   public static void main(String args[])
   {
	int a,b,c;
	try{
	     a=Integer.parseInt(args[0]);
	     b=Integer.parseInt(args[1]);
	     c=a/b;
	     System.out.println("Result: "+c);
           }
	 catch(Exception e)
	 {
	     System.out.println(e);
	  }
	 	 System.out.println("End of prgm");
    }
}


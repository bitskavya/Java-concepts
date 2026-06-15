interface IDBOps
{  
   void connect();
   void execute();
   void close();
}
class Mysql implements IDBOps
{
    public void connect()
    {
	System.out.println("connected to mysql+++");
    }
    public void execute()
    {
	 System.out.println("executed on mysql+++");
    }
    public void close()
    {
	System.out.println("close from mysql+++");
    }
}
class Mongo implements IDBOps
{
    public void connect()
    {
	System.out.println("connected to mongo$$");
    }
    public void execute()
    {
	 System.out.println("executed on mongo$$");
    }
    public void close()
    {
	System.out.println("close from mongo$$");
    }
}
class UseDB
{
    public static void main(String args[])
    {
	IDBOps my=new Mysql();
	my.connect();
	my.execute();
	my.close();
	System.out.println("------------------");
	IDBOps mo=new Mongo();
	mo.connect();
	mo.execute();
	mo.close();
    }
}
class AddInstanceTwo
{
static int c;
	public int addone(int a,int b)
	{
	  c=a+b;
	return c;
	}
	public int addtwo(int e)
	{
	 int d=c+e;
	return d;
	}	
public static void main(String args[])
{
AddInstanceTwo ob1=new AddInstanceTwo();
int c=ob1.addone(5,1);

AddInstanceTwo ob2=new AddInstanceTwo();
int d=ob2.addtwo(2);

System.out.println(c);
System.out.println(d);

}
} 
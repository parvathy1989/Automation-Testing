class AddInstance
{

	public int add(int a,int b)
	{
	 int c=a+b;
	return c;
	}
	
public static void main(String args[])
{
AddInstance ob1=new AddInstance();
int c=ob1.add(5,9);
System.out.println(c);

}
} 
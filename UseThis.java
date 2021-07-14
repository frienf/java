package ThisKeyword;

public class UseThis{
	int num1,num2;
	UseThis(int num1,int num2)
	{
	this.num1 = num1;
	this.num2 = num2;
	}
	void show()
	{
	System.out.println("Value of NUm1"+ num1);
	System.out.println("Value of Num2"+ num2);
	}
	public static void main(String args[])
	{
	useThis ut = new UseThis(100,200);
	ut.show();
	}
}
package SuperClass;

class FirstSuper
{
	int x,y;
	Firstsuper(int a,int b)
	{
		x=a;
        y=b;
	}
	void show()
	{
		System.out.println("Value of X is :"+ x);
		System.out.println("Value of Y is :"+ y);
	}
}
class SecondSuper extends FirstSuper
{
	int z;
	SecondSuper(int a,int b,int c)
	{
		super(a,b);
		z=c;
	}
	void Show()
	{
		super.show;
		System.out.println("Vlaue of z is:"+ z);
	}
}

public class UseSuper{
	public static void main(String args[])
	{
		Secondsuper fs = new SecondSuper(100,200,300);
		fs.show();
	}
}
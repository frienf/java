package PrintAlphabetAlternate;

class LowerAZ extends ThreadGroup{
	public void run()
	{
		int x = 97;
		while(x<= 122)
		{
			try
			{
				x = x+2;
				System.out.println(" " + (char)x);
			}
			catch(Exception e)
			{

			}
		}
	}
}

public class AlphabetAZ {
	public static void main(String args[])
	{
		LowerAZ laz =new LowerAZ();
		laz.Start();
	}
}
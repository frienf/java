package PrintNumber1to10;

class printNumbers extends Thread 
{
	public void run()
	{
		for(int x=1;x<10;x++)
		{
			System.out.println(" " + x);
		}
		for(int x=1;x<10;x++)
		{
			try
			{
				System.out.println(" " + x);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{

			}
		}
	}
}

public class CallNumber {
	public static void main(String args[])
	{
		printNumbers pn = new printNumbers();
		pn.start();
	}
}

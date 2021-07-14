package CloneObjectInJava;

public class CloneObject implements Cloneable {
	String name;
	int record;

	public CloneObject(String name,int record)
	{
		this.name = name;
		this.record = record;
	}

	public void show()
	{
		System.out.println("Welcome " + name +" ! Your score is: "+record);
	}

	public static void main(String args[])
	{
		CloneObject co = new CloneObject("David",98);
		try
		{
			CloneObject col = (CloneObject)co.clone();
			col.show();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
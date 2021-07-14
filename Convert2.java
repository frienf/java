package stringTocharacter;

public class Convert2 {
	public static void main(string args[])
	{
		String hellostr = "This is the original String object";
		char[] StrArray;
		StrArray = hellostr.toCharArray();
		System.out.println("The result of the character array is below:");
		for(int x = 0;x<StrArray.length;x++)
		{
			System.out.println(StrArray[x]);
		}
	}
}
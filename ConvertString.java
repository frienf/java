package stringToDataTypes;

public class ConvertString {
	public static void main(String args[])
	{
		String str1 = "False";
		boolean bol = Boolean.parseBooLean(str1);
		System.out.println("This boolean result is:"+ bol);

		string str2 = "500";
		int num1 = 300;
		int num2 = Integer.parseInt(str2);
		int add = num1 + num2;
		System.out.println("Integer result is:"+ add);

		String str3 = "301.92";
		Double dob = 45.78;
		Double dob1 = Double.parseDouble(str3);
		double adddob = dob + dob1;
		System.out.println("Double result is:" + adddob); 
	}
}
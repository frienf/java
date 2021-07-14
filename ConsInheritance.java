package ConstructorInheritance;

class Student
{
	void student()
	{
		System.out.println("This is first student constructor");
	}
}

class school Extends student
{
	void school()
	{
		System.out.println("This is second student constructor");
	}
}

class studentschool Extends school
{
	void studentschool()
	{
		System.out.println("Thi is third student constructor");
	}
}

public class ConsInheritance {
	public static void main(String args[])
	{
		studentschool ss = new studentschool();
	}
}
package javabasics;
class Children
{
	 void show()
	{
		System.out.println("Children");
	}
}
class Boy extends Children

{
	void show()
	{
		System.out.println("Boy");
		
	}
}
class Girl extends Children
{
	void show()
	{
		System.out.println("Girl");
		
	}
	static void display()
	{
		System.out.println("Static Method");
	}
}
public class MethodOverridingUsingStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl.display();
	}

}

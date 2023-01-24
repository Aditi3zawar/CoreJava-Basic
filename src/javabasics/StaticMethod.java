package javabasics;
class Calculator
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static float div(float a,float b)
	{
		return a/b;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	String greet(String s)
	{
		return "Hello "+s;
	}
}
public class StaticMethod {
	static int sub(int a,int b)
	{
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Addition is:"+Calculator.add(15,25));
		System.out.println("Division is:"+Calculator.div(10.5f, 1.5f));
		System.out.println("Subtraction is:"+sub(5, 2));
		Calculator c=new Calculator();
		int m=c.mul(5, 3);
		System.out.println("Addition is:"+c.add(1,25)); //Using reference variable
		System.out.println("Multiplication is:"+m);
		System.out.println("String Method:"+c.greet("Aditi"));
	}

}

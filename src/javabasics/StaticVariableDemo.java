package javabasics;

public class StaticVariableDemo 
{
	int a;
	static int b;
	public StaticVariableDemo() 
	{
		a++;
		b++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableDemo ob1=new StaticVariableDemo();
		StaticVariableDemo ob2=new StaticVariableDemo();
		StaticVariableDemo ob3=new StaticVariableDemo();
		StaticVariableDemo ob4=new StaticVariableDemo();
		StaticVariableDemo ob5=new StaticVariableDemo();
		StaticVariableDemo ob6=new StaticVariableDemo();
		System.out.println("The value of a by instance variable is:"+ob6.a);
		System.out.println("The value of b by static variable is:"+ob6.b);
	}

}

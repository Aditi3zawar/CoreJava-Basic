package javabasics;
class StaticClass
{
	static int c;
	static void displayc()
	{
		System.out.println("Value of c is:"+c);
	}
}
public class StaticVariable {
static int a;
static void display()
{
	System.out.println("Value of a is:"+a);
}
int b;
void display1()
{
	System.out.println("Value of b is:"+b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=10;
		display();
		StaticVariable s=new StaticVariable();
		s.b=15;
		s.display1();
		StaticClass.c=2;
		StaticClass.displayc();
	}

}

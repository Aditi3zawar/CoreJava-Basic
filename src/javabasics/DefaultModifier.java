package javabasics;
class DefClass{
	int a=10;
	void Display()
	{
		System.out.println("Value of default variable:"+a);
	}
}
public class DefaultModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefClass d=new DefClass();
		d.display();
	}

}

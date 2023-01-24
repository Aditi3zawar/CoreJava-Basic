package javabasics;
class Category
{
	 void show()
	{
		System.out.println("Category Class");
	}
}
class Cloth extends Category
{
	void show()
	{
		System.out.println("Cloth Class");
		super.show();
	}
}
class Shoe extends Category
{
	void show()
	{
		System.out.println("Shoe Class");
		
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cloth c=new Cloth();
		Shoe s=new Shoe();
		c.show();
		s.show();
	}

}

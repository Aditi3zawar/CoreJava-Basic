package javabasics;

public class ConstructorExample {
	 public ConstructorExample() {
		System.out.println("Default Constructor");
	}
	void display()
	{
		System.out.println("Method Called");
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample ce=new ConstructorExample();
		ce.display();
	}

}

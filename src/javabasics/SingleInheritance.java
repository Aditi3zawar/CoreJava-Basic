package javabasics;

class Student1
{
	void display()
	{
		System.out.println("Parent Class");
	}
}
class WorkingStudent extends Student1
{
	void showData()
	{
		System.out.println("Child Class");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkingStudent ws=new WorkingStudent();
		ws.display();
		ws.showData();
	}

}

package javabasics;
class Student2
{
	void display()
	{
		System.out.println("Parent Class");
	}
}
class WorkingStudents extends Student2
{
	void showData()
	{
		System.out.println("Child Class 1");
	}
}
class NonWorkingStudent extends Student2
{
	void showData1()
	{
		System.out.println("Child Class 2");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkingStudent ws= new WorkingStudent();
		NonWorkingStudent nws=new NonWorkingStudent();
		ws.display();
		ws.showData();
		nws.display();
		nws.showData1();
	}

}

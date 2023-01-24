package javabasics;
class Person
{
	String gender;
	Person(String g)
	{
		gender=g;
	}
	void display()
	{
		System.out.println("I am "+gender);
	}
}
class Stud extends Person
{
	String name;
	int age;
	Stud(String nm,int a)
	{
		super("Female");
		name=nm;
		age=a;
	}
	void displayStud()
	{
		super.display();
		System.out.println("My name is:"+name);
		System.out.println("My age is:"+age);
	}
	
}
class Specialization extends Stud
{
	String degree;
	Specialization(String deg)
	{
		super("Aditi",21);
		degree=deg;
	}
	void displaySpecialization()
	{
		super.displayStud();
		System.out.println("I am Specialist in "+degree);
	}
}
public class MultilevelInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Specialization sp=new Specialization("Bcs");
		sp.displaySpecialization();
		
	}

}

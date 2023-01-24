package javabasics;

public class ParameterizedConstructor {
	int rollno;
	String name,course;
	private ParameterizedConstructor(int rollno)
	{
		this.rollno=rollno;
		System.out.println("Roll no is:"+rollno);
	}
	public ParameterizedConstructor(String nm,String c) 
	{
		name=nm;
		course=c;
		System.out.println("Name and Course is:"+name+" and "+course);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor pc=new ParameterizedConstructor(6);
		ParameterizedConstructor pc1=new ParameterizedConstructor("Aditi","JFS");
		
	}

}



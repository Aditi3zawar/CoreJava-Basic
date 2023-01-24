package javabasics;
interface exam
{
	void Percent_cal();
}
class Students
{
	String name;
	int roll_no,marks1,marks2;
	Students(String n,int rn,int m1,int m2)
	{
		name=n;
		roll_no=rn;
		marks1=m1;
		marks2=m2;
		
	}
	void show()
	{
		System.out.println("Student name:"+name);
		System.out.println("Roll No:"+roll_no);
		System.out.println("Marks 1:"+marks1);
		System.out.println("Marks 2:"+marks2);
	}

}
class Result extends Students implements exam
{
	float per;
	Result(String n,int rn,int m1,int m2)
	{
		super (n,rn,m1,m2);
	}
	@Override
	public void Percent_cal() {
		// TODO Auto-generated method stub
		int tot=marks1+marks2;
		per=(float)tot/2;
		
	}
	void display()
	{
		show();
		System.out.println("Percentage="+per);
	}
	
} 

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=new Result("Shubham", 06, 75, 90);
		r.Percent_cal();
		r.display();
	}

}

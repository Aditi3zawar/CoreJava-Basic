package javabasics;

class GrandFather
{
	String gname;
	void displayG()
	{
		System.out.println("My name is:"+gname);
	}
}
class Father extends GrandFather
{
	String fname;
	void displayF()
	{
		System.out.println("My name is:"+fname);
	}
}
class Son extends Father
{
	String sname;
	void displayS()
	{
		System.out.println("My name is:"+sname);
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Son s=new Son();
		 s.gname="Ram";
		 s.fname="Vijay";
		 s.sname="Manoj";
		 s.displayG();
		 s.displayF();
		 s.displayS();
	}

}

package javabasics;

public class MethodOverloading {
	void sum(int a)
	{
		System.out.println("Sum is:"+(++a));
	}
	void sum(int a , int b)
	{
		System.out.println("Sum is:"+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("Sum is:"+(a+b+c));
	}
	float sum(float a , float b)
	{
		return a+b;
	}
	float sum(float a , int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo1=new MethodOverloading();
		mo1.sum(4);
		MethodOverloading mo2=new MethodOverloading();
		mo2.sum(4, 9);
		MethodOverloading mo3=new MethodOverloading();
		mo3.sum(1, 5, 8);
		MethodOverloading mo4=new MethodOverloading();
		mo4.sum(2.5f, 3.7f);
		float sum=mo4.sum(2.5f, 3.7f);
		System.out.println("Sum is:"+sum);
		System.out.println("Sum is:"+mo4.sum(2.5f, 3.7f));
		MethodOverloading mo5=new MethodOverloading();
		System.out.println("Sum is:"+mo5.sum(2.5f, 3));
		
		
	}

}

package javabasics;

public class ThisKeyword {
	int a;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
//	public ThisKeyword(int a)
//	{
//		this.a=a;
//		System.out.println("a:"+this.a);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThisKeyword t=new ThisKeyword(5);
		ThisKeyword t=new ThisKeyword();
		t.setA(3);
		System.out.println("Value of a is:"+t.getA());
	}

}

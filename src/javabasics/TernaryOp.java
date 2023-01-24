package javabasics;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=300,b=200,c=100,d;
		d=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The max between "+a+" and "+b+" and "+c+" is:"+d);
	}

}

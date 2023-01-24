package javabasics;

class Addition{
	int a=10,b=20;
	int add() {
		return(a+b);
	}
}
public class MethodAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		int sum=a.add();
		System.out.println("Addition is:"+sum);
	}

}

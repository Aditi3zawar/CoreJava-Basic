package javabasics;
class proctclass
{
	int a=30;
    protected void display()
	{
		System.out.println("Protected value is:"+(++a));
	}
}
public class ProtectedClass extends proctclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedClass p=new ProtectedClass();
		p.display();
		
	}

}

package javabasics;

 class SubjectMarks{
	int science;
	int maths;
	int marathi;
}
public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectMarks sm=new SubjectMarks();
			sm.science=79;
			sm.maths=90;
			sm.marathi=80;
			System.out.println("Displaying students marks in all subjects");
			System.out.println("Marks in science:"+sm.science);
			System.out.println("Marks in maths:"+sm.maths);
			System.out.println("Marks in marathi:"+sm.marathi);
	}

}

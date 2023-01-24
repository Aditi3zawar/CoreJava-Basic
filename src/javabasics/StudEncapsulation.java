package javabasics;

public class StudEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setSid(6);
		s.setSname("Aditi");
		System.out.println("Student id is:"+s.getSid());
		System.out.println("Student name is:"+s.getSname());
	}

}

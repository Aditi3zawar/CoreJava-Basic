package javabasics;
import java.util.ArrayList;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		for(int i=0;i<list.size;i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("Size of array"+list.size());
		
		
	}

	

}

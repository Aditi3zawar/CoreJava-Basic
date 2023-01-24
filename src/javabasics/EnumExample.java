package javabasics;

public class EnumExample
{
	enum meal{BREAKFAST(5), LUNCH(10), SNACKS(15), DINNER(20);   
		private int value;  
		private meal(int value)
		{  
			this.value=value;  

		}  

		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub  

			for(meal m: meal.values())  

			System.out.println(m+" "+m.value);  

		

	}

}

package datastructureproblem;

public class SumofArrayProgram4 {
	
	public static Boolean sumOfArray(int [] array, int number) {
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
        {
           sum+=array[i];
        }
		if (sum == number ) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
public static void main(String[] args) {
	
	 int[] array = {1, 2, 3, 4, 5};
	 Boolean sumOfArray = sumOfArray(array,15);
	 
	 if (sumOfArray) {
		 System.out.println("sum of array elements is equl to the given number");
		
	} else {
		System.out.println("sum of array elements is not equl to the given number");
	}
	
}
}

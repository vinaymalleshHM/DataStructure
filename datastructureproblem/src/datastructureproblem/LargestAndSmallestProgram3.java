package datastructureproblem;

public class LargestAndSmallestProgram3 {
	static void sorting(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) 
			for (int j = i; j < n; j++) 
				if (array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			
		
	}

	public static void main(String[] args) {

		int array[] = { 3, 60, 35, 2, 45, 320, 5, 666, -6 };

		sorting(array);

		System.out.println("Largest integer in array: " + array[array.length - 1]);
		System.out.println("Smallest integer in array: " + array[0]);
	}

}

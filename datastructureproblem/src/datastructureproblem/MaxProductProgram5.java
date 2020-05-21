package datastructureproblem;

public class MaxProductProgram5 {
	static void maxProduct(int array[]) {
		int a = array[0];
		int b = array[1];
		int productSum=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if ((array[i] * array[j]) > (a * b)) {
					a = array[i];
					b = array[j];
					productSum=a*b;
				}
			}
		}
		System.out.println("Maximum product of {" + a + ", " + b + "} is "+productSum);
	}

	public static void main(String[] args) {
		int array[] = { 6, 4, 1, 3, 2, 8,11 };
		maxProduct(array);
	}

}

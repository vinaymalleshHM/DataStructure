package datastructureproblem;

public class MissingNumberProgram1 {
		static int missingNumber(int a[], int n) {
			int total;
			total = (n + 1) * (n + 2) / 2;
			for (int i = 0; i < n; i++)
				total -= a[i];
			return total;
		}

		public static void main(String args[]) {
			int a[] = { 1, 2, 4, 5, 6 };
			int res = missingNumber(a, 5);
			System.out.println("Missing Number is "+res);
		}

}

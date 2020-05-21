package datastructureproblem;

public class OneDuplicateProgram2 {
	
	public static  int duplicateNumber(int [] array) {
		int count = 0;
		  for (int i = 0; i < array.length-1; i++)
	        {
	            for (int j = i+1; j < array.length; j++)
	            {
	                if ((array[i] == array[j]) && (i != j))
	                {
	                	count++;
	                	if (count > 0) {
	                		return array[i];
							
						}
	                }
	            }
	        }
		return count;
		
	}
	
	public static void main(String[] args) {
		int[] array = {0,3,1,2,3,4,4};
		int result = duplicateNumber(array);
		System.out.println("duplicate number "+result);
	}

}

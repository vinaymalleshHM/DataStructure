package datastructureproblem;

public class FiveDuplicatesProgram6 {
	
	public static  void duplicateNumber(int [] array) {
		  for (int i = 0; i < array.length-1; i++)
	        {
	            for (int j = i+1; j < array.length; j++)
	            {
	                if ((array[i] == array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+array[j]);
	                }
	            }
	        }
		
	}
	
	public static void main(String[] args) 
    {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2,};
        duplicateNumber(array);
      
    }
	

}

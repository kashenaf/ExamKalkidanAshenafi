package math;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		
		//We sort out the array using an Insertion sort Algorithm
		for(int i=1;i<array.length;i++){
			int temp=array[i];
			for(int j=i-1;j>=0 && temp<array[j];j--){
				array[j+1]=array[j];
				array[j]=temp;
			}
		}
		
		//WE print out the minimum which is the first element of the array
		System.out.println("Minimum value in the array: "+array[0]);
		
		
		
		
	}

}

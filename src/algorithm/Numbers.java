package algorithm;
import java.util.Random;
import java.util.Scanner;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm use by applying into (num array). 
	 * Display the execution time for each sorting. 
	 */

	public static void main(String[] args) {
		
		final long startTime = System.currentTimeMillis();
		
		int [] num = new int[100000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}
		Sort algo = new Sort();
		
		//Pick the sort method you want 
		Scanner input = new Scanner(System.in);
		
		algo.print_options();
		int response=input.nextInt();
		
		if(response==1)
			algo.selectionSort(num);
		if(response==2)
			algo.insertionSort(num);
		if(response==3)
			algo.bubbleSort(num);
		if(response==4)
			algo.mergeSort(num);
		if(response==5)
			algo.quickSort(num);
		if(response==6)
			algo.heapSort(num);
		if(response==7)
			algo.bucketSort(num);
		if(response==8)
			algo.shellSort(num);
	
		
		
		System.out.println("...............after sorting............");
		for(int i=0; i<num.length; i++){
			
			System.out.println(num[i]);
				
			}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		System.out.println("Total Execution Time in ms : " + executionTime + " sec");
	}

}

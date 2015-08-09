package algorithm;

public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */
	
	/*These variables are used in the helper methods
	 * for QuickSort();MergeSort()*/
	private int [] array;
	private int length;
	private int [] tempMergeArr;
	//variable for Helper method of HeapSort()
	private static int total;
	
	
    public int[] selectionSort(int [] array){
        int [] list = array;
        int temp;
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++) {
                if (list[i] > list[j]) {
                    temp=list[j];
                    list[j]=list[i];
                    list[i]=temp;
                }
            }
        }

        return list;
    }

    public int[] insertionSort(int [] array){
        int [] list = array;
        int temp;
        for(int i=1;i<list.length;i++){
			 temp=list[i];
			for(int j=i-1;j>=0 && temp<list[j];j--){
				list[j+1]=list[j];
				list[j]=temp;
			}
		}   
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        int temp;
        for(int i=0;i<list.length;i++){
			for(int j=0;j<list.length-1;j++){
				if(list[j]>list[j+1]){
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
        }   
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        this.array=array;
        this.length=list.length;
        this.tempMergeArr=new int[length];
        doMergeSort(0,length-1);
        return list;
    }
    //Helper Methods for mergeSort();
    private void doMergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle= lowerIndex + (higherIndex - lowerIndex)/2;
			//Sorts left side of the array
			doMergeSort(lowerIndex,middle);
			//sorts left side of the array
			doMergeSort(middle+1, higherIndex);
			//Merges the arrays
			mergeParts(lowerIndex,middle,higherIndex);
		}
	}
    //Helper Method for mergeSort()
    private void mergeParts(int lowerIndex, int middle, int higherIndex){
		for (int i=lowerIndex; i<=higherIndex;i++){
			tempMergeArr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		
		while(i<=middle && j<= higherIndex){
			if(tempMergeArr[i]<=tempMergeArr[j]){
				array[k]=tempMergeArr[i];
				i++;
			}else{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
	}
    
    public int [] quickSort(int [] array){
        int [] list = array;
        if(array==null||array.length==0){
        	return list;
        }
        this.array=array;
        length=array.length;
        quickSort(0,length-1);

        return list;
    }
	private void quickSort(int lowerIndex, int higherIndex){
		int i=lowerIndex;
		int j=higherIndex;
		//calculate pivot number
		int pivot=array[lowerIndex+(higherIndex-lowerIndex)/2];
		//divide into two arrays
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumber(i,j);
				//moves index to next
				i++;
				j--;
			}
		}
		//recursives quickSort method
		if(lowerIndex<j)
			quickSort(lowerIndex,j);
		if(i<higherIndex)
			quickSort(i,higherIndex);
	}
	//Helper method for QuickSort()
	private void exchangeNumber(int i, int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
    
    public int [] heapSort(int [] array){
        int [] list = array;
        Integer[] result=new Integer[list.length];
        //converting int[] into Integer[]
        for(int i=0;i<list.length;i++){
        	result[i]=Integer.valueOf(list[i]);
        }
        
        total=array.length-1;
		
		for(int i=total/2;i>=0;i--)
			heap(result,i);
		for(int i=total;i>0;i--){
			swap(result,0,i);
			total--;
			heap(result,0);
		}
		  //converting integer[] into Int[]
        for(int i=0;i<list.length;i++){
        	list[i]=result[i].intValue();
        }
        return list;
    }
    //Helper Method to heapSort()
    private static void swap(Comparable[] arr, int a, int b){
		Comparable temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	//Helper Method to heapSort()
	private static void heap(Comparable[] arr, int i){
		int left=i*2;
		int right=left+1;
		int grt=i;
		
		if(left<=total && arr[left].compareTo(arr[grt])>0) 
			grt=left;
		if(right<=total && arr[right].compareTo(arr[grt])>0)
			grt=right;
		if(grt!=i){
			swap(arr,i,grt);
			heap(arr,grt);
		}
	}

    public int [] bucketSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        int temp,i,j;
		for(int increment=list.length/2;increment>0;increment/=2){
			for(i=increment;i<list.length;i++){
				temp=list[i];
				for(j=i;j>=increment;j-=increment){
					if(temp<list[j-increment]){
						list[j]=list[j-increment];
					}else{
						break;
					}
				}
				list[j]=temp;
			}
		}
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    //This Method Prints out the option for the user
    public void print_options(){
    	System.out.println("Please Select the sort from the following:"
    			+ "\n1.selectionSort()\n2.insertionSort()"
    			+ "\n3.bubbleSort()\n4.mergeSort()\n5.quickSort()"
    			+ "\n6.heapSort()\n7.bucketSort()\n8.shellSort()"
    			+ "\n[1,2,3...8]");
    }
}
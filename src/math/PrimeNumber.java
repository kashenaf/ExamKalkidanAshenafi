package math;

public class PrimeNumber {
	//variables
		static int length=1000;
		static int [] data=new int[1000000];
		static int [] primes= new int[1000000];
		
	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on given range.
		 * 
		 */

		fill_data();
		primes();
	}
	//Method that fills the data
		public static void fill_data(){
			for(int i=1;i<length+1;i++){
				data[i]=i;
				//System.out.println(data[i]);
			}
		}
	public static int check_remainder(int x){
		int temp=x;
		int num_rem=0;
		for(int i=0;i<temp;i++){
			if(i<=temp){
				if(temp%(i+1)==0){
					num_rem++;
				}
			}
		}
		return num_rem;		
	}
	//Method that stores primes
	public static void primes(){
		for(int i=0;i<data.length;i++){
			if(check_remainder(data[i])<3){
				primes[i]=data[i];
			}
		}
		for(int i=0;i<primes.length;i++){
			if(primes[i]!=0 && primes[i]!=1)
				System.out.println(primes[i]);
		}
	}
}

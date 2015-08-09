package month.design;

public class ApplyEnum {

	/**
	 * Please design the following Feature in java.
	 */
	public static void main(String[] args) {
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */
		for(Month m : Month.values()){
			numberOfdays(m);
		}
	}
	private static void numberOfdays(Month m){
		switch(m){
		case January: System.out.println("Jan: "+ 31);
		break;
		case Febraury: System.out.println("Feb: "+ 28);
		break;
		case March: System.out.println("Mar: "+ 31);
		break;
		case April: System.out.println("April: "+ 30);
		break;
		case May: System.out.println("May: "+ 31);
		break;
		case June: System.out.println("June: "+ 30);
		break;
		case July: System.out.println("July: "+ 31);
		break;
		case August: System.out.println("Aug: "+ 31);
		break;
		case September: System.out.println("Sep: "+ 30);
		break;
		case October: System.out.println("Oct: "+ 31);
		break;
		case November: System.out.println("Nov: "+ 30);
		break;
		case December: System.out.println("Dec: "+ 31);
		break;
		
		}
	}
}

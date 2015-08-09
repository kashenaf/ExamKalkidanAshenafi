package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */

		String textFile = "/ExamJuly2015/src/data/becoming-a-developer.txt";
		String line;
		BufferedReader br=null;
		
		try{
			br = new BufferedReader(new FileReader("C:/Users/Kalkidan/gitproject/SuperSonic/src/data/becoming-a-developer"));
			
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}

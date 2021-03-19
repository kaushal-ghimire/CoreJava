package fileprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationInput {

	public static void main(String[] args) {
	/*
	  for(int i=0;i<=2;i++) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String enteredText = input.nextLine();
       System.out.println(enteredText);
	}
	  */
		
		/*File file = new File("newfile.txt");
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
		
		SubtractNumber newNumber = new 	SubtractNumber();
		try {
			System.out.println(newNumber.SubtractNumberFrom15(5));
		} catch (Exception e) {
		
			e.printStackTrace();
		}*/
		
		File file = new File("newfile.txt");
		
		try(FileReader fileReader = new FileReader(file);
		    BufferedReader bufferedReader = new BufferedReader(fileReader); 
	) {
		
		 String line = bufferedReader.readLine();
        while(line != null) {
        	
			System.out.println(line);
			line = bufferedReader.readLine();
			
                   }
		
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found..");
		} catch (IOException e) {
			
			System.out.println("Problem reading files: " + file.getName());
		}
	
	
	}
}

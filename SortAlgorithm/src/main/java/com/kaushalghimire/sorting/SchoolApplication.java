package com.kaushalghimire.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		
		
		BinarySearchImplementation binarySearch = new BinarySearchImplementation(null);
		 int result = binarySearch.binarySearch( new int[] {12 , 4 , 6 } , 3);
		System.out.println(result);
		
		
		// SpringApplication.run(SchoolApplication.class, args);
	}

}

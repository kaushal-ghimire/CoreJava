package com.kaushalghimire.school;

public class BinarySearchImplementation {
	
	
	 private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImplementation(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers , int numbersToSearch) {
		
		BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		int[] bubbleSortResult =  bubbleSort.sort(numbers);
		System.out.println(bubbleSortResult);
		
		return numbersToSearch;
		
	}


}

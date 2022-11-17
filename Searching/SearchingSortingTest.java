package datastructure.arrays.java;

import java.util.Arrays;

public class SearchingSortingTest {

	public static void main(String[] args) {
		
		int array[] = {10,90,50,65,20,4,60};
		
		for(int i=0; i<array.length ; i++) {
			System.out.println("array :"+array[i]);
		}
			System.out.println("Sorting.......");
	     	Arrays.sort(array);
	     	System.out.println("Sorting.........");
	     
	     	for(int i=0 ; i<array.length ; i++) {
	     	      System.out.println("array :"+array[i]);
	     	
	     	}
	     	int data = MyIOService.getInteger("Enter data to Search :");
	     	
	     	int first = 0;
	     	int last = array.length-1;
	     	int middle = (first + last)/2;
	     	
	     	while(first <= last) {
	     				//	
	     		if(array[middle] < data) {// to branch into the right side of the mid
	     			first = middle +1;
	     		}
	     		else if(array[middle] == data) {
	     			System.out.println("found the data: "+data+" at location "+(middle));
	     			break;
	     		}
	     		else {
	     			last = middle-1;
	     		}
	     		
	     			middle = (first + last)/2;
	     		
	     		
	       }
	     	
	     	if(first > last) 
	     		System.out.println("Data not found.....");
	            

       }
}
package datastructure.arrays.java;

public class InsertionSort {
	
	 public static void main(String arg[]) {
	      //  INSERTION SORT   //
	int array[] = {10,90,50,65,20,4,60};
	for(int i=0; i<array.length; i++) {
		System.out.println("array: "+array[i]);
	}
	
	System.out.println("Sorting ...........");
	   int d,temp;
	for(int j=1 ; j<=array.length-1 ; j++) {
		d=j;
		while(d>0 && array[d] < array[d-1]){
          temp = array[d];
		  array[d] = array[d-1];
		  array[d-1] = temp;
	        d--;
	      }
		}
	for(int i=0; i<array.length; i++) {
		System.out.println("array: "+array[i]);
	}
    }
}
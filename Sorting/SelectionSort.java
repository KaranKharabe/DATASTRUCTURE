package datastructure.arrays.java;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = {10,90,50,65,20,4,60};
		for(int i=0; i<array.length; i++) {
			System.out.println("array: "+array[i]);
		}
		
		System.out.println("Sorting ...........");
		
		for(int x=0 ; x<array.length ; x++) {
			for(int y=x+1; y<array.length ;y++) {
				
				if(array[x] > array[y]) {
					System.out.println("Swapped");
					int temp;
					temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
				
			}
			
		}
        System.out.println("Sorted----------------");
		for(int i=0; i<array.length; i++) {
			System.out.println("array: "+array[i]);
		}

	}

}

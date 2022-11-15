package datastructure.arrays.java;

import java.util.Scanner;

public class ArrayAsParameterExample {
	
	private static double[] getSquareRoot(int[] numValues){
	        int size = numValues.length; // length of Array is 5.
	        
	        double[] squareRoots = new double[size];
	        int i =0;
	        
	       for(int num : numValues){
	            double sqRoot = Math.sqrt(num);  // Here we call math function
	            squareRoots[i] = sqRoot;
	            i++;
	        }
	        return squareRoots;
	    }

	   private static void printSum(int[] numValues){
	         int sum =0;
	         for(int num : numValues) {
	             sum = sum + num;
	         }
	         System.out.println("sum is :" + sum);
	     }
	    
	     public static void main(String[] args) {

	        int numbers[] = {21,45,33,78,11};
	     //   int number[] = new int[4];
	        
	         double roots[] = getSquareRoot(numbers);
	         for(double root : roots)
	             System.out.println(root);
	         ArrayAsParameterExample.printSum(numbers);
	   
	         
	    }

}

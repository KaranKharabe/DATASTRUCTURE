package datastructure.arrays.java;
import java.util.Arrays;

public class RotateArrayTest {
	
	public static void main(String[] args) {
		
		int  sa[] = {3,7,2,6,5}; int k=3;
		System.out.println(Arrays.toString(sa));
		int rotatedArray[] = RotationTest.solution(sa, k);
		System.out.println(Arrays.toString(rotatedArray));
	}
}

 class RotationTest{

		public static int[] solution(int sourceArray[] , int k) {
			// targetArray has same length as sourceArray
			int targetArray[] = new int[sourceArray.length];
			for(int i=0 ; i<sourceArray.length ; i++) {
				
				int rotationIndex = (i + k)%sourceArray.length;
				targetArray[rotationIndex] = sourceArray[i];
			}
			return targetArray;
	
		}
		}
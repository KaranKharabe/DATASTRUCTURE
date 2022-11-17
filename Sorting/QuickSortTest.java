package datastructure.arrays.java;

import java.util.Arrays;

public class QuickSortTest {
	                  // QUICK SORT //
	public static void main(String[] args) {
		
	int array[] = {13,18,27,2,19,25};
		
	QuickSort quickSort = new QuickSort();
	quickSort.printArrayContent(array,array.length-1);
	quickSort.performQuickSort(array, 0, array.length-1);
	quickSort.printArrayContent(array,array.length-1);
		
	}

}
class QuickSort
{											//	1			2
	private int doPartition(int array[] ,int startPos , int endPos) {
		int pivot = array[endPos];//a[5]
		System.out.println("pivot : "+pivot);
		int i = (startPos -1);//-1   //0
	        // 0,1        1 <  2     ++
 	for(int j=startPos ; j<=endPos ; j++)
	{System.out.println("j"+j);
	
		if(array[j] < pivot) {
			System.out.println("if condition");
			
		i++; // -1+1 = 0; 0+1=1; //2 //3    
		System.out.println("i "+i);
		
		int tempValue = array[i];// 13
			 array[i] = array[j];
			array[j] = tempValue;
			
		}
		
	}
	int tempValue = array[i + 1];  //27
	array[i+1] = array[endPos];
	array[endPos] = tempValue;
	System.out.println((i+1)+"\t"+Arrays.toString(array));
	return i+1;
	}					// a/l value of array  ,   0 ,1       ,  2
	public void performQuickSort(int array[] , int startPos ,int endPos)
	{    //  0    <      -1
		if(startPos < endPos) {//         1         2
			int p = doPartition(array , startPos ,endPos);//4 //3 //0
		      
			performQuickSort(array,startPos,p-1);// 4-1 =3 //3-1=2
			
			performQuickSort(array,p+1 , endPos);
			}
	}
		public void printArrayContent(int array[] , int len) {
			System.out.println("------------------------------");
			for(int i=0 ; i<array.length ; i++) {
				System.out.println("Value: "+array[i]);
			}
		}
		
	}

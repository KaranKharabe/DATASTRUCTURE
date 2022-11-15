package datastructure.arrays.java;

public class QueueTest {
    public static void main(String[] args) {
    	
      MyQueue myqu = new MyQueue(5);
      myqu.add(10);
      myqu.add(20);
      myqu.add(30);
      myqu.add(40);
    //  myqu.add(50);
      

       System.out.println(myqu.remove());
       System.out.println(myqu.remove());
       System.out.println(myqu.remove());
       System.out.println(myqu.remove());
      
    }
}

class MyQueue{
	
	private int front =-1;
	private int index =-1;
	
	private int length;
	private int array[]; // just a reference
	
	
      MyQueue(int length) {
		this.length = length;
		array = new int[length];
	}
      void add(int item) {
    	  if(index > length-2) {
    		  throw new RuntimeException("Queue is full...");
          }
    	  array[++index] = item;
    	  System.out.println("added "+item+" at index "+index);
      }
          int remove() {
    	  if(front > index-1) {
    		  throw new RuntimeException("Rear reached");
    		   }
    	  return array[++front];
    	    //            5    -    0   - 1
      }	
}

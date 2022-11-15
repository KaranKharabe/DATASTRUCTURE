package datastructure.arrays.java;

public class StackTest {  // Stack LIFO

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyStack theStack = new MyStack(5);
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);
       theStack.push(60);
      
        System.out.println();
        System.out.println("=> element of the top : "+theStack.peek());
        System.out.println();
      
        System.out.println(theStack.pop());
	    System.out.println("=> element of the top : "+theStack.peek());
        System.out.println();
		  
        System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		//System.out.println(theStack.pop());
		
		System.out.println();
		
	System.out.println("=> element of the top : "+theStack.peek());
	}

}
//MyStackEmptyException is user define Exception
class MyStackOverflowException extends RuntimeException
{
	MyStackOverflowException(String message) {
		super(message);
	}
}
//MyStackEmptyException is user define Exception
class MyStackEmptyException extends RuntimeException{

	public MyStackEmptyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

class MyStack{
	int index = -1; // Here we initialize index -1 we can initilize whatever we want 
	                 // but according thing are also changes.
	int size;
	int array[] ; // just a reference to int Array

	public MyStack(int size) {
		System.out.println();
		this.size = size;
		array = new int[size];//allocation of ints
	}
	void push( int item) {
		// 10 20 30 40 50 60
		// -1  0 1  2  3  4 
		if(index > size-2) {//-1>3
			throw new MyStackOverflowException("Stack size is OverFlow");
		}
		System.out.println("pushing " +item+" to the stack..");
		//    -1 +1 = 0  // array[0] = item
		array [++index] = item;
	}
	
   int pop() {
	   System.out.println("poping item from the stack.." );
	   //   -1  < 0 
	   if(index < 0) {
	    throw new MyStackEmptyException("Stack is Empty....");
	   }     //     -1 - 1 = -2  === array[0]
	   return array [index--];
   }
   int peek() {
	   
		return array [ index ];
	}
   
}
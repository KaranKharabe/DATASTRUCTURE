package datastructure.arrays.java;

public class LinkListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kite k1 = new Kite("Red","jack",50,true);
		Kite k2 = new Kite("Green","john",60,true);
		Kite k3 = new Kite("black","jay",50,true);
		Kite k4 = new Kite("Yellow","jam",50,true);
		
		
	    k1.next = k2;
		k2.next = k3; //k1.next.next = k3
		k3.next = k4; //k1.next.next.next = k4
		
		System.out.println("k1 :"+k1);
		System.out.println("k2 :"+k2);
		System.out.println("k3 :"+k3);
		System.out.println("k4 :"+k4);
		System.out.println("--------------------");
		System.out.println("k1 :"+k1.hashCode());
		System.out.println("k2 :"+k2.hashCode());
		System.out.println("k3 :"+k3.hashCode());
		System.out.println("k4 :"+k4.hashCode());
		System.out.println("----------------------");
		
		System.out.println("k1.next :"+k1.next.hashCode());
		System.out.println("k2.next :"+k2.next.hashCode());
		System.out.println("k3.next :"+k3.next.hashCode());
		System.out.println("k4.next :"+k4.next); // by Default
		
		
		
	}

}



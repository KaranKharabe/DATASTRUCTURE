package datastructure.arrays.java;

public class DoublyLinkedListContainerTest {

	public static void main(String[] args) {
		
		MySong m1 = new MySong("My heart will go on","Titanic","Celine D",1997);
		MySong m2 = new MySong("Zinghat","Sairat","Ajay Atul",2016);
		MySong m3 = new MySong("Tanhayee","Dil chahta hai","Sonu Nigam",2001);
		MySong m4 = new MySong("Tadipar","Tadipar","MC",2020);
		
		
		MydoublyLinkedList dlList = new MydoublyLinkedList();  
		dlList.showAllSongs();
		dlList.addSong(m1);
		dlList.addSong(m2);
	    dlList.addSong(m3);
	    dlList.addSong(m4);
	    dlList.showAllSongs();
	    
	    MySong m5 = new MySong("Just do it","CDAC YCP","MySelf",2022);
	  //  dlList.deleteFromLast();
	  dlList.addFirst(m5);
		dlList.showAllSongs();
		

	}

}

class MydoublyLinkedList{
	    MySong start,ptr,temp;
	void showAllSongs() {
		if(start ==null) {
			System.out.println("Juke box is empty............");
			
		}
		else {
			ptr = start;
			
			while(ptr!=null) {
				System.out.println("DATA: "+ptr);
				System.out.println("-----------------");
				ptr=ptr.next;
			}
		}
	 }
	
	void addFirst(MySong newSong) {
		
		if(start==null) {
			System.out.println("List is empty..........");
			  start = newSong;
		}
			else {
				 
				ptr=start;
				 ptr = newSong;
				 newSong.next = start;
				 start = newSong.prev;
				 
			System.out.println(" first node Added");
			}
		
		}
		
	
	void addSong(MySong newSong) {
		// its also For addinlast same concept 
		

		if(start==null) {
			System.out.println("juke box is empty.....");
			start = newSong;
			start.prev = null;
			start.next=null;
			System.out.println("Added First Song Successfully......");
		}
		else if(start.next==null) {
			start.next = newSong;
			newSong.prev = ptr;
			newSong.next = null;
			System.out.println("Added the Second Song Successfully ............");
			}
		else {
			ptr = start.next;
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			ptr.next = newSong;
			newSong.prev = ptr;
			newSong.next = null;
			System.out.println("Added the internal Song successfully........");
		}
	
	}
	
	void insertInBetween(int yearToAbove ,MySong newSong  ) { // insert before this year
		
			boolean found=false;
			if(start == null ) {
				System.out.println("List is Empty......");
			}
			else if(start.year==yearToAbove) {
				start = newSong;
				start.prev = null;
				
				System.out.println("Added First Song Successfully......");
			}
				
			else {	
			ptr = start.next;
			while(ptr.next!=null) {
				if(ptr.year == yearToAbove) {
					System.out.println("Year Found :"+ptr);
				    found =true;
				    break;
				}
				temp = ptr;
				ptr=ptr.next;
			}
			if(found==true)
			temp.next = newSong;
			newSong.next = ptr;
			ptr.prev = newSong;
			newSong.prev=temp;
			System.out.println(" insert Succesful........");
		}
	}
	void deleteAtFirst() {  // delete a first
		
	
		if(start==null) {
			
			System.out.println("List is empty");
		}
		else {
			
		    start = start.next;
		    
	      }
		System.out.println("First Node Deleted");
    }
	
	void deleteFromLast() { // delete from last
		if(start == null) {
			System.out.println("list is empty when try to delete last node ");
		}
		else
			ptr= start.next;
		    while(ptr.next!=null) {
		    	temp = ptr;
		    	ptr = ptr.next;
		    }
		    
		    temp.next =null;
		    ptr.prev= null;
		    
		    System.out.println("last node deleted......");
	}
	
//	  Void deleteInBetween() {
		  
	  //}
		
}
	

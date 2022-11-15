package datastructure.arrays.java;

import com.mysql.cj.ClientPreparedQueryBindValue;

public interface LinkedListContainerTest {
	public static void main(String[] args) {
		
		Kite k1 = new Kite("Red","joy",50,true);
		Kite k2 = new Kite("Green","john",60,true);
		Kite k3 = new Kite("black","jay",50,true);
		Kite k4 = new Kite("Yellow","jam",80,true);
		
		MyLinkedList myList = new MyLinkedList();
		
		myList.add(k1);
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		
	    myList.showList();
		
        System.out.println("==================");
		
		Kite k6 = new Kite("White","Julie",175,true);
		
		//myList.addAtBegining(k6);
		System.out.println("==================");
	//	myList.showList();
		myList.insertkite("jay", k6);
    //    myList.deleteNodeByOwner("jam");
	//	myList.searchKiteByLength(80);
	
	//	myList.modifyOwner("jay","Karan" );
		
		//myList.deleteLastNode();
		
		
	//	m   yList.deleteFirst();
	//myList.delete(k6,3);
		
		myList.showList();
	}

}

class MyLinkedList{
	
	Kite start,ptr,temp;
	
	
	void showList() {
		if(start == null) {
			System.out.println("List is Empty");
		}
		else {
			System.out.println("List is not empty");
			ptr = start;
			while(ptr != null){
				System.out.println("DATA :"+ptr);
				ptr = ptr.next;
				
				}
			}
     	}
	void deleteFirst(){
     		
     		if(start==null) {
    			System.out.println("List is empty..nothing to search");
    		}
     		else {
     			start = start.next;
     			
     		}
     	
	   System.out.println("First Node is deleted");
	}
	
	
	
void searchKiteByLength(int lengthToSearch) {
		
		boolean found=false;
		
		if(start==null) {
			System.out.println("List is empty..nothing to search");
		}
		else {
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) {
				if(ptr.length == lengthToSearch) {
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				System.out.println("Kite not found... of this length : "+lengthToSearch);
			}
		}
	}
	void addAtBegining(Kite newKite) {
		if(start!=null) {
			System.out.println("This kite is added at the beginning of the existing list of kites...");
			newKite.next = start;
			start = newKite;
		}
		else {
			System.out.println("You are the first kite..");
			start = newKite;
		}
	}
	
	
	
	void add(Kite newKite) {
		if(start == null) {
			System.out.println("Adding first node");
			start = newKite;
			//start.next = null;
		}
		else {
			System.out.println("Adding internal node...");
			ptr=start;
			while(ptr!=null) {
				System.out.println("Searching...");
				temp = ptr;
				ptr = ptr.next;
			}
			temp.next = newKite;
			newKite.next = null;
			
		}
	}
	
	void modifyOwner(String owner1 , String owner2){
		
		if(start == null) {
			System.out.println("There is no Owner Like that...list not found");
		}
		else
			ptr = start;
		   while(ptr!=null) {
			   if(ptr.owner == owner1) {
				   ptr.owner = owner2;
				   
				   break;
			   }
			   ptr = ptr.next;
	    }
		System.out.println("Owner changes to "+ptr.owner);
		  
	
		 
		   
	}
		void deleteLastNode() {
			if(start == null) {
				System.out.println("List Empty");
			}
			else {  temp = start;
		         ptr = start.next;
		         while(ptr.next!=null) {
			     ptr = ptr.next;
			     temp = temp.next;
			   }
		        temp.next= null;
		        
		        System.out.println("Last Node Deleted");
		}
			}
	/*	void delete(Kite start , int loc) {
			if(start == null) {
				System.out.println("List is Empty");
			
			}
			else{
				System.out.println("Delete internal node...");
				 int i = 0;
				ptr=start;
				while( i < loc) {
					System.out.println("Searching...");
					temp = ptr;
					ptr = ptr.next;
					i++;
					
				}
			    
				temp.next = ptr.next;
				
		
				System.out.println("Kite node Deleted");
				
			}
		}*/
		void searchKiteByColor(String colorToSearch) {
			
			boolean found=false;
			
			if(start==null) {
				System.out.println("List is empty..nothing to search");
			}
			else {
				System.out.println("List is not empty...searching...");
				ptr = start;
				while(ptr!=null) {
					if(ptr.color == colorToSearch) {
						System.out.println("Kite Found :"+ptr);
						found=true;
						break;
					}
					ptr=ptr.next;
				}
				if(found!=true) {
					System.out.println("Kite not found... of this length : "+colorToSearch);
				}
			}
		}
		
		
		void searchKiteByOwner(String ownerToSearch) {
			
			boolean found=false;
			
			if(start==null) {  
				System.out.println("List is empty..nothing to search");
			}
			else {
				
				System.out.println("List is not empty...searching...");
				ptr = start;
				while(ptr!=null) {
					if(ptr.owner == ownerToSearch) {
						System.out.println("Kite Found :"+ptr);
						found=true;
						break;
					}
					ptr=ptr.next;
				}
				if(found!=true) {
					System.out.println("Kite not found... of this length : "+ownerToSearch);
				}
			}
		}
	
	void deleteNodeByOwner(String ownerName) {
		
		boolean found = false;
		
		if(start==null) {// This syntax said that if there start points to null
			//That means empty list
			System.out.println("List is empty....nothing to delete");
		}
		else if(start.owner.equals(ownerName)) {
			//Are you deleted owner kite but owner at it first Node then at this time we will use 
			//these syntax
			temp = start;
			start = start.next;
			temp.next = null;
			System.out.println("delete Owner from the begining");
			
		}
		else {
			//these else part we are use for deleting node for any where accept first node.
			//so that we need to make one more else part. 
			//from these else part we also delete last node.
			ptr = start;
			while(ptr!=null) {
				if(ptr.owner.equals(ownerName)) {
					found=true;
					break;
				}
				temp = ptr; 
				ptr = ptr.next;
				}
			if(found==true) {
				temp.next = ptr.next;
				System.out.println("Internal Object is Deleted....");
			    ptr.next = null;
			    ptr = null;
			}
			else {
				System.out.println("Owner name not found");
			}
		}
		
	}
	void insertkite(String ownerToFind , Kite newKite) {
		
		boolean found =false;
		
		if(start == null) {
			System.out.println("List is empty cannot add this project..");
		}
		else if(start.owner.equals(ownerToFind)){
			addAtBegining(newKite);
		}
		else {
			ptr = start;
			while(ptr!=null) {
				if(ptr.owner.equals(ownerToFind)) {
					found = true;
					break;
				}
				temp = ptr;
				ptr = ptr.next;
			}
			if(found == true)
			{
				temp.next = newKite;
				newKite.next=ptr;
				System.out.println("Object inserted BEFORE....."+ownerToFind);
				}
			else {
				System.out.println("Object not FOUND"+ownerToFind);
			}
		}
	}
		
}
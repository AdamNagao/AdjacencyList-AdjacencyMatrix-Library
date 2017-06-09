package Comp282Project3;
/* Adam Nagao
 * Comp 282 Project 2 HashTable
 */
public class LinkedList {  //A Class to create a singly linked List to be used in the HashTable
    Node head = null;
    int size;
    
    public LinkedList() { //Constructor to make Linked List Objects
        head = new Node(null);
        size = 0;
    }

    public void insert(int data) { //Insertion method that will insert at the end of the linked list
    	//A Node is created and set with the correct data then inserted
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {     //travel to the end of the linked list
             current = current.getNext();
        }
        current.setNext(temp);
        size++;        //Updated the Size of the linked list
    }
    public void insert(Edge newEdge) { //Insertion method that will insert at the end of the linked list
    	//A Node is created and set with the correct data then inserted
        Node temp = new Node(newEdge.weight);
        temp.ed = newEdge;
     
        Node current = head;
        while (current.getNext() != null) {     //travel to the end of the linked list
             current = current.getNext();
        }
        current.setNext(temp);
        size++;        //Updated the Size of the linked list
    }

    public int removeAtEnd() {        //Remove method will remove and return the data at the end of the list
         if (size != 0) {     //Only run when we have things to remove
            Node current = head;
            Node prev = null;

            while (current.getNext() != null) {          //travel the linked list
                prev = current;
                current = current.getNext();
            }

            if (prev.next != null && current.getNext() != null)    //check for null nodes
                prev.next = current.getNext();
            System.out.println("I removed " + current.data);
            size--;
            prev.next = null;
            return current.data;
        } else {
            return 0;   //If nothing can be removed, return 0
        }
    }

    public Edge removeAtFront(){
    	Node temp = head.next;
 
    	if(head.next!=null)
    		head = head.next;
    	size--;
    	return temp.ed;
    	
    }
    public void printList() {     //This method will print the entire list. From Last to front

        Node current = head;
        while (current.getNext() != null) {     //traverse the list
            current = current.getNext();
            System.out.print(current.data + " ");
        }
    }
}

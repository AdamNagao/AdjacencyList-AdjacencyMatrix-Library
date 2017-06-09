package Comp282Project3;
/* Adam Nagao
 * Comp 282 Project 2 HashTable
 */
public class Node { //A supporting Node class for the Linked List Class
	
    Node next = null; //Set data fields for Node Objects
    int data;
    Edge ed;
    
    public Node(int d){      //Some constructors
        data = d;
    }
    public Node(Node nd){
        next = nd;
    }
    public Node getNext(){     //Return the Next Node
        return this.next;
    }
    public void setNext(Node nd){    //Set the Next Node
        this.next = nd;
    }
}

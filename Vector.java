package Comp282Project3;
/* Adam Nagao
 * Comp 282 Project 2 HashTable
 */


public class Vector {    //A Vector class to be used in the HashTable
    public static int size;      
    public static int count;
    static LinkedList[] array;      //This static array will server as the backbone of the HashTable

    public Vector(int vectorSize) {   //Create and initialize the Vector with empty LinkedLists
        size = vectorSize;
        array = new LinkedList[size];
        for(int i = 0; i < size; i++){
            LinkedList object = new LinkedList();
            array[i] = object;
        }
    }

    public void insert(int index, int data) {    //Insertion into the Vector, and check the loadFactor
    	
        array[index].insert(data);
   
   
        count++;
        if(count >= size){     //If the loadfactor exceeds the defined amount. Double size and rehash
             doubleSize();
        }
    }

    
    public static void doubleSize() {		//Double the size of the Vector
        LinkedList[] newArray = new LinkedList[size*2];
		
        for(int i = 0;i < size ;i++){    //Transfer contents of old to new
            newArray[i] = array[i];
        }
        size = size * 2;			//Update all the needed size information
    
  
        for(int i = size/2;i<size;i++){	   //Initialize the new Vector locations with empty linked lists
            LinkedList object = new LinkedList();
            newArray[i] = object;
        }
		
        System.out.println("Here is the new array with doubled size");
		
        array = newArray;
 
    }

    public static int remove( int columnIndex) {  //This method will call the Linked List remove to remove the last node on the give Index
        System.out.println("Removing items from column " + columnIndex);
        return array[columnIndex].removeAtEnd();
    }

    public void print() {   //Print all the Vector rows
        for(int i = 0; i < size ;i++){
            System.out.print("Vertex " + i + " : ");
            array[i].printList();   //Loop through the linked list and print all nodes
            System.out.println();
        }
    }
}

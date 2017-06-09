package Comp282Project3;

public class AdjList {
	
	Vector array = new Vector(10);
	
	public AdjList(){
		
	}
	
	public void insert(int index, int data){
		array.insert(index, data);
	}
	public void delete(int index, int data){
		
	}
	public void printAdjList(){
		array.print();
	}
}

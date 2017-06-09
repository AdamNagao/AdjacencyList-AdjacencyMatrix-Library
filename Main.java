package Comp282Project3;

public class Main {

	public static void main(String[] args){
		Graph myGraph = new Graph(10);
		
		for(int j = 0; j < 15; j++){
		
			int i = (int) (Math.random() * 10);
			int k = (int) (Math.random() * 10);
			int l = (int) (Math.random() * 10);
			myGraph.addEdge(i,k,l);
	
		}
		myGraph.printList();
		System.out.println();

		myGraph.printMatrix();
		System.out.println();
		Graph.insertionSortList();
		myGraph.printMST();

	
	}
}

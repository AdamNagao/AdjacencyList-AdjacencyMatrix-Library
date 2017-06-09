package Comp282Project3;

public class Graph {
	AdjList list = new AdjList();
	AdjMatrix matrix = new AdjMatrix();
	static LinkedList EdgeList = new LinkedList();

	public Graph(int size) {

	}


	public void addEdge(int start, int end, int weight) {
		Edge newEdge = new Edge(start, end, weight);
		EdgeList.insert(newEdge);
		list.insert(start, end);
		matrix.insert(start, end, 1);
	}

	public void printMatrix() {
		matrix.printMatrix();
	}

	public void printList() {
		list.printAdjList();
	}
	

	public static Node insertionSortList() {
			Node head = EdgeList.head;
			if (head == null || head.next == null)
				return head;
	 
			Node newHead = new Node(head.data);
			Node pointer = head.next;
	 
			// loop through each element in the list
			while (pointer != null) {
				// insert this element to the new list
	 
				Node innerPointer = newHead;
				Node next = pointer.next;
	 
				if (pointer.data <= newHead.data) {
					Node oldHead = newHead;
					newHead = pointer;
					newHead.next = oldHead;
				} else {
					while (innerPointer.next != null) {
	 
						if (pointer.data > innerPointer.data && pointer.data <= innerPointer.next.data) {
							Node oldNext = innerPointer.next;
							innerPointer.next = pointer;
							pointer.next = oldNext;
						}
	 
						innerPointer = innerPointer.next;
					}
	 
					if (innerPointer.next == null && pointer.data > innerPointer.data) {
						innerPointer.next = pointer;
						pointer.next = null;
					}
				}
	 
				// finally
				pointer = next;
			}
	 
			return newHead;
		}

	public void printMST() {

		MST tree = new MST();
		tree.insert(EdgeList.head.next.ed.start);
		
		for(int i = 0; i< EdgeList.size ;i++){
	
		Edge minEdge = EdgeList.removeAtFront();
		if(!tree.find(minEdge.end)){
			tree.insert(minEdge.end);
		}
		}
		System.out.println("Printing Min Span Tree");
		tree.displayTree(tree.root, " ");
	}
}

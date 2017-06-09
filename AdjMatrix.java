package Comp282Project3;

public class AdjMatrix {
 static int[][] array = new int[10][10];

 public AdjMatrix(){
	 
 }
 
 public void insert(int row,int column, int data){
	 array[row][column] = data;
 }
 public void delete(int row,int column){
	 array[row][column] = 0;
 }
public void printMatrix(){
	for(int i = 0; i< array.length;i++){
		System.out.print("Vertex " + i + "   ");
		for(int j = 0; j < array.length;j++){
		
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
	}
}
}

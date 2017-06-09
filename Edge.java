package Comp282Project3;

public class Edge {
	int start;
	int end;
	int weight;

	public Edge(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
	public int getWeight(Edge ed){
		return weight;
	}
	public void setWeight(Edge ed, int newWeight){
		weight = newWeight;
	}
	public int getStart(Edge ed){
		return start;
	}
	public void setStart(Edge ed, int newStart){
		start = newStart;
	}
	public int getEnd(Edge ed){
		return end;
	}
	public void setEnd(Edge ed, int newEnd){
		end = newEnd;
	}
}

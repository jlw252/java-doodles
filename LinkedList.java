package jennyworld;

public class LinkedList {
	private class Node{
		int data;
		Node next; //pointer field
		Node(int d, Node next){this.data = d; this.next = next;};
	}
	
	Node first; //first thing in the list
	
	public LinkedList(){first = null;} //creates empty list
	
	public boolean isEmpty(){return first == null;} // I am pointing to nothing then the list is empty
	public void insert(int n) {Node temp = new Node(n, null); temp.next = first; first=temp;}
	public void print() {}
	public boolean member(int target) {return false;}
	public void delete (int target) {}
	public int length() {return 0;}

	public void add(Names javaList1person) {
		// TODO Auto-generated method stub
		
	}

	public void vowel() {
		// TODO Auto-generated method stub
		
	}

	public void addLast(Person person) {
		// TODO Auto-generated method stub
		
	}

}

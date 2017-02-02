package linkedlist;

public class MyLinkedList {
	
	private Node head;
	private int sizeCounter;
	
	public MyLinkedList(){

	}
	
	public void add(Object data){
		
		if (head == null) {	
			head = new Node(data);
		}			
		
		Node temp = new Node(data);
		Node current = head;
		
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		sizeCounter++;
	}
	
	public Object get(int index){
		
		if (index < 0) {
			return null;
		}
			
		if (head != null) {
			if (index == 0) {				
				return head.getData();
			}
			
			Node temp = head;
			for (int i = 0; i < sizeCounter; i++) {
				temp = temp.getNext();
				if (i == index) {
					return temp.getData();
				}
			}
		}
		return null;		
	}
	
	public int size(){
		return sizeCounter;
	}
	
	public boolean contains(Object data){
		
		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				if (current.getData().equals(data)) {
					return true;
				}				
				current = current.getNext();
			}			
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		String elements = "";
		
		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				elements += current.getData().toString() + " ";
				current = current.getNext();
			}			
		}		
		return elements;
	}
	
}

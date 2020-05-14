public class linkedList {
	
	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		
		Node temp = head;
		
		if(head == null) {
			head = toAdd;
			return;
		}
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void printAll() {
		Node temp = head;
		System.out.print("[");
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp = temp.next;
		}
		System.out.print("]");
	}
	
	void set(int index, int data) {
		int count = 0;
		Node temp = head;
		while(count<index) {
			if(temp==null) {
				System.out.println("Error\n Null Pointer Exception");
			}
			else {
				temp = temp.next;
			}
			count++;
		}
		temp.data = data;
	}
	
	void removeAll(int data) {
		Node temp = head;
		try {
			while(temp!=null) {
				temp = temp.next;
				if(temp.next.data==data) {
					temp.next = temp.next.next;
				}
				
			}
		}
		catch(NullPointerException e) {
			System.out.println("");
		}
		
	}
	
	void remove(int data) {
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			if(temp.next.data==data) {
				temp.next = temp.next.next;
				return;
			}
		}
	}
	
	void get(int index) {
		Node temp = head;
		int count = 0;
		while(count<index) {
			if(temp==null) {
				System.out.println("Error\n Null pointer Exception");
				return;
			}
			else {
				temp = temp.next;
			}
			count++;
		}
		System.out.print(temp.data);
	}
	
	void length() {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			count++;
		}
		System.out.println(count);
	}
	
	static class Node{
		
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
}
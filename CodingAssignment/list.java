//collection question-8

class Linkedlist{
	
	Node head;
	static class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	void display()
	{
	Node n = head;
	while(n!= null)
	{
		System.out.print(n.data+ "---> ");
		n=n.next;
	}
	}

	void insert(int new_data)
	{
		
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
	}
	
void insertAfter(Node prev_node,int new_data)
{
	
	if(prev_node == null)
	{
		System.out.println("Empty list !!!");
		return;
	}
	
	Node new_node = new Node(new_data);
	new_node.next = prev_node.next;
	prev_node.next = new_node;
}



	
	public static void main(String args[]){
		
		Linkedlist L1 = new Linkedlist();
		L1.head = new Node(9);
		
		L1.display();
		L1.insertAfter(7);
		System.out.println();
		
		
	}
}


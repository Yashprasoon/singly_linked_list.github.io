
public class SinglyLinkedList 
{
	private Node head;
	private static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data =data;
			this.next= null;
		}
	}
	public void print_list()
	{
		if (head==null){
			System.out.println("Underflow");
		}
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"--->");
			temp= temp.next;
		}
		System.out.print("null \n");
	}
	
	public void length()
	{
		if (head==null){
			System.out.println("Underflow");
		}
		Node temp = head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp= temp.next;
		}
		System.out.println("The length of linked list is "+count);
	}
	
	public void insertion_at_start(int data)
	{
		if (head==null)
		{
			head = new Node(data);
		}
		else
		{
			Node new_node = new Node(data);
			new_node.next =head;
			head = new_node;
		}
	}
			
	public void insertion_at_end(int data)
	{
		if (head==null)
		{
			head = new Node(data);
			return;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next= new Node(data);
		}
	}
	
	public void insertion_at_any_position(int data, int position)
	{
		if (head==null){
			System.out.println("Underflow");
		}
		int i =1;
		Node temp = head;
		while(i!=position-1)
		{
			temp = temp.next;
			i++;
		}
		Node new_node = new Node(data);
		new_node.next= temp.next;
		temp.next=new_node;
	}
		
				
			
	public static void main(String args[])
	{
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertion_at_start(1);
		sll.insertion_at_start(2);
		sll.insertion_at_start(3);
		sll.insertion_at_start(4);
		sll.insertion_at_end(9);
		sll.insertion_at_any_position(10,3);
		sll.print_list();
		sll.length();
	}
}
		

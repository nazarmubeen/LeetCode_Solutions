package DSDesign;

public class ListNode {

	public Node head;
	
	public ListNode()
	{
		head=null;
	}
	
	public Node createNodeatEnd(int data)
	{
		System.out.println("inserting data "+" "+data);
		Node temp=head;
		Node node=new Node(data);
		if(head==null)
		{
			System.out.println("creating head with data "+data);
			head=node;
			return head;
		}	
		while(temp.next!=null)
		{
			temp=temp.next;
		}	
		System.out.println("data added to node "+temp.data);
		temp.next=node;
		return head;
	}
	
	public void printList(Node head)
	{
		Node temp=head;
		
		if(head!=null)
		{
			while(temp!=null)
			{
				
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
		}
	System.out.println(" ");
	}
	 
	
}

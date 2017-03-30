package DSDesign;

public class Node {

	public int data;
	public Node next;
	
	
	public Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}
	
	public Node()
	{
		data=0;
		next=null;
	}
	
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next = next;
	}
	
	
	
	
	
}

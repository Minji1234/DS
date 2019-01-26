public class Node {
	private int val;
	private Node next;
	
	public Node(int value)
	{
		val = value;
	}
	public Node(int value, Node next)
	{
		val = value;
		this.next = next;
	}
	public void setVal(int val)
	{
		this.val = val;
	}
	public void setNext(Node next)
	{
		this.next = next;
	}
	public Node getNext()
	{
		return next;
	}
	public int getVal()
	{
		return val;
	}
	public static void main(String[] args)
	{
		Node start = new Node(42, new Node(-3));
		start.next.next = new Node(17, null);
	}
}

public class LinkedIntList {
	Node front;
	int size;
	
	public LinkedIntList(Node node)
	{
		front = node;
	}
	public void add(int value)
	{
		Node current = front;
		if (front == null)
		{
			front = new Node(value);
		}
		else
		{
			while (current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNext(new Node(value));
		}
	}
	public void add(int idx, int val)
	{
		assert (getSize() <= idx);
		Node current = front;
		if (idx == 0)
		{
			front = new Node(val, current);
		}
		else
		{
			for (int i = 0; i < idx - 1; i++)
			{
				current = current.getNext();
			}
			current.setNext(new Node(val, current.getNext()));
		}
	}
	public int getSize()
	{
		if (front == null)
			return 0;
		Node current = front;
		int s = 1;
		while (current.getNext() != null)
		{
			current = current.getNext();
			s++;
		}
		return s;
	}
	public boolean isEmpty()
	{
		return front == null;
	}
	public void clear()
	{
		front = null;
	}
	public String toString()
	{
		String str = "";
		Node current = front;
		str += current.getVal();
		for (int i = 0; i < getSize() - 1; i++)
		{
			str += " ";
			current = current.getNext();
			str += current.getVal();
		}
		str += "\n";
		return str;
	}
	public int indexOf(int val)
	{
		assert getSize() > 0;
		int cnt = 1;
		if (front.getVal() == val)
			return 0;
		else
		{
			Node current = front;
			while (current.getNext() != null)
			{
				current = current.getNext();
				if (current.getVal() == val)
					return cnt;
				cnt++;
			}
			return -1; // fail to find val.
		}
	}
	public boolean contains(int val)
	{
		return indexOf(val) >= 0;
	}
	public int remove()
	{
		assert getSize() > 0;
		int t = front.getVal();
		front = front.getNext();
		return t;
	}
	public void remove(int idx)
	{
		assert getSize() - 1 >= idx;
		Node current = front;
		if (idx == 0)
		{
			front = front.getNext();
		}
		else
		{
			for (int i = 0; i < idx - 1; i++)
			{
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
	}
	public int get(int idx)
	{
		assert (getSize() - 1 <= idx);
		Node current = front;
		for (int i = 0; i < idx - 1; i++)
		{
			current = current.getNext();
		}
		return current.getVal();
	}
	public void addSorted(int val)
	{
		if (front == null || val <= front.getVal())
		{
			front = new Node(val, front);
		}
		else
		{
			Node current = front;
			while(current.getNext() != null)
			{
				if (current.getNext().getVal() > val)
					break;
				current = current.getNext();
			}
			current.setNext(new Node(val, current.getNext()));
		}
	}
}






















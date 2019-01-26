import java.util.Random;

public class IntTreeNode {
	private int val;
	private IntTreeNode left;
	private IntTreeNode right;
	
	public IntTreeNode(int value)
	{
		this(value, null, null);
	}
	public IntTreeNode(int value, IntTreeNode l, IntTreeNode r)
	{
		val = value;
		left = l;
		right = r;
	}
	public int getVal()
	{
		return val;
	}
	public IntTreeNode getLeft()
	{
		return left;
	}
	public IntTreeNode getRight()
	{
		return right;
	}
	public IntTreeNode setLeft(IntTreeNode l)
	{
		left = l;
		return left;
	}
	public IntTreeNode setLeft(int val)
	{
		left = new IntTreeNode(val);
		return left;
	}
	public IntTreeNode setRight(IntTreeNode r)
	{
		right = r;
		return right;
	}
	public IntTreeNode setRight(int val)
	{
		right = new IntTreeNode(val);
		return right;
	}
	public int getHeight(IntTreeNode node)
	{
		if (node != null)
		{
			int c = getHeight(node.getLeft()) > getHeight(node.getRight()) ? getHeight(node.getLeft()) : getHeight(node.getRight());
			return c + 1;
		}
		else
			return 0;
	}
	public void fillTree(int cnt)
	{
		Random rand = new Random();
		if (cnt >= 1)
		{
			setLeft(new IntTreeNode(1 + rand.nextInt(100)));
			setRight(new IntTreeNode(1 + rand.nextInt(100)));
			getLeft().fillTree(cnt-1);
			getRight().fillTree(cnt-1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

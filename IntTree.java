import java.util.Random;

public class IntTree {
	private IntTreeNode root;
	
	public IntTree(IntTreeNode node)
	{
		root = node;
	}
	public IntTree(int height) // generate full binary tree with input height (value between 1 to 100)
	{
		Random rand = new Random();
		root = new IntTreeNode(1 + rand.nextInt(100));
		if (height > 1)
		{
			root.fillTree(height - 1);
		}
	}
	public IntTreeNode getRoot()
	{
		return root;
	}
	public void preOrder()
	{
		preOrder(root);
		System.out.println();
	}
	private void preOrder(IntTreeNode node)
	{
		if (node != null)
		{
			System.out.print(node.getVal() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	public void inOrder()
	{
		inOrder(root);
		System.out.println();
	}
	private void inOrder(IntTreeNode node)
	{
		if (node != null)
		{
			inOrder(node.getLeft());
			System.out.print(node.getVal()+" ");
			inOrder(node.getRight());
		}
	}
	public void postOrder()
	{
		postOrder(root);
		System.out.println();
	}
	private void postOrder(IntTreeNode node)
	{
		if (node != null)
		{
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getVal() + " ");
		}
	}
	public int getHeight()
	{
		return root.getHeight(root);
	}
	public void printTree()
	{
		printTree(root, "");
	}
	private void printTree(IntTreeNode node, String tab)
	{
		if (node != null)
		{
			printTree(node.getRight(), tab + "	");
			System.out.println(tab + node.getVal());
			printTree(node.getLeft(), tab + "	");
		}
	}
	public static void main(String[] args)
	{
		IntTree tree = new IntTree(new IntTreeNode(42));
		IntTreeNode root = tree.getRoot();
		IntTreeNode a = root.setLeft(15);
		IntTreeNode b = root.setRight(9);
		IntTreeNode c = a.setRight(27);
		IntTreeNode d = b.setLeft(86);
		IntTreeNode e = b.setRight(3);
		c.setLeft(48);
		IntTreeNode f = d.setRight(12);
		e.setRight(39);
		f.setLeft(5);
		
		System.out.println("Tree Height: " + tree.getHeight());
		tree.preOrder();
		tree.inOrder();
		tree.postOrder();
		tree.printTree();
		System.out.println();
		System.out.println();
		
		IntTree tree2 = new IntTree(3);
		System.out.println("Tree Height: " + tree2.getHeight());
		tree2.preOrder();
		tree2.inOrder();
		tree2.postOrder();
		tree2.printTree();
	}
}


















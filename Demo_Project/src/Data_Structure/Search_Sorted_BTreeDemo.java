package Data_Structure;

public class Search_Sorted_BTreeDemo
{
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		public void displayData() {
			System.out.print(data+" ");
		}
	}
	
	public Node root;
	public static boolean flag = false;
	
	public Search_Sorted_BTreeDemo() {
		root = null;
	}
	
	
	public void searchNode(Node temp, int value) {
		if (root == null) {
			System.out.println("Tree is Empty");
		}
		else {
			if (temp.data == value) {
				flag = true;
				return;
			}
			if (flag == false && temp.left != null) {
				searchNode(temp.left, value);
			}
			if (flag == false && temp.right != null) {
				searchNode(temp.right, value);
			}
		}
	}
	
	public void inOrder(Node node) {
		if(node != null) {
			inOrder(node.left);
			node.displayData();
			inOrder(node.right);
		}
	}
	
	public static void main(String args[]) {
		Search_Sorted_BTreeDemo bt = new Search_Sorted_BTreeDemo();
		bt.root = new Node(50);
		bt.root.left = new Node(35);
		bt.root.right = new Node(60);
		bt.root.left.left = new Node(15);
		bt.root.left.right = new Node(40);
		bt.root.right.left = new Node(55);
		bt.root.right.right = new Node(70);
		
		bt.searchNode(bt.root, 15);
		if (flag) {
			System.out.println("Node is present");
		}else {
			System.out.println("Node is not found");
		}
		
		bt.inOrder(bt.root);
	}
}

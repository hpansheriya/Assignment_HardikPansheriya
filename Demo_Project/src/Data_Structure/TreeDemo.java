package Data_Structure;

public class TreeDemo
{
	static class Node{
		Node left;
		Node right;
		int value;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public static void insertNode(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) {
				insertNode(node.left, value);
			}else {
				System.out.println("Inserted "+value+ " to left of "+ node.value);
				node.left = new Node(value);
			}
		}
		
		if (value > node.value) {
			if (node.right != null) {
				insertNode(node.right, value);
			}else {
				System.out.println("Inserted "+value+ " to right of "+ node.value);
				node.right = new Node(value);
			}
		}
	}
	
	public static void main(String args[]) {
		Node root = new Node(45);
		insertNode(root, 40);
		insertNode(root, 60);
		insertNode(root, 90);
		insertNode(root, 32);
		insertNode(root, 20);
		insertNode(root, 55);
	}
}

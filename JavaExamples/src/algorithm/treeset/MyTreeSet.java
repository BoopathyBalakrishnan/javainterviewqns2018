package algorithm.treeset;

public class MyTreeSet {

	private Node root;

	public void add(int data) {
		Node newNode = new Node(data, null, null);
		if (root == null) {
			root = newNode;
			return;
		}

		Node currentNode = root;
		Node previousNode = root;

		while (true) {
			previousNode = currentNode;
			if (data < currentNode.data) {
				currentNode = currentNode.left;
				if (currentNode == null) {
					previousNode.left = newNode;
					return;
				}
			} else if(data > currentNode.data){
				currentNode = currentNode.right;
				if (currentNode == null) {
					previousNode.right = newNode;
					return;
				}
			}
			else
			{
				System.out.println("Duplicate record is not allowed in set");
				return;
			}
		}
	}

	public boolean find(int data) {
		Node currentNode = root;

		while (currentNode != null) {
			if (data == currentNode.data) {
				return true;
			} else if (data < currentNode.data) {
				currentNode = currentNode.left;
			} else {
				currentNode = currentNode.right;
			}
		}

		return false;
	}

	private void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}

	public void display() {
		display(root);
	}
	
	
	public boolean delete(int id){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data!=id){
			parent = current;
			if(current.data>id){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		//if i am here that means we have found the node
		//Case 1: if node to be deleted has no children
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			//now we have found the minimum element in the right sub tree
			Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
	
	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}

}

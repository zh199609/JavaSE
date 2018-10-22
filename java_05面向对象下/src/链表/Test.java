package 链表;

public class Test {
	public static void main(String[] args) {
		NodeMannager nm = new NodeMannager();
		nm.addNode(1);
		nm.addNode(2);
		nm.addNode(3);
		nm.printNode();
	}
}

class NodeMannager {
	private Node root;// 根节点
	
	
	
	// 增加节点

	public void addNode(int data) {
		if(root==null) {
			root = new Node(data);
		}else {
			root.addNode(data);
		}
		
	}

	// 删除节点
	public void delNode() {

	}

	// 输出节点
	public void printNode() {
		if(root!=null) {
			System.out.print(root.getData()+"->");
			root.printNode();
			System.out.println();
		}
	}

	// 查找节点
	public boolean findNode() {
		return true;
	}

	// 修改节点
	public void updataNode(int oldData, int newData) {

	}

	// 插入节点
	public void insertNode() {

	}

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		// 增加节点
		public void addNode(int node) {
			if(this.next==null) {
				this.next = new Node(node);
			}else {
				this.next.addNode(node);
			}
		}

		// 删除节点
		public void delNode() {

		}

		// 输出节点
		public void printNode() {
			if(this.next!=null) {
				System.out.print(this.next.data+"->");
				this.next.printNode();
			}
		}

		// 查找节点
		public boolean findNode() {
			return true;
		}

		// 修改节点
		public void updataNode(int oldData, int newData) {

		}

		// 插入节点
		public void insertNode() {

		}
	}
}

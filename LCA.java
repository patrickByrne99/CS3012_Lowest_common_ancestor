public class LCA <Key extends Comparable<Key>, Value>{
	public Node root;
	
	public class Node{
		public Key key;
		public Value val;
		public Node left, right;
		public int N;
		
		public Node(Key key, Value val){
			this.val = val;
			this.key = key;
		}
	}
	
	
	
	//Is empty implementation
	public boolean isEmpty()
	{
		return size() == 0;
	}
	
	
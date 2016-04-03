
public class Main {
	public static void main(String args[]){
//		int pre[] = {1,2,4,7,3,5,6,8};
//		int in[] = {4,7,2,1,5,3,8,6};
		
		Solution2 s = new Solution2();
		int pre[] = {2,4,7};
		int in[] = {4,7,2};
		
		TreeNode t = s.reConstructBinaryTree(pre, in);
		System.out.println(t.left.val);
	}
}

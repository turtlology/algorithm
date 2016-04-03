
public class Solution1 {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		TreeNode t = new TreeNode(pre[0]);
		int i = 0;
		if(pre.length>1){
		//find the exact position of the root in "in"
        while(in[i]!=pre[0]){
        	i++;
        }
        if(i==0){
        	int pre1[] = new int[pre.length-1];
        	System.arraycopy(pre, 1, pre1, 0, pre.length-1);
        	t.left = null;
        	t.right = reConstructBinaryTree(pre1,pre1);
        }else{
        	int pre1[] = new int[i];
        	System.arraycopy(pre, 1, pre1, 0, i);
        	int in1[] = new int[i];
        	System.arraycopy(in, 0, in1, 0, i);
        	int pre2[] = new int[pre.length-i-1];
        	System.arraycopy(pre, i+1, pre2, 0, pre.length-i-1);
        	int in2[] = new int[pre.length-i-1];
        	System.arraycopy(in, i+1, in2, 0, pre.length-i-1);
        	t.left = reConstructBinaryTree(pre1,in1);
        	if(pre2.length>0&&in2.length>0){
        		t.right = reConstructBinaryTree(pre2,in2);
        	}       	
        }
        }
        return t;
    }
}

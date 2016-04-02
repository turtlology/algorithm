package solution;
/* the solution used the system API, stack
 * */
import java.util.ArrayList;
import java.util.Stack;

public class Solution2 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack s = new Stack();
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(listNode!=null){
			s.push(listNode.val);
			listNode = listNode.next;
		}
		
		while(!s.isEmpty()){
			result.add((int)s.pop());
		}
		return result;
	}
}

package solution;
/* using the recursing method to solve the problem.
 * */
import java.util.ArrayList;

public class Solution3 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(listNode!=null){
			if(listNode.next!=null){
				result = printListFromTailToHead(listNode.next);
			}
			result.add(listNode.val);
		}
		return result;
	}
}

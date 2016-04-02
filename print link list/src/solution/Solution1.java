package solution;
/* simply using the arraylist temp to record the value and output it reversely
 * dont forget the situation that contains no node
 * */
import java.util.ArrayList;

public class Solution1 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
    	if(listNode==null){
            return result;
        }
        while(listNode.next!=null){
            temp.add(listNode.val);
            listNode = listNode.next;
        }
        temp.add(listNode.val);
        for(int i = temp.size()-1; i>=0; i--){
            result.add(temp.get(i));
        }
        return result;
    }
}

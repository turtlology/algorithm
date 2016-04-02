package solution;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		
		Solution1 s = new Solution1();
		Solution2 s2 = new Solution2();
		Solution3 s3 = new Solution3();
//		ArrayList<Integer> result = s.printListFromTailToHead(node1);
//		ArrayList<Integer> result2 = s2.printListFromTailToHead(node1);
		ArrayList<Integer> result = s3.printListFromTailToHead(node1);
		for(int i = 0; i<result.size();i++){
			System.out.println(result.get(i));
		}
	}
}

package solution;
/* make the queue using two stacks
 * push:just push in stack1
 * pop:move all the nodes from stack1 to stack2,so it can make FIFO come true
 * remember to return all the nodes back to stack1, so that the new nodes can be accepted.
 * */
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int temp = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }
}
package fibonacci;
//using the iteration way
public class Solution1 {
	public int Fibonacci(int n) {
		if(n==1){
			return 1;
		}
		if(n==2){
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
}

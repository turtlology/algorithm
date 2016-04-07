package fibonacci;
//using the recycle way
public class Solution2 {
    public int Fibonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int first = 1;
        int second = 1;
        int result = 1;
		for(int i = 1; i<n-1; i++){
            result = first+second;
            first = second;
            second = result;
        }
        return result;
    }
}
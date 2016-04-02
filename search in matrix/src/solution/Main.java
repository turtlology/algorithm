package solution;
/* the matrix contains a set of array which increases automatically from 1.
 * the length of the row also increases automatically.
 * the problem is to find a certain number.
 * */
public class Main {
	public static void main(String[] args){
		int test[][] = new int[5][5]; 
		int flag = 1;
		for(int i = 0; i<5; i++){
			for(int j = 0; j<i+1; j++){
				test[i][j] = flag;
				flag++;
			}
		}
		
//		Solution1 s = new Solution1();
		Solution2 s = new Solution2();
		System.out.println(s.Find(test, 10));
		System.out.println(s.Find(test, 16));
	}
}

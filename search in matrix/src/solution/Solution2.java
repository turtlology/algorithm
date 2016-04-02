package solution;
/* search the number using the property of the matrix
 * start from the corner of the matrix.
 * when the number is bigger, move right.
 * when the number is smaller, move upward.
 * */
public class Solution2 {
	public boolean Find(int [][] array,int target) {
		int row = array.length-1;
		int testing = array[row][0];
		int locate = 0;
		while(true){	
			int col = array[row].length-1;
			if(target>testing){
				if(locate==col){
					return false;
				}else{
					locate++;
					testing = array[row][locate];
				}
			}else if(target<testing){
				if(row>0){
					row--;
					testing = array[row][0];
				}else{
					return false;
				}
			}else if(target==testing){
				return true;
			}
		}
	}
}

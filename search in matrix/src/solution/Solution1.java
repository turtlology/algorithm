package solution;
/* the most simple solution
 * find the target number by number.
 * */
public class Solution1 {
    public boolean Find(int [][] array,int target) {
		int size = array.length;
        for(int i = 0; i<size; i++){
            int size2 = array[0].length;
            for(int j = 0; j<size2; j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
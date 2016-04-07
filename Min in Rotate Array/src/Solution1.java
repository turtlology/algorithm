//just find the minimum number but didn't use the property of the rotate array
public class Solution1 {
	public int minNumberInRotateArray(int [] array) {
		if(array.length==0){
			return 0;
		}
		int small = array[0];
		for(int i = 1; i<array.length; i++){
			if (small>array[i]){
				small = array[i];
			}
		}
		return small;
	}
}

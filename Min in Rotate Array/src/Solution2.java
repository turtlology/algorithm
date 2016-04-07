//using the property of the rotate array
//the array can be cut into two arrays which are both increasing 
//thus, find the first number that smaller than the number before is the way to find the smallest one
//if we can't find this one, we can return the first one
public class Solution2 {
	public int minNumberInRotateArray(int [] array) {
		if(array.length==0){
			return 0;
		}
		int temp = array[0];
		for(int i = 1; i<array.length;i++){
			if(array[i]<temp){
				return array[i];
			}
			temp = array[i];
		}
		return array[0];
	}
}

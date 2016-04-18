/* using the bitwise operation can be really faster
 * */
public class Solution2 {
	public int JumpFloor(int target) {
		return 1<<--target;
    }
}

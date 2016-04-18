/* every step except the last one has the status of whether be jumped or not
 * thus, there are 2^n ways to jump on the stair
 * */
public class Solution1 {
	public int JumpFloorII(int target) {
        return (int) Math.pow(2, target-1);
    }
}

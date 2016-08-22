package easy0720;
/*
 * n=7,k=3
 * [1,2,3,4,5,6,7] to [5,6,7,1,2,3,4]
 * 要求空间复杂度为o(1)
 */
public class RotateArray {
	public void rotate(int[] nums, int k) {
		if(nums == null || nums.length == 0) return ;
		if(nums.length==1 || k==0 || k ==nums.length) return;//特殊情况
		int len = nums.length;
		k = k%len;
		int idx = 0;
		int temp = nums[idx];
		int temp2;
		for(int i=0,j=0;i<len;i++){
			idx = (idx +k)%len;
			temp2 = nums[idx];
			nums[idx] = temp;
			temp = temp2;
			if(idx==j){
				idx = ++j;
				temp = nums[idx];
			}
		}
		}
}

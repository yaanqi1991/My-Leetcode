package easy0712;
/*
 * 去掉有序数组里的重复数字，返回新的数组长度
 * 2个指针快慢遍历，当fast扫到2个相邻的不一样时候 slow 才动 
 */
public class RemoveDuplicates {
	public int removeDuplicates(int[] A) {
		
		if (A == null || A.length <= 1) {
		      return A == null ? 0 : A.length;
		    }
		int count = 1;
		for(int i = 1;i<A.length;i++){
			if( A[i] != A[i-1]){
				A[count++] = A[i];//A[count]==A[i];count+1;
			}
		}
		
		return count;
	}
}

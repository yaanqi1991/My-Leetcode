package easy0712;
/*
 * ȥ��������������ظ����֣������µ����鳤��
 * 2��ָ�������������fastɨ��2�����ڵĲ�һ��ʱ�� slow �Ŷ� 
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

package easy0719;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
        if(n == 0) return;//如果B为空，返回A
        //从最后一位开始归并
        while(m>0 && n>0){
        	if(A[m-1]>B[n-1]){
        		A[m + n - 1] = A[m-1]; 
        		m--;
        	}else{
        		A[m+n-1] = B[n-1];
        		n--;
        	}
        }
        //如果A为空，则将B复制到A
        while(n>0) {
            A[n-1] = B[n-1];
            n--;
        }
	   }
}

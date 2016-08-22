package easy0712;

//删除数组内给定值的元素 然后返回删除后的长度
//聪明的做法： 两个指针都从0开始，从左向右找++，如果不等于elem 就i j都++  A[i]=A[J]
//如果等于elem就只j++ i不动.下一次再到不同的时候依旧 	A[i]=A[j];
public class RemoveElement {
	public int removeElement(int[] A,int elem) {
		if(A == null || A.length == 0){
			return 0;
		}
		
		int i = 0;
		int j = A.length;
		while(i < j){
			if(A[i] == elem){
				A[i] = A[j-1];//?不懂
				j--;
			}else{
				i++;
			}
		}
		
		return j;
	}
}

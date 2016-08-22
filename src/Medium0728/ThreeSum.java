package Medium0728;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * ������֮��Ϊ0��ͷβ����ָ�룬list����
 */
public class ThreeSum {
/*	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		
		Arrays.sort(num);//������
		if(num.length < 3){
			return result;
		}else if(num.length == 3){
			if((num[0] + num[1] + num[2]) == 0){
				ArrayList< Integer> temArray = new ArrayList<>();
				temArray.add(num[0]);
				temArray.add(num[1]);
				temArray.add(num[2]);
				result.add(temArray);
			}else{
				return result;
			}
		}else{
			for(int i=0;i<num.length-3;i++){
				if(i!=0&&num[i]== num[i-1]){
					continue;
				}
				judgeAndPut(num,i,i+1,num.length-1);
			}
		}
		
		return result;
        
    }

	private void judgeAndPut(int[] num, int i, int j, int end) {
		while(j<end){
			if(num[i] + num[j] + num[end] <0){
				j++;
			}else if (num[i] + num[j] + num[end] >0) {
				end--;
			}else if (num[i] + num[j] + num[end] == 0) {
				ArrayList< Integer> temArray = new ArrayList<>();
				temArray.add(num[i]);
				temArray.add(num[j]);
				temArray.add(num[end]);
				result.add(temArray);
				j++;
				end--;
				while((j < end)&&num[j]==num[j-1]){
					j++;
				}
				while((j<end)&& (end<num.length-1)&& num[end]==num[end+1]){
					end--;
				}
			}
		}
	}*/
	
	/*
	 * ���ȶ������������
	 * ����ȡ����i�����������ظ���
	 * ����ת��Ϊ2Sum����
	 * ��������ָ�룺left right
	 * �ҳ��̶�left����ʱleft��ָ��λ��Ϊ��������С�������ҵ���������
	 * ����left�������Ƿ�Ϊ0
	 * 
	 */
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		Arrays.sort(num);//����
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();//��Ž��
		
		//������ȡ��һ������ת��Ϊ2�����
		for(int i=0;i<num.length;i++){
			if(i==0 || num[i]!=num[i-1]){//��ֹ�ظ�,�˴�ע���±�Խ��
				//��������ָ��
				int left = i+1; 
				int right = num.length -1;
				//2sum���̶�left���ҵ����right
				while(left <  right){
					//right���ƣ���Сnum[right]��ֵ
					while(left < right && num[i]+num[left]+num[right]>0){
						right--;
					}
					if (left < right && num[i]+num[left]+num[right] == 0) {
						ArrayList< Integer> temArray = new ArrayList<>();
						temArray.add(num[i]);
						temArray.add(num[left]);
						temArray.add(num[right]);
						result.add(temArray);
						//ȥ�ظ�
						while(left<right&& num[left]==temArray.get(1)) left++;
					}else{// num[i] + num[left] + num[right] < 0�������left���ƣ�����num[left]��ֵ
						left++;
					}
				}
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		int num[] = {};  
        System.out.println(new ThreeSum().threeSum(num));
	}
	
}

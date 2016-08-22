package Medium0728;

import java.util.Arrays;

//For example, given array S = {-1 2 1 -4}, and target = 1.
//
//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//����������������Ԫ�� Ҫ�����ǵĺ� ����target��ӽ���
//����һ��������ֻ��һ��solution����target�����

//��sort����
//Ȼ����һ����ʼcloset Ϊmax_value/2
//Ȼ�� forѭ���� 0��i-2
//ÿ��forѭ���� ��ָ��=i+1, ��ָ�� ��length-1 //��Ϊ��С���� ���� ��ʱ lp��Сrp���
//while(left<right) sum=num[i]+num[��]+num[��]
//���sum==target,���ҵ��� ���sum<target ˵����sumС�� ����left++ ,��֮right--
//Ȼ��ÿ��ѭ�����   closet=Math.abs(sum-target)<Math.abs(closet-target)?sum:closet;
//���֮ǰ��closet��target�� �ͱ��� �������forѭ���������sum��target�� ���ñ���sum����closet
public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
		if(num==null||num.length<3){
	    	 return Integer.MAX_VALUE;
	     }  
	     Arrays.sort(num); 
	    int closet=Integer.MAX_VALUE/2; // otherwise it will overflow for opeartion (closet-target) 
	    //eg:��� closetΪ���� (���target��Max_value) ��ôcloset-target ��Ϊ������� 
	    for(int i=0;i<num.length-2;i++){
	    	int left=i+1; //��ָ��
	    	int right=num.length-1; //��ָ��
	    	while(left<right){
	    		int sum= num[i]+num[left]+num[right];
	            if(sum==target){return sum;
	            }else if(sum<target){
	                left++;
	            }else{right--;}
	            closet=Math.abs(sum-target)<Math.abs(closet-target)?sum:closet;

	    	}
	    }
	     return closet;
        
    }
}
package Medium0728;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		Set<ArrayList<Integer>> result= new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i=0; i<num.length;i++){
        	for(int j=i+1;j<num.length;j++){ // ������num[n]+num[]���������2 sum
        		int m=j+1;
        		int n= num.length-1;
        		while(m<n){  //��ʱ�����Ѿ��ź��� 
        			if(i!=j&&j!=m&&m!=n){ //m n ��2sumһ�� ����ָ��2ͷɨ ��С����ָ��++ �����ָ��--
        					if(num[m]+num[n]==target-num[i]-num[j]){
        					ArrayList<Integer> list= new ArrayList<Integer>();
        					list.addAll(Arrays.asList(num[i],num[j],num[m],num[n]));
        					result.add(list);
        					m++;
        					n--;
        				}else if(num[m]+num[n]<target-num[i]-num[j]){
        				m++;	        					
        				}else{
        					n--;
        				}
        			}
        		}
        	}
        }
        
   return new ArrayList<ArrayList<Integer>>(result);    
        
	}
}

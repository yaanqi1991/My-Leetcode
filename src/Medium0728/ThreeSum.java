package Medium0728;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 三个数之和为0，头尾两个指针，list排序，
 */
public class ThreeSum {
/*	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		
		Arrays.sort(num);//先排序
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
	 * 首先对数组进行排序
	 * 依次取出第i个数，跳过重复项
	 * 问题转换为2Sum问题
	 * 定义两个指针：left right
	 * 找出固定left，此时left所指的位置为数组中最小数，再找到两个数和
	 * 后移left，求解和是否为0
	 * 
	 */
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		Arrays.sort(num);//排序
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();//存放结果
		
		//先依次取出一个数，转换为2数求和
		for(int i=0;i<num.length;i++){
			if(i==0 || num[i]!=num[i-1]){//防止重复,此处注意下标越界
				//定义左右指针
				int left = i+1; 
				int right = num.length -1;
				//2sum，固定left，找到最大right
				while(left <  right){
					//right左移，减小num[right]的值
					while(left < right && num[i]+num[left]+num[right]>0){
						right--;
					}
					if (left < right && num[i]+num[left]+num[right] == 0) {
						ArrayList< Integer> temArray = new ArrayList<>();
						temArray.add(num[i]);
						temArray.add(num[left]);
						temArray.add(num[right]);
						result.add(temArray);
						//去重复
						while(left<right&& num[left]==temArray.get(1)) left++;
					}else{// num[i] + num[left] + num[right] < 0的情况，left右移，增大num[left]的值
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

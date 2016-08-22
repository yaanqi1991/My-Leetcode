package Medium0728;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int length = numbers.length;
		int[] res = new int[2];
		
		for(int i=0;i<length;i++){
			if(map.containsValue(target-numbers[i])){
				res[0] = map.get(target - numbers[i]) + 1;
				res[1] = numbers[i] + 1;//下标从1开始
			}else{
				map.put(numbers[i], i);
			}
		}
		
		return res;
        
    }

}

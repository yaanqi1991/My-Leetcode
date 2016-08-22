package easy0719;

import java.util.ArrayList;

//左上加右上，res.get(i-1).get(j)左上+res.get(i-1).get(j+1)右上
//* [
//* [1],
//* [1,1],
//* [1,2,1],
//* [1,3,3,1],
//* [1,4,6,4,1]
//* ]
//*    matrix
//For example, given k = 3,
//Return[1,3,3,1]. 所以是从0开始计层数的

public class PascalsTriangleII {
	
	//只要保留上一层的就可以计算出本层，计算出本层后上一层就可以丢了
	public ArrayList<Integer> getRow(int rowIndex) {
		ArrayList<Integer> lastLevel=new ArrayList<Integer>();
		lastLevel.add(1);
		
		for(int i=1;i<rowIndex+1;i++){
			ArrayList<Integer> currentLevel = new ArrayList<Integer>();
			currentLevel.add(1);//每一层第一位
			
			for(int j=0;j<lastLevel.size()-1;j++){
				currentLevel.add(lastLevel.get(j)+lastLevel.get(j+1));
			}
				
			currentLevel.add(1);//每一层最后一位
			lastLevel = currentLevel;
			}
			
		
		return lastLevel;
    }
}

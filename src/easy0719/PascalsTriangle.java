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

public class PascalsTriangle {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> triangle=new ArrayList<ArrayList<Integer>>();
		
		if(numRows <= 0) return triangle;
		
		for(int i=0;i<numRows;i++){
			ArrayList<Integer> currentLevel = new ArrayList<Integer>();
			currentLevel.add(1);//每一层第一位
			if(i>0){
				//根据上一层宽度进行循环，由于本层两端的数字已经定下为1，所以本层需要计算的次数=上层宽度-1
				for(int j=0;j<triangle.get(i-1).size()-1;j++){
					currentLevel.add(triangle.get(i-1).get(j)+triangle.get(i-1).get(j+1));
				}
				currentLevel.add(1);//每一层最后一位
			}
			triangle.add(currentLevel);
		}
		return triangle;
    }
}

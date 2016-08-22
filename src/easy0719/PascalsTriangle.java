package easy0719;

import java.util.ArrayList;

//���ϼ����ϣ�res.get(i-1).get(j)����+res.get(i-1).get(j+1)����
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
			currentLevel.add(1);//ÿһ���һλ
			if(i>0){
				//������һ���Ƚ���ѭ�������ڱ������˵������Ѿ�����Ϊ1�����Ա�����Ҫ����Ĵ���=�ϲ���-1
				for(int j=0;j<triangle.get(i-1).size()-1;j++){
					currentLevel.add(triangle.get(i-1).get(j)+triangle.get(i-1).get(j+1));
				}
				currentLevel.add(1);//ÿһ�����һλ
			}
			triangle.add(currentLevel);
		}
		return triangle;
    }
}

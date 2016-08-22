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
//For example, given k = 3,
//Return[1,3,3,1]. �����Ǵ�0��ʼ�Ʋ�����

public class PascalsTriangleII {
	
	//ֻҪ������һ��ľͿ��Լ�������㣬������������һ��Ϳ��Զ���
	public ArrayList<Integer> getRow(int rowIndex) {
		ArrayList<Integer> lastLevel=new ArrayList<Integer>();
		lastLevel.add(1);
		
		for(int i=1;i<rowIndex+1;i++){
			ArrayList<Integer> currentLevel = new ArrayList<Integer>();
			currentLevel.add(1);//ÿһ���һλ
			
			for(int j=0;j<lastLevel.size()-1;j++){
				currentLevel.add(lastLevel.get(j)+lastLevel.get(j+1));
			}
				
			currentLevel.add(1);//ÿһ�����һλ
			lastLevel = currentLevel;
			}
			
		
		return lastLevel;
    }
}

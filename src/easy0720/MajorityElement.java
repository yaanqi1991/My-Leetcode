package easy0720;
/*
 * �����г���n/2�ε������������鲻Ϊ����maj���Ǵ���
 */
public class MajorityElement {
	public int majorityElement(int[] num) {
		if(num==null||num.length<=0){
            return 0;
        }
        int maj = num[0];
        int count =0;
		for(int i = 0;i<num.length;i++){
			if(count==0){
				maj = num[i];
				count++;
			}else {
				count = num[i]==maj?count + 1:count-1;
			}
		}
        count =0;
        for(int i=0;i<num.length;i++){
            if(maj==num[i]){
                count++;
            }
       }
         //�ж�    
       if(count*2<num.length){
           maj=0;
       }
        
		return maj;
	}
}

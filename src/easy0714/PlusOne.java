package easy0714;
//���һλ����+1������н�λ����һλ����+1�����û�н�λ���������飬�������λ���н�λ���򴴽�һ��length+1��������
public class PlusOne {
	public int[] plusOne(int[] digits) {
		for(int i=digits.length-1;i>=0;i--){
			digits[i] = digits[i]+1;
			if(digits[i]==10){//˵��ÿλ�������˽�λ
				digits[i]=0;
			}else {
				return digits;//ֻ����һ����λ
			}
		}
		
		//ÿλ�������˽�λ
		int[] ans = new int[digits.length+1];
		ans[0] =1;
		for(int i=0;i<digits.length;i++){
			ans[i+1] = digits[i];
		}
		return ans;
	}
}

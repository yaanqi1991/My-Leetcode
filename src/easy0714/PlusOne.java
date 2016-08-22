package easy0714;
//最后一位数字+1，如果有进位，下一位数字+1，如果没有进位，返回数组，如果所有位都有进位，则创建一个length+1的新数组
public class PlusOne {
	public int[] plusOne(int[] digits) {
		for(int i=digits.length-1;i>=0;i--){
			digits[i] = digits[i]+1;
			if(digits[i]==10){//说明每位都产生了进位
				digits[i]=0;
			}else {
				return digits;//只产生一个进位
			}
		}
		
		//每位都产生了进位
		int[] ans = new int[digits.length+1];
		ans[0] =1;
		for(int i=0;i<digits.length;i++){
			ans[i+1] = digits[i];
		}
		return ans;
	}
}

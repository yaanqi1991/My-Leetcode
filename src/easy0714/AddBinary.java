package easy0714;
//二进制加法
public class AddBinary {
	public String addBinary(String a, String b) {
		if(a == null )return b;
		if(b == null) return a;
		StringBuilder  sb = new StringBuilder();
		int i = a.length()-1;
		int j = b.length()-1;
		
		boolean carry = false;
		while(i>=0||j>=0){
			char c1 = i>=0? a.charAt(i):0;
			char c2 = j>=0? b.charAt(j):0;
			//相加过程中的三种不同情况
			if(c1 =='1'&& c2=='1'){
				if(carry) sb.append(1);//检查前一位是否产生进位
				else sb.append(0);
				carry=true;//为下一位设置进位
			}else if(c1=='1'||c2=='1'){
				if(carry){
					sb.append(0);
					carry=true;
				} 
				else {
					sb.append(1);
					carry=false;
				}
			}else{
				if (carry) sb.append(1);
				else sb.append(0);
				carry = false;	
			}
			i--;
			j--;
		}
		//每一位都加完以后
		if (carry) {
			sb.append(1);
		}
		return sb.reverse().toString();   
    }
}

package easy0714;

import org.omg.CORBA.ServiceInformation;

////题意是n=1时输出字符串1；n=2时，数上次字符串中的数值个数，因为上次字符串有1个1，
//所以输出11；n=3时，由于上次字符是11，有2个1，所以输出21；
//n=4时，由于上次字符串是21，有1个2和1个1，所以输出1211。
//n=5 时候就输出111221 one 1 one 2 two 1 n=6就是 31 2 211  
//6 answer312211 7 answer13112221依次类推，写个countAndSay(n)函数返回字符串。
//当前结果是由count+数字组成
public class CountAndSay {
		public String countAndSay(int n) {
			String res = "1";
			while(--n > 0){
				StringBuilder sb = new StringBuilder();
				char[] pre = res.toCharArray();
				for(int i = 0;i<pre.length;i++){
					int count = 1;
					while (i+1<pre.length&&pre[i]==pre[i+1]) {//找相同的数字
						count++;
						i++;
					}
					sb.append(count).append(pre[i]);
				}
				res = sb.toString();
			}
			return res;
		}
		
}

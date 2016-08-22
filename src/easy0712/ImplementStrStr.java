package easy0712;
/*
 * 在haystack这个string里看是否包含needle这个string
 * 比方说 abcde  里找 bc  如果找到就返回 bcde 没有就是null
 * 字符串部分匹配问题
 */

public class ImplementStrStr {
	public String strStr(String haystack, String needle) {
		
		int lengthOfStack = haystack.length();
		int lengthOfNeedle = needle.length();
		if(haystack == null || needle == null ||lengthOfStack < lengthOfNeedle ){
			return null;
		}
		//注意""和"",应该返回""
		for(int i=0; i<=(lengthOfStack - lengthOfNeedle);i++){
			if(haystack.substring(i, i+lengthOfNeedle).equals(needle)){
				return haystack.substring(i);
			}
		}
		
		return null;
	}

}

package easy0711;
/**
 * Write a function to find the longest common prefix string amongst an array of strings. 
 * 找一个string数组里面最长的公共前缀。
 * @author dell
 *
 */
public class LongestCommonPrefix {
	public String  longestCommonPrefix(String[] strs) {
/*		if(strs==null||strs.length==0){
			return "";
		}
		
		String prefix=strs[0];
		for(int i=0;i<strs.length;i++){
			int j=0;
			//
			while(j<strs[i].length() && j<prefix.length() && strs[i].charAt(j)==prefix.charAt(j)){
				j++;
			}
			if(j==0) return "";
			prefix = prefix.substring(0,j);
		}
	
		return prefix;
	*/	
		//把第一个String 当作前缀 然后每次都和后面的string比 然后找出共同prefix作为新的prefix
		//然后更新的prefix,再和下一个比
		
		if(strs==null) return null;
		if(strs.length==0) return "";
		if(strs.length==1) return strs[0];
		
		String word = strs[0];
		int prefixLength = word.length();
		
		for(int i=1;i<strs.length;i++){
			String nextWord = strs[i];
			prefixLength = Math.min(prefixLength, nextWord.length());
			for(int j=0;j<prefixLength;j++){
				if(word.charAt(j)!=nextWord.charAt(j)){
					prefixLength =j;
					break;
				}
			}
		}
		return word.substring(0,prefixLength);
		
	}

}

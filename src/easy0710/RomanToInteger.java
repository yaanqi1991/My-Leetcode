package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given a roman numeral, convert it to an integer.
	Input is guaranteed to be within the range from 1 to 3999.
	给罗马数字的string 然后求integer
	罗马字符可能是单独是一个字母表示 或者两个在一起是一个数字
	如果当前比前一个大，说明这一段的值应该是当前这个值减去上一个值。比如IV = 5 – 1
	否则，将当前值加入到结果中，然后开始下一段记录。比如VI = 5 + 1， II=1+1
 * @author dell
 * 
 *
 */
public class RomanToInteger {
	public static int romanToInt(String str) {
		int res = 0;
		char[] array = str.toCharArray();
		for(int i = 0;i<array.length;i++){
			if(i>0 && getChar(array[i])>getChar(array[i-1])){
				//如果后一位比前一位大这一段的值应该是当前这个值减去上一个值。比如IV = 5 – 1
				res = res + (getChar(array[i])-2*getChar(array[i-1]));				
			}else{
				res = res + getChar(array[i]);
			}
		}
		return (int)res;
		
		
	}
	private static int getChar(char c) {
		switch (c) {
		case 'I': return 1;
		case 'V': return 5; 
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		}
		return 0;
	}
	public static void main(String[] args) throws IOException{
		System.out.println("请输入字符串，以回车结尾");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		String str = stdIn.readLine();
		System.out.println("您输入的字符串为"  + str);
		System.out.println("结果为："+romanToInt(str));		
	}
}

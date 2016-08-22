package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
	判断注意一个数组是不是回文
	不允许有额外空间 看看是不是负数 
	不看编程 最基础的逻辑,如果是回文的话 那么这个int 应该== reverse(int)
 * @author dell
 * 
 *
 */
public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if(x<0)
			return false;
		return x == reverse(x);
		
	}
	private static int reverse(int x) {//之前写的ReverseInteger
		int res=0;
		while(x!=0){
			res = res*10 + x%10;
			x /=10;
		}
		return res;
	}
	public static void main(String[] args) throws IOException{
		System.out.println("请输入字符串，以回车结尾");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(stdIn.readLine());
		System.out.println("您输入的数字为"  + n);
		System.out.println("结果为："+isPalindrome(n));		
	}
}

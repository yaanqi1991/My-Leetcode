package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reverse digits of an integer.
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	注意overflow
 * @author dell
 * 
 *
 */
public class ReverseInteger {
	public static int reverse(int n) {
		long res = 0;
		while(n!=0){
			res = res *10 + n%10;
			n = n /10;
		}
		if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;//处理overflow
		return (int)res;
		
		
	}
	public static void main(String[] args) throws IOException{
		System.out.println("请输入数字，以回车结尾");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(stdIn.readLine());
		System.out.println("您输入的数字为"  + n);
		System.out.println("结果为："+reverse(n));
	}
}

package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reverse digits of an integer.
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	ע��overflow
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
		if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;//����overflow
		return (int)res;
		
		
	}
	public static void main(String[] args) throws IOException{
		System.out.println("���������֣��Իس���β");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(stdIn.readLine());
		System.out.println("�����������Ϊ"  + n);
		System.out.println("���Ϊ��"+reverse(n));
	}
}

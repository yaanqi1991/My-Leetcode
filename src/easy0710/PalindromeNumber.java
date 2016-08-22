package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
	�ж�ע��һ�������ǲ��ǻ���
	�������ж���ռ� �����ǲ��Ǹ��� 
	������� ��������߼�,����ǻ��ĵĻ� ��ô���int Ӧ��== reverse(int)
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
	private static int reverse(int x) {//֮ǰд��ReverseInteger
		int res=0;
		while(x!=0){
			res = res*10 + x%10;
			x /=10;
		}
		return res;
	}
	public static void main(String[] args) throws IOException{
		System.out.println("�������ַ������Իس���β");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(stdIn.readLine());
		System.out.println("�����������Ϊ"  + n);
		System.out.println("���Ϊ��"+isPalindrome(n));		
	}
}

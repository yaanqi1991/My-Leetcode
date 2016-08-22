package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implement atoi to convert a string to an integer.
	
	ע��overflow
 * @author dell
 * 
 *
 */
public class StringToInteger {
	public static int atoi(String str) {
		str = str.trim();//ȥ���ַ�����ͷ�ͽ�β�Ŀո�
		long res = 0;
		if(str.equals("")) return 0;
		//����λ
		boolean isPositive = true;
		if(str.charAt(0)=='-'){
			isPositive = false;
			str = str.substring(1, str.length());
		}else if(str.charAt(0)=='+'){
			str = str.substring(1, str.length());
		}
		for(int i = 0;i < str.length();i++){
			if(str.charAt(i)>'0'&& str.charAt(i)<'9'){
				res = 10 * res + (str.charAt(i)-'0');
			}else{
				break;
			}
		}
		res = isPositive? res: res*(-1);
		if(res>Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}else if(res<Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		
		return (int)res;
		
		
	}
	public static void main(String[] args) throws IOException{
		System.out.println("�������ַ������Իس���β");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		String str = stdIn.readLine();
		System.out.println("��������ַ���Ϊ"  + str);
		System.out.println("���Ϊ��"+atoi(str));		
	}
}

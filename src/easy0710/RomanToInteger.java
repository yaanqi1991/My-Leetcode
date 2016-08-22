package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given a roman numeral, convert it to an integer.
	Input is guaranteed to be within the range from 1 to 3999.
	���������ֵ�string Ȼ����integer
	�����ַ������ǵ�����һ����ĸ��ʾ ����������һ����һ������
	�����ǰ��ǰһ����˵����һ�ε�ֵӦ���ǵ�ǰ���ֵ��ȥ��һ��ֵ������IV = 5 �C 1
	���򣬽���ǰֵ���뵽����У�Ȼ��ʼ��һ�μ�¼������VI = 5 + 1�� II=1+1
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
				//�����һλ��ǰһλ����һ�ε�ֵӦ���ǵ�ǰ���ֵ��ȥ��һ��ֵ������IV = 5 �C 1
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
		System.out.println("�������ַ������Իس���β");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		String str = stdIn.readLine();
		System.out.println("��������ַ���Ϊ"  + str);
		System.out.println("���Ϊ��"+romanToInt(str));		
	}
}

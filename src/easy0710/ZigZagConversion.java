package easy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��Ŀ������
 * The string"PAYPALISHIRING"is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
	P   A   H   N
	A P L S I I G
	Y   I   R
	And then read line by line:"PAHNAPLSIIGYIR"

	Write the code that will take a string and make this conversion given a number of rows:
	string convert(string text, int nRows);
	convert("PAYPALISHIRING", 3)should return"PAHNAPLSIIGYIR".
 * @author dell
 * 
 * ʹ��StringBuffer[]
 *
 */
public class ZigZagConversion {
	public static String convert(String text,int nRows) {
		StringBuffer[] sb = new StringBuffer[nRows];
		
		for(int i=0;i<sb.length;i++){
			sb[i] = new StringBuffer();//�洢ת����ÿһ�е�����
		}
		int length = text.length();
		
		int i = 0;
		while(i<length){
			for(int j= 0;j<nRows && i<length;j++){//��0��nRows-1������
				sb[j].append(text.charAt(i++));
			}
			for(int j = nRows-2;j>0&&i<length;j--){//��nRows-2��1���м��У�����ȥͷȥβ��
				sb[j].append(text.charAt(i++));
			}
		}
		for(int k = 1;k<nRows;k++){
			sb[0].append(sb[k]);
		}
		return sb[0].toString();
		
	}
	public static void main(String[] args) throws IOException{
		System.out.println("�������ַ���text���Իس���β");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String str = stdIn.readLine();
		System.out.println("����������nRows���Իس���β");
		BufferedReader stdIn2 = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(stdIn2.readLine());
		System.out.println("��������ַ���Ϊ" + str +"������Ϊ" + n);
		System.out.println("���Ϊ��"+convert(str, n));		
	}
}

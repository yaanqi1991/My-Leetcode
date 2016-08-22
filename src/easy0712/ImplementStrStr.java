package easy0712;
/*
 * ��haystack���string�￴�Ƿ����needle���string
 * �ȷ�˵ abcde  ���� bc  ����ҵ��ͷ��� bcde û�о���null
 * �ַ�������ƥ������
 */

public class ImplementStrStr {
	public String strStr(String haystack, String needle) {
		
		int lengthOfStack = haystack.length();
		int lengthOfNeedle = needle.length();
		if(haystack == null || needle == null ||lengthOfStack < lengthOfNeedle ){
			return null;
		}
		//ע��""��"",Ӧ�÷���""
		for(int i=0; i<=(lengthOfStack - lengthOfNeedle);i++){
			if(haystack.substring(i, i+lengthOfNeedle).equals(needle)){
				return haystack.substring(i);
			}
		}
		
		return null;
	}

}

package easy0714;

import org.omg.CORBA.ServiceInformation;

////������n=1ʱ����ַ���1��n=2ʱ�����ϴ��ַ����е���ֵ��������Ϊ�ϴ��ַ�����1��1��
//�������11��n=3ʱ�������ϴ��ַ���11����2��1���������21��
//n=4ʱ�������ϴ��ַ�����21����1��2��1��1���������1211��
//n=5 ʱ������111221 one 1 one 2 two 1 n=6���� 31 2 211  
//6 answer312211 7 answer13112221�������ƣ�д��countAndSay(n)���������ַ�����
//��ǰ�������count+�������
public class CountAndSay {
		public String countAndSay(int n) {
			String res = "1";
			while(--n > 0){
				StringBuilder sb = new StringBuilder();
				char[] pre = res.toCharArray();
				for(int i = 0;i<pre.length;i++){
					int count = 1;
					while (i+1<pre.length&&pre[i]==pre[i+1]) {//����ͬ������
						count++;
						i++;
					}
					sb.append(count).append(pre[i]);
				}
				res = sb.toString();
			}
			return res;
		}
		
}

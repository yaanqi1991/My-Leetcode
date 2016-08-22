package easy0714;
//����Ϊ쳲���������
//1.���赱��n��̨��ʱ������f(n)���߷���
//2.�������һ��Ҫô��1��̨��Ҫô��2��̨�ס�
//3.�����һ����1��̨��ʱ��֮ǰ��n-1��̨�ף�����1�ļ��輴n-1��̨����f(n-1)���߷���
//4. �����һ����2��̨��ʱ��֮ǰ��n-2��̨�ף�����1�ļ��輴n-2��̨����f(n-2 )���߷���
//5.��Ȼn��̨�׵��߷�����ǰ����������߷�֮�ͼ�f(n)=f(n-1)+f(n-2)��
public class ClimbingStairs {
	public int climbStairs(int n) {
		if(n<0) return -1;
		if(n ==0 ||n==1 || n==2) return n;
		
		int first = 1,second = 2,third = 0;
		for(int i = 3;i<=n;i++){
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}
}

package easy0714;
//本质为斐波拉契数列
//1.假设当有n个台阶时假设有f(n)种走法。
//2.青蛙最后一步要么跨1个台阶要么跨2个台阶。
//3.当最后一步跨1个台阶时即之前有n-1个台阶，根据1的假设即n-1个台阶有f(n-1)种走法。
//4. 当最后一步跨2个台阶时即之前有n-2个台阶，根据1的假设即n-2个台阶有f(n-2 )种走法。
//5.显然n个台阶的走法等于前两种情况的走法之和即f(n)=f(n-1)+f(n-2)。
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

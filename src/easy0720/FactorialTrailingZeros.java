package easy0720;
/*
 * n! 尾部有多少个零
 * 给定n，那么先算能被5整除的数字有多少个。
 * 方法是计算n/5=a1，比如20/5=4,说明有4个被5整除的数字（5，10，15，20），
 * 然后计算n/25，统计一下被25整除的数字有多少个。。
 * 方法是n/25=a2，由于他是25啊，有两个5，所以要算两次。。。等等，
 * 被25整除的数字肯定被5整除，所以之前计算n/5的时候已经算过一次了。
 * 计算公式是N=a1 + a2*2-a2+a3*3-a3-a3...=a1+a2+a3+...就这样啦。
 * 给定n，需要循环[log5(n)+1]次，所以算法的复杂度是O(log n)
 * 
 *   Z =[N/5] + [N/5^2] + [N/5^3] + …
    [N/5] 表示不大于N的的数中5的倍数贡献一个5, [N/5^2] 表示不大于N的数中5^2的倍数在贡献一个5……
 */
public class FactorialTrailingZeros {
	public static void main(String[] args) {
		System.out.println(trailingZeros(20));
	}
	public static int trailingZeros(int n) {
		int r = 0;
		while(n>0){
			n /= 5;
			r += n;
		}
		return r;
	}
}

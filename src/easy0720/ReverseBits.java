package easy0720;

public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(reverseBits(43261596));//964176192

	}
	/** O(1) Time, O(1) Space 
	  * Move res 1 bit left, a 
	  * Get first bit of n, b 
	  * res = a ^ b * Move n right 1 bit for next loop 
	  *  Unsigned shift means fill new bit at the left with 0 instead of 1 
	*/
	public static int reverseBits(int n) {
		int res = 0;
		for(int i=0;i<32;i++){
			res = (res<<1)^((n>>>i)&1);
		}
		return res;
	}
}

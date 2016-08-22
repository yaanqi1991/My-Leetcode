package easy0720;
/*
 * A~Z to 1~26
 */
public class ExcelSheetColumnNum {
	public static void main(String[] args) {
		System.out.println(titleToNumber("AA"));
	}
	public static int titleToNumber(String s) {
		if(s == null || s.length()==0) return 0;
		int res = 0;
		for(int i=0;i<s.length();i++){
			res = res * 26 + (s.charAt(i)-'A'+1);
		}
		return res;
	}
}

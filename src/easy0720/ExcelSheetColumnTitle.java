package easy0720;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		if(n <= 0) return "";
		StringBuilder titlt = new StringBuilder();
		while(n>0){
			n--;
			int r = n%26;
			titlt.insert(0, (char)('A' + r));//在0处插入新字符
			n = n/26;
		}
		return titlt.toString();
	}
}

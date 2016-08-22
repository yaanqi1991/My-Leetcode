package easy0720;
/*
 * v1>v2 return 1,else return -1
 */
public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		if(version1 == null && version2 == null) return 0;
		if(version1 == null || version2 == null) return version1==null?-1:1;
		String[] list1 = version1.split("\\.");
		String[] list2 = version2.split("\\.");
		for(int i = 0; i<list1.length || i<list2.length;i++){
			int a = i<list1.length?Integer.valueOf(list1[i]):0;
			int b = i<list2.length?Integer.valueOf(list2[i]):0;
			if(a<b) {
				return -1;
			}
			else if(a>b){
				return 1;
			}
		}
		return 0;
	}
}

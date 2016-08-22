package easy0720;

public class ValidPalindrome{
	public boolean isPalindrome(String s) {
        if(s==null){return false;}
        if(s.length()==0||s.trim().equals("")){
            return true;
        }
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        
        for(char c : s.toCharArray()){
			if(Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
        }
        String string=sb.toString();
        if(string.length()==0){
        	return true;
        }
        int start=0;
        int end=string.length()-1;
        while(start<=end){
        	if(string.charAt(start)!=string.charAt(end)){
        		return false;
        	}
        start++;
        end--;
        }
        return true;
	}
}


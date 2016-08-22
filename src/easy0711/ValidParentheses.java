package easy0711;

import java.util.Stack;

/*
 * Given a string containing just the characters'(',')','{','}','['and']', determine if the input string is valid.
 * The brackets must close in the correct order,"()"and"()[]{}"are all valid but"(]"and"([)]"are not.
 * 
 * ջ������������ʱpush��ջ
 * ���stackΪ�գ�return false
 * ���ƥ�䣬��pop��ջ�������ж�
 * �����ƥ�䣬return false
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		if(s==null ||s.length()==0) return false;
		
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			if(stk.isEmpty()){
				stk.push(c);
			}else if (stk.peek()=='('&& c==')') {
				stk.pop();
			}else if (stk.peek()=='['&& c==']') {
				stk.pop();
			}else if (stk.peek()=='{'&& c=='}') {
				stk.pop();
			}else {
				stk.push(c);
			}
		}
		return stk.isEmpty();
	}
}

package easy0711;

import java.util.Stack;

/*
 * Given a string containing just the characters'(',')','{','}','['and']', determine if the input string is valid.
 * The brackets must close in the correct order,"()"and"()[]{}"are all valid but"(]"and"([)]"are not.
 * 
 * 栈，遇到左括号时push进栈
 * 如果stack为空，return false
 * 如果匹配，则pop出栈，继续判断
 * 如果不匹配，return false
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

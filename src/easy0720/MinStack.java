package easy0720;
//����һ��Stack
//����push(),pop(),top(),getMin()����

import java.util.Stack;

public class MinStack {
		private Stack<Integer> s= new Stack<>();
		/**
		 * ��׼�ⷨ������Stack��minStack�洢��Сֵmin
		 */
		private Stack<Integer> minStack = new Stack<>();
		public void push(int x) {
			s.push(x);
			if(minStack.isEmpty() || x<= minStack.peek()){
				minStack.push(x);
			}
		}
		public void pop() {
			if(s.pop().equals(minStack.peek())){
				minStack.pop();
			}
		}
		public int top() {
			return s.peek();
		}
		public int getMin() {
			return minStack.peek();
		}
}
/**
 * �ⷨ2��wrapper class for element in stack
 *
 */
class MinStack2{
	static class Elemtent{
		final int value;
		final int min;
		public Elemtent(int x, int min) {
			this.value = x;
			this.min = min;
		}
	}
	
	Stack<Elemtent> s;
	public void push(int x) {
		if(s == null) s = new Stack<Elemtent>();
		int min = s.isEmpty()? x:Math.min(x, s.peek().min);
		s.push(new Elemtent(x, min));
	}
	public void pop() {
		s.pop();
	}
	public int top() {
		return s.peek().value;
	}
	public int getMin() {
		return s.peek().min;
	}
}

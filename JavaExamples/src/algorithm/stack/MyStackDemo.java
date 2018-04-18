package algorithm.stack;

public class MyStackDemo {

	public static void main(String[] args) {

		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(50);
		System.out.println(stack.pop());
		System.out.println(stack.size());

	}

}

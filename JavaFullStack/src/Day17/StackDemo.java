package Day17;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
	static void showpush(Stack<Integer> stack,int num) {
		stack.push(num);
		System.out.println("Push: "+num+" ");
		System.out.println("Stack: "+stack);
		
	}
	static void showpop(Stack<Integer> stack) {
		System.out.println("Pop->");
		Integer intObj=stack.pop();
		System.out.println(intObj);
		System.out.println("Stack: "+stack);
	}

	public static void main(String[] args) {
		Stack< Integer> stack=new Stack<Integer>();
		System.out.println("Stack: "+stack);
		showpush(stack, 99);
		showpush(stack,2023);
		showpush(stack, 100);
		showpush(stack, 899);
		showpop(stack);
		showpop(stack);
		showpop(stack);
		showpop(stack);
		try {
			showpop(stack);
		}catch (EmptyStackException e) {
			System.out.println("Stack is empty"+e);
		}

	}

}

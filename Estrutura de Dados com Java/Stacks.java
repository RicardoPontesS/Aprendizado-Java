package stacks;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack);
		stack.push(4);
		stack.push(8);
		stack.push(10);
		System.out.println("ToString"+stack);
		System.out.println("Retorna o tamanho atual da pilha: "+stack.size());
		System.out.println("Retorna o elemento no topo da pilha: "+stack.peek());
		/* Remove o elemento no topo da pilha*/stack.pop();
		System.out.println(stack);
	}

}

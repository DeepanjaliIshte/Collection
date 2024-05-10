import java.util.Stack;

public class Stack_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("Deepanjali");
		s.push("Ishte");
		s.push(07);
		s.push(01);
		s.push(1998);
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(1998));
		
		System.out.println(s.empty());
	}

}

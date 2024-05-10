import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) {
		
		ArrayDeque<String> arrayDeque=new ArrayDeque<String>();
		arrayDeque.push("Atul");
		arrayDeque.push("Arvind");
		arrayDeque.push("Sanket");
		arrayDeque.push("Amol");
		System.out.println(arrayDeque);
		arrayDeque.pop();
		System.out.println(arrayDeque);
	}

}

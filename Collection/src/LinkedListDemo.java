import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	List<String> list=new LinkedList<String>();
	list.add("Auranagabd");
	list.add("pune");
	list.add("latur");
	System.out.println(list);
	list.add(3, "mumbai");
	System.out.println(list);
	list.contains("latur");
	System.out.println(list);
	
	
			
}
}

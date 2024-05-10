
import java.util.LinkedList;

public class LinkedList_Demo {
	public static void main (String args)
	{
		LinkedList LL=new LinkedList();
		LL.add(0,10);
		LL.add(0,11);
		LL.add(0,12);
		LL.add(1,13);
		LL.add(2,14);
		LL.add(4,15);
		LL.add(5,15);
		LL.add(6,null);
		LL.add(7,55);
		LL.add(8,null);
		LL.add(9,50);
		LL.add("DeepanjLLi");
		LL.add("Deepa");
		LL.add("Teddy");
		LL.add(100);
		LL.add(200);
		LL.add(300);
		
		System.out.println(LL);
		System.out.println();
		System.out.println(LL.size());
		System.out.println();
		System.out.println();
		LL.remove("Deepa");
		System.out.println(LL);
		System.out.println(LL.get(7));
	System.out.println();
	
	}
}

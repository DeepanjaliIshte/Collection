import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(7);
		al.add(0,10);
		al.add(0,11);
		al.add(0,12);
		al.add(1,13);
		al.add(2,14);
		al.add(4,15);
		al.add(5,15);
		al.add(6,null);
		al.add(7,55);
		al.add(8,null);
		al.add(9,50);
		al.add("Deepanjali");
		al.add("Deepa");
		al.add("Teddy");
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al);
		System.out.println();
		System.out.println(al.size());
		System.out.println();
		System.out.println();
		al.remove("Deepa");
		System.out.println(al);
		System.out.println(al.get(7));
	System.out.println();
	
	
	Iterator itr=al.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
		ArrayList al1=new ArrayList();
		al1.add("Teddy");
		al1.add(100);
		al1.add(200);
		
		al1.removeAll(al1);
		System.out.println(al1);
		System.out.println();
		
		al.clear();	
		System.out.println(al);
		System.out.println();
		
		System.out.println(al1.contains("Teddy"));
	}
}

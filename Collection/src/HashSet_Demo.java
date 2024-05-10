import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList al=new ArrayList();
		al.add(101);
		al.add(102);
		al.add(103);
		
		HashSet hs=new HashSet();
		hs.addAll(al);
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(30);
		hs.add("Deepanjali");
		hs.add(17.7);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		hs.add(10);
	
		System.out.println(hs);
		System.out.println();
		System.out.println(hs.size());
		System.out.println();
		hs.remove("Ishte");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
			{
			System.out.println(itr.next());
			}
	}

}

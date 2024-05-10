import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(17);
		al.add("Deepanjali");
		al.add('d');
		
		HashSet hs=new HashSet();
		hs.add("Deepa");
		hs.add(10);
		hs.add('s');
		
		//List l=new ArrayList();
		////List l1=new LinkedList();
		
		Set s=new HashSet();
		
		System.out.println(al);
		System.out.println(hs);
		
		al.addAll(hs);
		System.out.println(al);
		//System.out.println(l);
		//System.out.println(l1);
		//System.out.println(s);
	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(0,10);
		l.add(1,20);
		l.add(30);
		l.add(40);
		l.add(null);
		l.add(null);
		l.add(30);
		//System.out.println(l);
		
		
		/*
		Iterator itr=l.iterator();
		while(itr.hasNext())//  return the boolean value
		{
			System.out.println(itr.next());
		*/
		
		ListIterator litr=l.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	}

}

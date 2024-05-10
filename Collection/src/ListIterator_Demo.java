import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		
		l.add(10);
		l.add("Deepanjali");
		l.add("Ishte");
		
		System.out.println(l);
		ListIterator li=l.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("-------------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		
		l.add(10);
		l.add("Deepanjali");
		l.add("Ishte");
		
		System.out.println(l);
		
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

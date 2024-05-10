package Map_Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(101,'A');
		hm.put(102, 'C');
		hm.put(103,'E');
		hm.put(104,'B');
		hm.put(105, 'D');
		System.out.println(hm);
		
		Set set=hm.entrySet();
		System.out.println(set);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+"->"+entry.getValue());
	}
	}
}

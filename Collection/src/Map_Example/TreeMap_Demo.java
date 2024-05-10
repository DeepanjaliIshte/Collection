package Map_Example;

import java.util.TreeMap;

public class TreeMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
		tm.put(106,'Z');
		tm.put(105,'X');
		tm.put(103,'S');
		tm.put(102,'N');
		tm.put(104,'W');
		tm.put(101,'H');
		
		
		System.out.println(tm);
		System.out.println(tm.ceilingKey(105));
		System.out.println(tm.ceilingEntry(105));
		
		System.out.println(tm.get(102));
		System.out.println(tm.headMap(103));
		System.out.println(tm.higherEntry(104));
	}

}

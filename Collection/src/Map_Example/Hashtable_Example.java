package Map_Example;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashtable_Example
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(106, "deepak");
		ht.put(107,"deepanjali");
		ht.put(108,"sandeep");
		ht.put(109, "deepanjali");
		
		//ht.remove(109);
		System.out.println(ht);
		System.out.println(ht.contains("deepa"));
		System.out.println(ht.remove(107, "deepanjali"));
		System.out.println(ht);
		
	}

}

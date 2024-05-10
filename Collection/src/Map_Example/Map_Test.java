package Map_Example;

import java.util.HashMap;
import java.util.Map;

public class Map_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map=new HashMap();
		
		map.put(101,"Tahnos");
		map.put(102, "IronMan");
		map.put(103,"SpiderMan");
		map.put(102, "Hulk");
		map.put(null, null);
		map.put(107,"MArvel");
		map.put(105, "Avenger");
		
		//map.clear();
		System.out.println(map.containsKey(106));
		System.out.println(map.get(102));
	//	map.remove(102);
		map.replace(102, "Thor");
		System.out.println(map);
		System.out.println(map.size());
	}

}

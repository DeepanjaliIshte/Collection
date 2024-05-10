import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(101);
		list.add(103);
		list.add(100);
		list.add(190);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(1, 200);
		System.out.println(list);
		System.out.println(list.contains(103));
		System.out.println(list.indexOf(190));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		
	}

}

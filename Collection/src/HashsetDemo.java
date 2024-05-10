import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hs=new HashSet<Integer>();
		System.out.println(hs.add(101));
		hs.add(102);
		hs.add(100);
		hs.add(110);
		System.out.println(hs.add(101));
		System.out.println(hs);

	}

}

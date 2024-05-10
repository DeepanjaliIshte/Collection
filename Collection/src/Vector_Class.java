import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args) {
		Vector v=new Vector(); // initial capacity 10.
			v.add("Deepanjali");
			v.add(1, "Rohidas");
			v.add("Ishte");
			v.addElement(null);
			v.add(101);
			v.add(120.5);
			v.add('d');
			System.out.println(v);
			System.out.println(v.add("Deepa"));
		
			System.out.println(v.removeElement(120.5));
			System.out.println(v.capacity());
			v.removeAllElements();
			
	}

}

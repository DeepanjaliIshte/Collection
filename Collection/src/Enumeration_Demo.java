import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		
		v.add(10);
		v.add("Deepanjali");
		v.add(17.6);
		
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}

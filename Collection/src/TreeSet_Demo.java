import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();// TreeSet can store only homogeneous data i.e. SAme data type elements
		/*
		ts.add(10);
		ts.add(30);
		ts.add(60);
		ts.add(20);
		ts.add(40);
		*/
		
		/*
		ts.add('A');
		ts.add('C');
		ts.add('B');
		ts.add('E');
		ts.add('F');
		ts.add('D');
		*/
		ts.add("Amit");
		ts.add("Shyam");
		ts.add("Ram");
		ts.add("Ganesh");
		ts.add("Raju");
		
		//ts.clear();
		ts.remove("Raju");
		System.out.println(ts);
		
	}

}

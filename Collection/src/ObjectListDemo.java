import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ObjectListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(101);
		list.add(100.23);
		list.add("Atul");
		list.add(new Date(0));
		System.out.println(list);
		
	}

}

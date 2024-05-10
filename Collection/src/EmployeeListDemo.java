

import java.util.*;


public class EmployeeListDemo {

	public static void main(String[] args) {
		
		List<Employee> employees =new ArrayList<Employee>();
		Employee Emp= new Employee(101,"Raj",2020f);
		employees.add(Emp);
		employees.add(new Employee(103, "Atul", 52659.0f));
		employees.add(new  Employee(105, "Arvind", 1545.26f));
		System.out.println(employees);
		Iterator it=employees.listIterator();
		while(it.hasNext()) {
			Employee emp=(Employee)it.next();
			System.out.println(emp.getEmpid()+"\t"+emp.getEmpname()+"\t"+emp.getEmpsalary());
			
		}
		ArrayList<String>al=new ArrayList<String>();// Shorting by name
		for(int i=0; i<employees.size();i++) {
			Employee emp=employees.get(i);
			String name=emp.getEmpname();
			al.add(name);
		}
		ArrayList<Integer> bl=new ArrayList<Integer>();  // shorting by EmpId
		for(int i=0; i<employees.size();i++) {
			Employee emp=employees.get(i);
			Integer id =emp.getEmpid();
			bl.add(id);
		}
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.sort(bl);
		System.out.println(bl);
		Collections.reverse(bl);;
		System.out.println(bl);
		
			
		}
	
	
	}

	



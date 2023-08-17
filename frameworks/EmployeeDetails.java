package frameworks;
import java.time.LocalDate;
import java.util.*;
class Employee{
	String eName;
	int eSalary;
	LocalDate eDateOfJoining;
	//LocalDate.of(2023, 5, 10)
	String eDesignation;
	public Employee(String eName, int eSalary, LocalDate eDateOfJoining, String eDesignation) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDateOfJoining = eDateOfJoining;
		this.eDesignation = eDesignation;
	}
	@Override
	public String toString() {
		return "employee [eName=" + eName + ", eSalary=" + eSalary + ", eDateOfJoining=" + eDateOfJoining
				+ ", eDesignation=" + eDesignation + "]";
	}
}
class SortByDOJ implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.eDateOfJoining.compareTo(o2.eDateOfJoining);
	}
}
class SortByEname implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.eName.compareTo(o2.eName);
	}
	
}
class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.eSalary-o2.eSalary;
	}
	
	
}
class SortByDesignation implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.eDesignation.compareTo(o2.eDesignation);
	}
	
}
public class EmployeeDetails{
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("Yoga", 500000, LocalDate.of(2022, 2, 1), "IAS"));
		e.add(new Employee("Roja", 5000, LocalDate.of(2021, 3, 1), "Tailor"));
		e.add(new Employee("Keerthi", 30000, LocalDate.of(2021, 3, 1), "Student"));
	//	Collections.sort(e, newsortByDOJ());
	//	Collections.sort(e, newsortByEname());
	//Collections.sort(e, newsortBySalary());
		Collections.sort(e,new SortByDesignation());
		for(int i=0;i<=e.size();i++) {
			System.out.println(e.get(i));
		}
		
		
}

	
}

	

	
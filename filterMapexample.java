package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;

class Employe7{
	int id;
	String name;
	int salary;
	public Employe7(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
public class filterMapexample {
	public static void main(String[] args) {
		
	
	List<Employe7>lis=Arrays.asList(new Employe7(1,"mounika",20000),new Employe7(2,"vani",80000));
	lis.stream().filter(e->e.salary>10000).map(e->e.salary).forEach(n->System.out.println(n));
	
	}
}

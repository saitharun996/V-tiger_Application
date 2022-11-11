package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

import freemarker.core.ReturnInstruction.Return;

public class Employee implements Comparable {

	String name;
	int age;
	int salary;
	
	public Employee(String name,int age,int salary)
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
		
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		if(salary>e.salary)
		{
			return 1;
		}
		
		else if(salary<e.salary)
		{
			return -1;
			
		}
		return 0;
	}
	



	@Override
	public String toString() {

		return "age:"+age+", name:"+name+", salary:"+salary;
	}



	public static void main(String[] args) 
	{
		Employee e=new  Employee("sai",24,45000);
		Employee e1=new  Employee("Tharun",25,90000);
		Employee e2=new  Employee("Jai",50,85090);
		Employee e4=new  Employee("Vishnu",25,25000);
		
		ArrayList a=new ArrayList();
		a.add(e);
		a.add(e1);
		a.add(e2);
		a.add(e4);
		
		System.out.println(a);
		
		Collections.sort(a);

	}

}

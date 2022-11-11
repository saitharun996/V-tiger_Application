package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class CollFrame_Comparable implements Comparable {

	int age;
	String name;

	public CollFrame_Comparable(int age,String name)
	{
		this.age=age;
		this.name=name;

	}

	@Override
	public String toString()
	{
		return "age:"+age+",name:"+name;
	}

	@Override
	public int compareTo(Object o) {

		CollFrame_Comparable c=(CollFrame_Comparable)o;
		if(name.compareTo(c.name)<0)
		{
			return 1;
		}
		else if(name.compareTo(c.name)>0)
		{
			return -1;
		}
		return 0;

	}

	public static void main(String [] args)
	{
		CollFrame_Comparable c1=new CollFrame_Comparable(25,"Sai");
		CollFrame_Comparable c2=new CollFrame_Comparable(22,"Charan");
		CollFrame_Comparable c3=new CollFrame_Comparable(23,"bablu");
		CollFrame_Comparable c4=new CollFrame_Comparable(45,"Krishna");
		CollFrame_Comparable c5=new CollFrame_Comparable(26,"govind");


		ArrayList a= new ArrayList();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);
		a.add(c5);

		System.out.println(a);

		//To Sort we sort method it will gives ascending values
		Collections.sort(a);
		System.out.println(a);

		for(Object list:a)
		{
			System.out.println(list);
		}

	}










}

package ObjectClass;

public class ObjClass 
{
	
	int age;
	String name;
	 
	 ObjClass(int age,String name)
	 {
		 this.age=age;
		 this.name=name;
	 }
	 
	






	@Override
	public String toString() {
		return "ObjClass [age=" + age + ", name=" + name + "]";
	}








	public static void main(String[] args)
	{
		ObjClass o=new ObjClass(12, "sai");
		
		System.out.println(o.toString());
		 
	 }

	}




public class Main {
	public static void main(String args[])
	{
		Employee obj1=new Employee(101,"shivam","Developer",40000);
		Employee obj2= new Employee(101,"shivam","Developer",35000);
		
		System.out.println(obj1.equals(obj2));
		
		Employee e[]=new Employee[] {new Employee(101,"shivam","Developer",40000),new Employee(102,"sai","Developer",35000),new Employee(103,"Mohit","API",42000),new Employee(104,"deepak","API",45000),new Employee(102,"Jaid","Developer",40000)};
		
		Employee obj = new Employee();
		obj.sortEmployee(e);
		
		obj.displayEmployee(e,"Developer");
		
	}
}

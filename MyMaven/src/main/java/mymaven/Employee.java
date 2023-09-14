package mymaven;

public class Employee {
	
	public String display(String name,float salary)
	{
		return name+  " "  +salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		System.out.println(obj.display("Detail of first employee is:" + "anju", 123.4f));
		System.out.println(obj.display("Detail of second employee is:" +"anu", 231.8f));
	}

}

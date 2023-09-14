package mymaven;

public class ThirdProgram {
	
	String name;
	float sal;
	int age;
	ThirdProgram(String name,float sal)
	{
		this.name=name;
		this.sal=sal;
	}
	ThirdProgram(String name,float sal,int age)
	{
		this(name,sal);
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name is:" +name);
		System.out.println("Salary is:" +sal);
		System.out.println("Age is:" +age);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdProgram obj=new ThirdProgram("anija",245.3f,27);
		obj.display();

	}

}

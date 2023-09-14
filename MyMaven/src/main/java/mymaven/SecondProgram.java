package mymaven;

public class SecondProgram {
	String name;
	int a;
	SecondProgram(String str,int no)
	{
		name=str;
		a=no;
	}
	public void display()
	{
		System.out.println("Name is " +name);
		System.out.println("Number is " +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondProgram obj=new SecondProgram("anu",21);
		obj.display();
		
	}

}

package mypackage1;

public class Calculator {
	
	//create user defined method with return type
	
	public int addition(int a,int b,int c)
	{
		int result = a+b+c;
				
		return result;
	}
	//create user defined method with return type
	public int substraction(int a,int b, int c)
	{
		int result = a-b-c;
		return result ;
	}
	//create user defined method without return type
	public void comparision()
	{
	int p,q; // variable declaration
	p = 10; q = 20; //variable initialization
	}

	public static void main(String[] args) {
		Calculator operation = new Calculator();
		int add = operation.addition(5, 3, 2);
		System.out.println(add);
		int sub	= operation.substraction(5, 2,1);
		System.out.println(sub);
		
		

	}

}

package mypackage1;

public class FirstProgram {

	public static void main(String[] args) {
		Calculator operation = new Calculator();
		int add = operation.addition(5, 3, 2);
		System.out.println(add);
		int sub	= operation.substraction(5, 2,1);
		System.out.println(sub);

	}

}

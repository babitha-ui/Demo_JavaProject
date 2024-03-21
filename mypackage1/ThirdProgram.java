package mypackage1;

public class ThirdProgram {

	public static void main(String[] args) {
		Calculator oper = new Calculator();
		int add = oper.addition(5, 3, 2);
		System.out.println(add);
		int sub	= oper.substraction(5, 2,1);
		System.out.println(sub);

	}

}

package JavaAssignment7;
@FunctionalInterface
interface Addition
{
	int add(int a,int b);
}
interface Subtract
{
	int sub(int a,int b);
}
interface Multiply
{
	int mul(int a,int b);
}
interface Divide
{
	int div(int a,int b);
}

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Addition:");
		Addition Add=(a,b)->(a+b);
		System.out.println(Add.add(200,100));
		System.out.println("-----------------");
		System.out.println("Subtraction:");
		Subtract Sub=(a,b)->(a-b);
		System.out.println(Sub.sub(200,100));
		System.out.println("-----------------");
		System.out.println("Multiplication:");
		Multiply Mul=(a,b)->(a*b);
		System.out.println(Mul.mul(200, 100));
		System.out.println("-----------------");
		System.out.println("Division:");
		Divide Div=(a,b)->(a/b);
		System.out.println(Div.div(200,100));
	}
	
}




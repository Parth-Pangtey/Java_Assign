import java.util.Scanner;
public class Ques2 {
	public static void main(String args[])
	{
		System.out.println("Exception program start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		try {
		int result=a/b;
		System.out.println("Result is : " +result);
	} catch (ArithmeticException e) {
		e.printStackTrace();
		System.out.println("After dividing by integer 0 :" +e);
	}
		throw new UnsupportedOperationException("Exception thrown explicitly");
	}
}
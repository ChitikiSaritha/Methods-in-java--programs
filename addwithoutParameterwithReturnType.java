import java.util.Scanner;

public class addwithoutParameterwithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addition = addNumbers();
		System.out.println("the sum = " + addition);
		

	}
	public static int addNumbers()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a value ");
		int a = scan.nextInt();
		System.out.println("enter b value ");
		int b = scan.nextInt();
		int sum = a+b;
		return sum;
		
	}

}

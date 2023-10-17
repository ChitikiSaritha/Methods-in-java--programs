import java.util.Scanner;

public class addwithParameterwithoutReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number ");
		int a = scan.nextInt();
		System.out.println("enter the second number ");
		int b = scan.nextInt();
		addnumbers(a,b);
		scan.close();

	}
	public static void addnumbers(int x, int y)
	{
		int sum = x+y;
		System.out.println("sum is " + sum);
	}

}

import java.util.Scanner;

public class addwithParameterwithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a ");
		double a = scan.nextDouble();
		System.out.println("enter the value of b ");
		double b = scan.nextDouble();
		scan.close();
		double results = addnumbers(a,b);
		System.out.println("the results is = " + results);

	}
	public static double addnumbers(double x, double y)
	{
		double sum = x+y;
		return sum;
		
	}

}

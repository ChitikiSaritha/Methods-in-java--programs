import java.util.Scanner;

public class PuneriChai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of chai want to order ");
		int quantity = scan.nextInt();
		scan.close();
		double bill = orderchai(quantity);
		System.out.println("Your bill = " + bill);
	}
	
	public static double orderchai(int quantity)
	{
		return 10*quantity;
	}

}

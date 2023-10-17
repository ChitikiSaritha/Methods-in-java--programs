import java.util.Scanner;

public class Heightfromfeettocms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the height in feet = ");
		float height = scan.nextFloat();
		scan.close();
		float result = heightInCms(height);
		System.out.println("the height in centimeters is = " + result);
		

	}
	
	public static float heightInCms(double h) {
		float cms = (float) (h*30.48);
		return cms;
	}

}

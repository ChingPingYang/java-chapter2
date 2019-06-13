import java.util.*;

public class GettingCircleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Math:");
		double math = input.nextDouble();
		
		System.out.println("Science:");
		double science = input.nextDouble();
		
		System.out.println("English:");
		double english = input.nextDouble();
		
		double sum = (english + science + math) / 3;
		
		System.out.println("The average is " + sum);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}

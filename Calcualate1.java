import java.util.Scanner;

public class Calcualate1 {

	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int sum;
		int product;
		int largest;
		int smallest;
		double average;
		
		System.out.printf("Enter the first number:");
		num1=x.nextInt();
		
		System.out.printf("Enter the second number:");
		num2=x.nextInt();
		
		System.out.printf("Enter the third number:");
		num3=x.nextInt();
		
		sum = num1 + num2 + num3;
		System.out.printf("Sum: %d%n", sum);
		product = num1 * num2 * num3;
		
		System.out.printf("Product : %d%n", product);
		
		average=(double) (sum/3.00);
		System.out.printf("Average: %.2f%n", average);
		
		if (num1>num2)
			if(num1>num3)
		{
			System.out.printf("Largest: %d%n", num1);
		}
		if (num2>num1)
			if (num2>num3)
			{
				System.out.printf("Largest: %d%n", num2);
			}
		if (num3>num1)
			if (num3>num2)
			{
				System.out.printf("Largest: %d%n", num3);
			}
		
		
		if (num1<num2)
			if(num1<num3)
		{
			System.out.printf("Smallest: %d%n", num1);
		}
		if (num2<num1)
			if (num2<num3)
			{
				System.out.printf("Smallest: %d%n", num2);
			}
		if (num3<num1)
			if (num3<num2)
			{
				System.out.printf("Smallest: %d%n", num3);
			}
	}
}

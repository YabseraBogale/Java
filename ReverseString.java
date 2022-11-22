import java.util.Arrays;
import java.util.Scanner;
public class ReverseString{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter Number to palindrom: ");
		String num=input.nextLine();
		boolean P=false;
		for(int i=num.length()-1,j=0;i>=0 && j<num.length();i--,j++){
			if(num.charAt(i)==num.charAt(j)){
				P=true;
			}
			else{
				System.out.printf("%n%s\t%s%n","String is not pandreom",num);
				break;
			}
		}
		if(P==true){
			System.out.printf("%n%s\t%s%n","String is pandreom",num);
		}
	}
	}

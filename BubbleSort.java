import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort{
	public static void main(String args[]){
		System.out.println(makearr(6000000));
		ArrayList<Integer> Name= new ArrayList<Integer>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter ArrayList");
		for(int i=0;i<5;i++){
			System.out.printf("Enter number: ");
			int number= input.nextInt();
			System.out.println();
			Name.add(number);
		}
		System.out.printf("Number: ");
		for(int number:Name){
			System.out.printf("%5d",number);
		}
		
	}
	
	public static String makearr(int howmany){
		Random input= new Random();
		int arr[]=new int[7];
		for(int i=0;i<howmany;i++){
			++arr[1+input.nextInt(6)];
		}
		bubble(arr);
		System.out.printf("%n");
		return "Done";
	}
	
	public static void bubble(int k[]){
		System.out.printf("Before sorting");
		System.out.printf("%n%s%10s%n","i","Value");
		for(int number=0;number<k.length;number++){
			if(number==0){
				continue;
			}
			else{
				System.out.printf("%d%10d%n",number,k[number]);
			}
		}
		System.out.printf("%nAfter sorting");
		for(int i=0;i<k.length-1;i++){
			for(int j=0;j<k.length-i-1;j++){
				if(k[j]>k[j+1]){
					int temp=k[j+1];
					k[j+1]=k[j];
					k[j]=temp;
				}
			}
		}
		System.out.printf("%n%s%10s%n","i","Value");
		for(int number=0;number<k.length;number++){
			if(number==0){
				continue;
			}
			else{
				System.out.printf("%d%10d%n",number,k[number]);
			}
		}
	}
	
	}

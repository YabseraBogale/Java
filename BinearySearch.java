import java.util.Scanner;
public class BinearySearch{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		int []arr={1,2,5,6,77,88};
		int up=arr.length-1;
		int low=0;
		System.out.printf("Enter Number to Search: ");
		int number=input.nextInt();
		int p;
		
		for(int i=((up+low)/2);low<=up;i=((up+low)/2)){
			if(arr[i]==number){
				p=i;
				break;
			}
			else if(arr[i]>number){
				up=i-1;
			}
			else{
				low=i+1;
			}
		}
	}
		
	}

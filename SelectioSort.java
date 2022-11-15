import java.util.Scanner;
public class SelectioSort{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter Size: ");
		int size=input.nextInt();
		int []arr=new int[size];
		System.out.println("Enter Array");
		for(int i=0;i<size;i++){
			System.out.printf("Enter Number: ");
			arr[i]=input.nextInt();
		}
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<size;i++){
			System.out.printf("%d\t",arr[i]);
		}
	}
	
	}

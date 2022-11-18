import java.util.Scanner;
public class LinearSearch{
	public static void main(String args[]){
		int arr[]={1,3,5,6,7,88,555,2345,77555};
		Scanner input=new Scanner(System.in);
		int no=input.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==no){
				System.out.printf("%s\t%d%n","Found at location:",i);
				break;
			}
			else if(i==arr.length-1){
				System.out.printf("Not found in the List%n");
				break;
			}
		}
	}
	}

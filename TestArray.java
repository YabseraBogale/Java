import java.util.Arrays;
public class TestArray{
	public static void main(String args[]){
		int arr[]={5,12,1,2,3,4};
		System.out.println("Before sorting");
		for(int number:arr){
			System.out.println(number);
		}
		Arrays.sort(arr);
		System.out.println("After sorting");
		for(int number:arr){
			System.out.println(number);
		}
		int arr2[]=new int[6];
		Arrays.fill(arr,5);
		boolean b=Arrays.equals(arr2,arr);
		System.out.printf("%s%b","THE TWO arrays are not ",b);
		System.out.println("After fill");
		for(int number:arr){
			System.out.println(number);
		}
	
	}
	}

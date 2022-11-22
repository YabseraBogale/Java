import java.util.Arrays;
public class TestSortingWithArgs{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		System.out.printf("Index\tNumber%n");
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
			System.out.printf("%d\t%6d%n",i,arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("Array Number After Sorting");
		for(int number:arr){
			System.out.printf("%d%n",number);
		}
	}
	}

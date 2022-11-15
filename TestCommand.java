public class TestCommand{
	public static void main(String args[]){
		int j;
		if(args.length !=3){
			System.out.printf(
				"Error: Please re-enter the entire command, including%n" +
				"an array size, initial value and increment.%n"
			);
		}
		else{
			int arrlength1=Integer.parseInt(args[0]);
			int arr1[]=new int[arrlength1];
			for(int i=0;i<arr1.length;i++){
				j=i+1;
				arr1[i]=j;
			}
			int arrlength2=Integer.parseInt(args[1]);
			int arr2[]=new int[arrlength2];
			for(int i=0;i<arr2.length;i++){
				j=i+1;
				arr2[i]=j;
			}
			int arrlength3=Integer.parseInt(args[2]);
			int arr3[]=new int[arrlength3];
			for(int i=0;i<arr3.length;i++){
				j=i+1;
				arr3[i]=j;
			}
			System.out.println("Array One Number");
			for(int number:arr1){
				System.out.printf("%d%n",number);
			}
			System.out.println("Array Two Number");
			for(int number:arr2){
				System.out.printf("%d%n",number);
			}
			System.out.println("Array Three Number");
			for(int number:arr3){
				System.out.printf("%d%n",number);
			}
		}
	}
	}

public class TestingCommandLine_v2{
	public static void main(String args[]){
		int arr[]=new int[7];
		for(int i=0;i<args.length;i++){
			try{
				++arr[Integer.parseInt(args[i])];
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.printf("Value out side scope of program  at index ");
				System.out.printf("%d %s %d%n",i,":",Integer.parseInt(args[i]));
			}
		}
		System.out.printf("%s\t%s%n","Roll","Frequncey");
		for(int i=0;i<arr.length;i++){
			if(i==0){
				continue;
			}
			System.out.printf("%4d\t%9d%n",i,arr[i]);
		}
	}
	}

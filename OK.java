public class OK{
	public static void main(String args[]){
			int arr[]=new int[7];
			for(int i=0;i<args.length;i++){
				int num=Integer.parseInt(args[i]);
				++arr[num];
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


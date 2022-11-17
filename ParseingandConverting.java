public class ParseingandConverting{
	public static void main(String args[]){
		System.out.println("All the values in args");
		System.out.printf("%s\t%s%n","i","args[i]");
		for(int i=0;i<args.length;i++){
			System.out.printf("%s\t%7s%n",i,args[i]);
		}
	}
	}

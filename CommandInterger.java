public class CommandInterger{
	public static void main(String args[]){
		if(args.length!=3){
			System.out.println(0);
		}
		else{
			System.out.printf("%s%s%n%s%s%n%s%s%n%s%s%n","args length is: ",args.length,"args[0]: ",args[0],
				"args[1]: ",args[1],"args[2]: ",args[2]
			);
		}
	}
	
	}

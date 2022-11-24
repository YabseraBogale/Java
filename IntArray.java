
public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if ( args.length != 3 )
		{
			System.out.printf(
			"Error: Please re-enter the entire command, including%n" +
			"an array size, initial value and increment.%n");
		}
		if(args.length==2){
			int arrayLength = 10;
			int[] array = new int[arrayLength];
			// get initial value and increment from command-line arguments
			int initialValue = Integer.parseInt(args[0]);
			int increment = Integer.parseInt(args[1]);
			// calculate value for each array element
			for (int counter = 0; counter < array.length; counter++){
				array[counter] = initialValue + increment * counter;
			}
			System.out.printf("%s%8s%n", "Index", "Value");
			// display array index and value
			for (int counter = 0; counter < array.length; counter++){
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
		}
		else{
			// get array size from first command-line argument
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			// get initial value and increment from command-line arguments
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			// calculate value for each array element
			for (int counter = 0; counter < array.length; counter++){
				array[counter] = initialValue + increment * counter;
			}
			System.out.printf("%s%8s%n", "Index", "Value");
			// display array index and value
			for (int counter = 0; counter < array.length; counter++){
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
			
		}
	}

}

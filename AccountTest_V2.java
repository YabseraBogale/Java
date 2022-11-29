import java.util.Scanner;
public class AccountTest_V2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		Account account3=new Account("Yabsera Bogale", 50);
		// display initial balance of each object
		System.out.printf("%s balance: $ %.2f %n",account1.getName(), account1.getBalance() );
		System.out.printf("%s balance: $ %.2f %n",account2.getName(), account2.getBalance() );
		System.out.printf("%s balance: $ %.2f %n%n",account3.getName(), account3.getBalance() );
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter for Deposit \"D\" or Enter for Withdraw \"W\" account1: ");
		String DepositeorWithDraw1=input1.nextLine();
		if(DepositeorWithDraw1.charAt(0)=='D') {
			System.out.print("Enter deposit amount for account1: "); // prompt
			double depositAmount = input.nextDouble(); // obtain user input
			System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
			account1.deposit(depositAmount);
			System.out.printf("%s balance: $ %.2f %n",account1.getName(), account1.getBalance() );
			System.out.printf("%s balance: $ %.2f %n",account2.getName(), account2.getBalance() );
			System.out.printf("%s balance: $ %.2f %n%n",account3.getName(), account3.getBalance() );
		}
		else if(DepositeorWithDraw1.charAt(0)=='W') {
			System.out.print("Enter Withdraw amount for account1: "); // prompt
			double withdrewAmount = input.nextDouble(); // obtain user input
			System.out.printf("%nWithdrew %.2f to account1 balance%n%n",withdrewAmount);
			account1.withdrew(withdrewAmount);
			System.out.printf("%s balance: $ %.2f %n",account1.getName(), account1.getBalance() );
			System.out.printf("%s balance: $ %.2f %n",account2.getName(), account2.getBalance() );
			System.out.printf("%s balance: $ %.2f %n%n",account3.getName(), account3.getBalance() );
		}
		
		System.out.print("Enter for Deposit \"D\" or Enter for Withdraw \"W\" account2: ");
		String DepositeorWithDraw2=input2.nextLine();
		if(DepositeorWithDraw2.charAt(0)=='D') {
			System.out.print("Enter deposit amount for account2: "); // prompt
			double depositAmount = input.nextDouble(); // obtain user input
			System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
			account2.deposit(depositAmount);
			System.out.printf("%s balance: $ %.2f %n",account1.getName(), account1.getBalance() );
			System.out.printf("%s balance: $ %.2f %n",account2.getName(), account2.getBalance() );
			System.out.printf("%s balance: $ %.2f %n%n",account3.getName(), account3.getBalance() );
		}
		else if(DepositeorWithDraw2.charAt(0)=='W') {
			System.out.print("Enter Withdraw amount for account2: "); // prompt
			double withdrewAmount = input.nextDouble(); // obtain user input
			System.out.printf("%nWithdrew %.2f to account2 balance%n%n",withdrewAmount);
			account2.withdrew(withdrewAmount);
			System.out.printf("%s balance: $ %.2f %n",account1.getName(), account1.getBalance() );
			System.out.printf("%s balance: $ %.2f %n",account2.getName(), account2.getBalance() );
			System.out.printf("%s balance: $ %.2f %n%n",account3.getName(), account3.getBalance() );
		}
		
		System.out.print("Enter for Deposit \"D\" or Enter for Withdraw \"W\" account3: ");
		String DepositeorWithDraw3=input3.nextLine();
		if(DepositeorWithDraw3.charAt(0)=='D') {
			System.out.print("Enter deposit amount for account3: "); // prompt
			double depositAmount = input.nextDouble(); // obtain user input
			System.out.printf("%nadding %.2f to account3 balance%n%n",depositAmount);
			account3.deposit(depositAmount);
			System.out.printf("%s balance: $ %.2f %n",account1.getName(), account1.getBalance() );
			System.out.printf("%s balance: $ %.2f %n",account2.getName(), account2.getBalance() );
			System.out.printf("%s balance: $ %.2f %n%n",account3.getName(), account3.getBalance() );
		}
		else if(DepositeorWithDraw3.charAt(0)=='W') {
			System.out.print("Enter Withdraw amount for account3: "); // prompt
			double withdrewAmount = input.nextDouble(); // obtain user input
			System.out.printf("%nWithdrew %.2f to account3 balance%n%n",withdrewAmount);
			account3.withdrew(withdrewAmount);
			System.out.printf("%s balance: $ %.2f %n",account1.getName(), account1.getBalance() );
			System.out.printf("%s balance: $ %.2f %n",account2.getName(), account2.getBalance() );
			System.out.printf("%s balance: $ %.2f %n%n",account3.getName(), account3.getBalance() );
		}
		
	
	}

}


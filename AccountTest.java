import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Scanner input1=new Scanner(System.in);
		String Name;
		int Age;
		Account account1=new Account("Jane Green",10);
		Account account2=new Account("Yabsera Bogale",0);
		System.out.printf("account1 Name: %s%n",account1.GetName());
		System.out.printf("account1 Age: %d%n",account1.GetAge());
		System.out.printf("%nEnter New Name for Account 1:");
		Name=input.nextLine();
		System.out.printf("Enter New Age for Account 1:");
		Age=input.nextInt();
		account1.SetName(Name);
		account1.SetAge(Age);
		System.out.printf("%naccount1 New Name: %s%n",account1.GetName());
		System.out.printf("account1 New Age: %d%n",account1.GetAge());

		System.out.printf("%naccount2 Name: %s%n",account2.GetName());
		System.out.printf("account2  Age: %d%n",account2.GetAge());
		System.out.printf("%nEnter New Name for Account 2:");
		Name=input1.nextLine();
		System.out.printf("Enter New Age for Account 2:");
		Age=input1.nextInt();
		account2.SetName(Name);
		account2.SetAge(Age);
		System.out.printf("%naccount2 New Name: %s%n",account2.GetName());
		System.out.printf("account2 New Age: %d%n",account2.GetAge());
		
		
		
		
		
		
		
		
		
		
	}

}

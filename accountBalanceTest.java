import java.util.Scanner;
public class accountBalanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		accountBalance account1=new accountBalance("Jhon Green",12);
		accountBalance account2=new accountBalance("Jane Green",12);
		System.out.printf("Account1 name: %s%n", account1.GetName());
		System.out.printf("Acount1 Deposite: %.2f%n",account1.GetDeposite());
		System.out.printf("%nAccount2 name: %s%n", account2.GetName());
		System.out.printf("Acount2 Deposite: %.2f%n",account2.GetDeposite());
		System.out.println("Enter -1 to exit loop");
		double num=0;
		String name;
		while(num!=-1) {
			System.out.printf("Acount1 new name: ");
			name=input1.nextLine();
			account1.SetName(name);
			System.out.printf("Acount1 new deposite: ");
			num=input1.nextDouble();
			account1.GetDeposite(num);
			System.out.printf("Acount2 new name: ");
			name=input2.nextLine();
			account2.SetName(name);
			System.out.printf("Acount2 new deposite: ");
			num=input2.nextDouble();
			account2.GetDeposite(num);
			
		}
		System.out.printf("Account1 new name: %s%n", account1.GetName());
		System.out.printf("Acount1 new Deposite: %.2f%n",account1.GetDeposite());
		System.out.printf("%nAccount2 new name: %s%n", account2.GetName());
		System.out.printf("Acount2 new Deposite: %.2f%n",account2.GetDeposite());
	}

}

import java.util.Scanner;
public class MyAccountTest{
	public static void main(String args[]){
		Account myAccount=new Account();
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter Name: ");
		String Name=input.nextLine();
		System.out.printf("Enter Address: ");
		String Address=input.nextLine();
		System.out.printf("Enter Telephone: +2519");
		int Telephone=input.nextInt();
		myAccount.SetAddress(Address);
		myAccount.SetTelephone(Telephone);
		myAccount.SetName(Name);
		String Tele="+2519" +Integer.toString(Telephone);
		System.out.printf("%s\t%s\t%s",myAccount.GetName(),Tele,myAccount.GetAddress());
	}
	
	}

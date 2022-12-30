public class secondAccountTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondAccount employee1= new secondAccount("Yabsera","Bogale","Rcd3093",10,10);
		secondAccount employee2= new secondAccount("Lewale","Bogale","Rcd3093",35.3,190);
		
		System.out.printf("%n%s:%n%s%n","Account1  1 holder info",employee1.toString());
		
		employee1.checkdeposit(3);
		employee1.setsavingBalance(3);
		System.out.printf("%n%s:%n%s%n","Account1  1 holder info",employee1.toString());
		
		employee1.checkdeposit(2);
		employee1.setsavingBalance(2);
		System.out.printf("%n%s:%n%s%n","Account1  1 holder info",employee1.toString());
		System.out.printf("%n%s:%n%s%n","Account2  2 holder info",employee2.toString());
		employee2.setsavingBalance(10);
		System.out.printf("%n%s:%n%s%n","Account2  2 holder info",employee2.toString());
		secondAccount employee3= new secondAccount("Abebe","kekbe","Rcd3093",0,0);
		System.out.printf("%n%s:%n%s%n","Account3  3 holder info",employee3.toString());
		employee3.checkdeposit(5);
		employee3.setsavingBalance(5);
		System.out.printf("%n%s:%n%s%n","Account3  3 holder info",employee3.toString());
		
	}

}

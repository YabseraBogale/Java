public class Table3{
	public static void main(String args[]){
		int ten=10;
		int hund=100;
		int thou=1000;
		int i=1;
		System.out.printf("%s\t%s\t%s\t%s%n","N","10*N","100*N","1000*N");
		System.out.println("");
		while(i<=5){
			System.out.printf("%d\t%d\t%d\t%d%n",i,i*ten,i*hund,i*thou);
			i++;
		}
	}
	}

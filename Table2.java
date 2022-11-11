import java.util.Scanner;
public class Table2{
	public static void main(String args[]){
		int ten=10;
		int hund=100;
		int thos=1000;
		int i;
		Scanner input=new Scanner(System.in);
		do{
	
			System.out.printf("%s\t%s\t%s\t%s\t%n","N","10*N","100*N","1000*N");
			System.out.println("");
			for(int j=1;j<6;j++){
				System.out.printf("%d\t%d\t%d\t%d%n",j,j*ten,j*hund,j*thos);
			}
			System.out.println("Enter 1 to continue");
			i=input.nextInt();
		}while(i==1);
			
	}
	
	}

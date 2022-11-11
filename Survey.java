import java.util.Scanner;
public class Survey{
	public static void main(String[] args){
		int num1;
		Scanner input=new Scanner(System.in);
		int total=0;
		int times=0;
		int counter=1;
		do{
			for(int i=0;i<3;i++){
				System.out.printf("%s","Enter number to check Even or not: ");
				num1=input.nextInt();
				if(num1%2==0){
					System.out.printf("%s%d%s%n","Number ",num1," is even.");
				}
				else{
					System.out.printf("%s%d%s%n","Number ",num1," is odd.");
				}
				total+=num1;
				if(i==2){
					System.out.printf("%s%d%n","Total numbers enterd is ",total);
				}
				times+=1;
			}
			System.out.printf("%s","Enter 1 to continue else to exit: ");
			counter=input.nextInt();
		}while(counter==1);
		System.out.printf("%s%d","Number times input taken is ",times);
	}
	}

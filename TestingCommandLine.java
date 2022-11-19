import java.security.SecureRandom;
public class TestingCommandLine{
	public static void main(String args[]){
		if(args.length!=6){
			System.out.println("Enter the correct Number of Arguments");
		}
		else{
			SecureRandom num4=new SecureRandom();
			System.out.printf("%s\t%s\t%s\t%s%n","i","in_num","num","SecureRandom");
			for(int i=0;i<args.length;i++){
				int in_num=Integer.parseInt(args[i]);
				int num=Integer.parseInt(args[i])+num4.nextInt(6);
				System.out.printf("%d\t%6d\t%3d\t%12d%n",i,in_num,num,(num-in_num));
			}
		}
	}
	}

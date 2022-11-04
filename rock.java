import java.util.Scanner;
import java.util.Random;
public class rock{
	
	public static void main(String args[]){
		Scanner take=new Scanner(System.in);
		int play=1;
		int c=8;
		c++;
		++c;
		c%=5;
		System.out.println(c);
		while(play==1){
			System.out.println("Enter rock 0:");
			System.out.println("Enter Scissor 1:");
			System.out.println("Enter Paper 2: ");
			int number=take.nextInt();
			System.out.println(Game(number));
			System.out.println("Continue to play 'Y' other to Exit");
			play=take.nextInt();
		}
		
	}
	
	public static String Game(int from_user){
		Random Rock=new Random();
		int throwen= Rock.nextInt(2);
		
		if(from_user==throwen){
			return "Draw";
		}
		else if(from_user==1 && throwen==0){
			return "Computer wins";
		}
		else if(from_user==0 && throwen==1){
			return "Humanity wins";
		}
		else if(from_user==2 && throwen==0){
			return "Humanity wins";
		}
		else if(from_user==0 && throwen==2){
			return "Computer wins";
		}
		else if(from_user==1 && throwen==2){
			return "Computer wins";
		}
		else if(from_user==2 && throwen==1){
			return "Humanity wins";
		}
		return "try again";
	}
	
	
	
	
	}

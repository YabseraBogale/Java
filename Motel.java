import java.util.Scanner;
public class Motel {
	public void startCharging() {
		Scanner input=new Scanner(System.in);
		double totalRecipts=0.0;
		double fee=0.0;
		double hours=0.0;
		System.out.println("***************** STAY EASY MOTEL *****************");
		System.out.printf("Enter number of hours you stayed a(negative to quit): ");
		hours=input.nextDouble();
		while(hours>=0.0) {
			fee=Yabsera(hours);
			totalRecipts=totalRecipts+fee;
			System.out.printf("Current charge per room: $%.2f, Total recipts: $%.2f\n\n",fee,totalRecipts);
			System.out.printf("Enter number of hours you stayed a(negative to quit): ");
			hours=input.nextDouble();
			
		}
	}
 static double Yabsera(double Hours) {
	   double min_charge=2.0;
		if(Hours<=3) {
			min_charge=2.0;
		}
		else if(Hours>3 && Hours<19) {
			min_charge=(Hours-3)*0.5+2.0;
			
		}
		else if(Hours<=24 && Hours>=19) {
			min_charge=10.0;
		}
		return min_charge;	 
	}
}


public class AccountBalance {
		private String name;
		private int age;
		private double deposite;
		public AccountBalance(String name,int age,double deposite) {
			if(age>=18) {
				this.age=age;
			}
			else {
				this.age=18;
			}
			this.name=name;
			this.deposite=deposite;
		}
		public void SetName(String name) {
			this.name=name;
		}
		public void SetAge(int age) {
			if(age>=18) {
				this.age=age;
			}
			else {
				this.age=18;
			}
		}
		public void SetDeposite(double deposite) {
			this.deposite=deposite;
		}
		public String GetName() {
			return name;
		}
		public int GetAge() {
			return age;
		}
		public double GetDeposite() {
			return deposite;
		}
}

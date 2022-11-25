
public class Account {

	private String name;
	private int age;
	
	public Account(String Name,int Age){
		name=Name;
		if(Age>=18) {
			age=Age;
		}
		else if(Age<18) {
			age=18;
		}
		
	}
	public void SetName(String Name) {
		name=Name;
	}
	public String GetName() {
		return name;
	}
	public void SetAge(int Age) {
		if(Age>=18) {
			age=Age;
		}
		else if(Age<18) {
			age=18;
		}
	}
	public int GetAge() {
		return age;
	}
	
}

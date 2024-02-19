package inheritance;

public class SavingAccount extends Account {
	
	private float interest;

	public SavingAccount(int id,String name, double balance,float interest) {
		super(id, name, balance);
		this.interest=interest;
	}
	
	@Override
	public String toString() {
		return "SavingAccount [interest=" + interest + "]"+super.toString();
	}

	
	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
}

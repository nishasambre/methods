package inheritance;

public class Test {

	public static void main(String[] args) {
		
		SavingAccount a1 = new SavingAccount(12,"mayur",12000.50,7.5f);
		System.out.println(a1);
		a1.credit(1200);
		System.out.println(a1);
	}

}

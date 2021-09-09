package atm;

public class son_balance extends father {
	
	@Override
	public void Transactions() {
		
		System.out.println( "-----------------------------------------" );
		System.out.println( "Your current balance is: $" + getBalance() );
		System.out.println( "-----------------------------------------" );
		
	}

}
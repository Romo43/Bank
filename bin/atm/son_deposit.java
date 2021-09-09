package atm;

public class son_deposit extends father {
	
	@Override
	public void Transactions() {
		
		System.out.print( "How much money are you going to deposit? " );
		Deposit();
		
		transactions = getBalance();
		setBalance( transactions + deposit );
		
		System.out.println( "-----------------------------------------" );
		System.out.println( "You deposited : $" + deposit );
		System.out.println( "Your current balance is: $" + getBalance() );
		System.out.println( "-----------------------------------------" );
		
	}
}

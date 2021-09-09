package atm;

public class son_withdraw extends father {
	
	@Override
	public void Transactions() {
		
		System.out.println( "How much money do you want to withdraw?" );
		Withdraw();
		
		if( withdraw <= getBalance() ) {
			
			transactions = getBalance();
			setBalance( transactions - withdraw );
			
			System.out.println( "-----------------------------------------" );
			System.out.println( "Withdrew: " + withdraw );
			System.out.println( "Your current balance is:" + getBalance() );
			System.out.println( "-----------------------------------------" );
			
		} else {
			
			System.out.println( "-------------------" );
			System.out.println( "Insufficient balance");
			System.out.println( "-------------------" );
			
		}
		
	}

}

package atm;

import java.util.Scanner;

public abstract class father {
	
	protected int transactions, withdraw, deposit;
	private static int balance;
	
	Scanner input = new Scanner( System.in );
	
	public void operations() {
		
		boolean status = true;
		int choose = 0;
		
		do {
			
			System.out.println( "ATM" );
			System.out.println( "1. Check Balance" );
			System.out.println( "2. Withdraw" );  
	        System.out.println( "3. Deposit" );  
	        System.out.println( "4. Exit" );  
	        System.out.print( "Select an option: " );
	        
	        try {
	        	
	        	choose = Integer.parseInt(input.nextLine());
	        	
	        } catch(NumberFormatException nfe) {
	        	
	        }
			
			
			if( choose >= 1 && choose <= 4 ) {
				
				switch( choose ){
				
					case 1:
						
						father connection1 = new son_balance();
						connection1.Transactions();
						
						break;
						
					case 2:
						
						father connection2 = new son_withdraw();
						connection2.Transactions();
						
						break;
						
					case 3:
						
						father connection3 = new son_deposit();
						connection3.Transactions();
						
						break;
						
					case 4:
						
						System.out.println("-----------");
						System.out.println("Good bye :D");
						System.out.println("------------");
						status = false;
						
						break;
				}
				
			} else {
				
				System.out.println("-------------------------------");
				System.out.println("Option not available, try again");
				System.out.println("-------------------------------");
				
			}
			
			//clear command
			
			
		} while(status == true);
	}
	
	public void Withdraw() {
		
		try {
			withdraw = Integer.parseInt(input.nextLine());
        } catch(NumberFormatException nfe) {
        	
        }
		
	}
	
	public void Deposit() {
		
		try {
			deposit = Integer.parseInt(input.nextLine());
        } catch(NumberFormatException nfe) {
        	
        }
		
	}
	
	public abstract void Transactions();
	
	public int getBalance() {
		
		return balance;
		
	}
	
	public void setBalance( int balance ) {
		
		father.balance = balance;
		
	}
	
}



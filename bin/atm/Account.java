package atm;

public class Account {
	public int balance;
	
	public void ingresar() {
		father connection3 = new son_deposit();
		connection3.Transactions();
	}
	
	public void extraer() {
		father connection2 = new son_withdraw();
		connection2.Transactions();
	}
	
	public void getSaldo() {
		father connection1 = new son_balance();
		connection1.Transactions();
	}
	
}


public class BankAccount {
	int accountId;
	String accountHolderName;
	double openingBalance,currentBalance;
	static double totalBalance=0.0;
	AccountType acc;
	
	public BankAccount (int accountId ,  String accountHolderName,  double openingBalance )
	{
		this.accountId=accountId;
		this.accountHolderName =accountHolderName;
		this.openingBalance=openingBalance;
		totalBalance+=openingBalance;
		this.currentBalance=openingBalance;
		
	}
	public BankAccount() {
		this.currentBalance=0.0;
		
	}
	public void depositAmount(double amount)
	{
		currentBalance+= amount;
		totalBalance+=amount;
	}
	public void withdrawAmount(double amount)
	{
		
		if((acc==AccountType.current && currentBalance>=1000)||(acc==AccountType.saving && currentBalance>=500)||(acc==null)) {
			System.out.println("Amount Withdrawn");
			currentBalance-= amount;
			totalBalance-=amount;
		}
		else {
			System.out.println("Insufficient Balance Amount not Withdrawn");
		}
	}
	public void displayTotalBalance()
	{
		System.out.println("Total amount of bank ="+totalBalance);
	}
	public void getCurrentBalance()
	{
		System.out.println("The current balance =" +currentBalance);
	}
	public static void main (String args[])
	{
		BankAccount obj= new BankAccount();
		BankAccount obj1= new BankAccount(1, "prateek", 10000000);
		BankAccount obj2= new BankAccount(2, "Naga" ,0);
		BankAccount obj3= new BankAccount(3 , "mohit" , 0 );
		
		obj1.withdrawAmount(999.0);
		obj1.getCurrentBalance();
		
	}
}

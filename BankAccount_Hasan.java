
//create a class named BankAccount_Hasan
public class BankAccount_Hasan {
	
 //declare instance variables acctNumber, balance, interestRate
//12_3 declare balance, acctNumber, isClosed private
	private String acctNumber;
	private double balance;
	double interestRate;
	double amount; 
    boolean overdraft;
    //double withdrawn;
    double remain_balance;
    int counter = 0;
    
	
	static int level=4;
	static int numBankAccounts;
	
	//12_1 declare a boolean isClosed
	 private boolean isClosed;
	
	//constructors
	//create a bank account that will take an account number as argument 
	//and set balance to 0 and interest rate to 1%;
	
	/*double deposit(double amount) {
		amount = 555;
		balance = balance + amount;
		return amount;

}*/
	public BankAccount_Hasan(String number) 
	{
		this.acctNumber = number;
		this.balance = 100.0;
		this.interestRate = 0.1;
		numBankAccounts++;	
	}
	
	
	
	//create a bank account with specific values for the instance variables 
	//acctNumber, balance;   interestRate
	
	public BankAccount_Hasan(String n, double b, double r) 
	{
		this.acctNumber = n;
		this.balance = b;
		this.interestRate =r;
		numBankAccounts++;
		
	}
	//default constructor
	public BankAccount_Hasan() 
	{
		//this.balance = 0.0;
		this.interestRate = 0.20;
		//this.Balance = 200;
		numBankAccounts++;
		
	}
	
	
	
	
	
	// 12_4 write getters for all the private variables
	public double getBalance() 
	{
		
		return this.balance;
	}
	
	/*public double getBalance(double b) {
		
		return this.balance;
	}*/
	
	public boolean isClosed() 
	{
		
		return this.isClosed;
		
	}
	
	public String getacctNumber()
	{
		
		return this.acctNumber;
	}
	// cover also the getter for a
	//ccount number 
	
	//12_5 write setters for all the private variables
	//Enforce data integrity: balance < 1,000,000    acctNumber must be exactly 6 digits
	
	// balance
	public void setBalance(double b) 
	{
		if(b<1000000)
			this.balance = b;
		else 
			System.out.println("balance must be < 1 million ");
		
		
	}
	
	public void setisClosed(boolean s) 
	{
		this.isClosed = true;
		
	}
	public void setacctNumber(String Number) 
	{
		this.acctNumber = "1234567";
	}
	
	//12_2 update statement() to display isClosed as well
	public void statement()
	{
		/*variables = "The account number is " + acctNumber + ". The balance is " + balance + 
				". The interest rate is " + interestRate + ".";
		return variables;
		*/
		System.out.println("acctNumber is " + acctNumber + 
				"\nbalance was " + balance + " before deduction " +"\n and interestRate was " + interestRate + " "+ "\n Account is closed: "+ isClosed);
		System.out.println("\n");

		
		
		
		
		/*System.out.println("acct2:acctNumber is " + acctNumber + 
				" balance is " + balance + " and interestRate is " + interestRate);
		
		System.out.println("acct3:acctNumber is " + acctNumber + 
				" balance is " + balance + " and interestRate is " + interestRate);*/
		
	}
	// 12_7
	/*public boolean withdrew_basic(double withdrawn) {
		//subtract amount from our balance
		this.remain_balance = this.balance-this.withdrawn;
		if(this.remain_balance>= 0) 
		{
			return true;
		}	
		else 
		{
			return false;
		}
	}*/
	// 12_8
	//Declare a new instance variable overdraft
	//that is initialized to false.
	
	//boolean overdraft;
	public void hasan_withdraw(double withdrawn)
	{
		this.overdraft = false;
		//this.remain_balance = this.balance-(withdrawn);
		while(counter>=0) 
		{
		this.remain_balance = this.balance-(withdrawn);
		if(this.remain_balance>= 0) 
		{
			this.overdraft = false;
			counter--;
		//System.out.println("Your account balance is " + this.remain_balance);
		//counter--;
		}
		else if(this.remain_balance<0 && remain_balance>=-500 )
		{
			this.overdraft = true;
			System.out.println("The overdraft is " + this.remain_balance + "\n Since the account is in overdraft mode, more money cannot be withdrawn at this point");
			//break;
		}	
		/*else if (this.remain_balance>=-500) {
			this.interestRate = 0;
		System.out.println("Your account balance is "+ this.remain_balance);
		}*/
		else 
		{
			this.overdraft = true;
			this.interestRate = 0.05;
			System.out.println("The desired withdrawal amount exceeds -500, so it cannot be accomodated");	
		}
		counter--;
			
	}
}
}


		
		/*else 
		{
			this.overdraft = true;
			this.interestRate = 0.1;
		
		}
		this.remain_balance -= 300;
		if (this.remain_balance>=-500) 
		{
			this.overdraft = true;
			this.interestRate = 0;
		System.out.println("The overdraft is "+ this.remain_balance);
		}
			
		
		else 
		{
			this.overdraft = false;
			this.interestRate = 0;
		}
		this.remain_balance +=2000;
		if (this.remain_balance>=-500)
		{
			this.overdraft = true;
		System.out.println("The overdraft is "+ this.remain_balance);
		}
			
		
		else 
		{
			this.overdraft = false;
			this.interestRate = 0;
		}
		
		return this.overdraft;*/
		
		
	//}
	
//}


//import java.util.Scanner;
public class TestBankAccount_Hasan 
{
	
	public static void main(String[]args) 
	{
		
		//Scanner input = new Scanner(System.in);
				
		//instantiate 3 bank accounts
		BankAccount_Hasan acct1 = new BankAccount_Hasan("555555");
		
		
		BankAccount_Hasan acct2 = new BankAccount_Hasan("333333", 500, .20);
		
		BankAccount_Hasan acct3 = new BankAccount_Hasan();
		
		//acct1.withdrew_basic(input.nextDouble());
		
		
		
		
		
		//System.out.println("acct1 number is " + acct1.acctNumber);
		System.out.println("acct1 balance is " + acct1.getBalance());
		System.out.println("acct1 interest rate is " + acct1.interestRate);
		System.out.println("acct1 is closed status: " + acct1.isClosed() );
		
		
	// Set acct2 balance to 4000000
    // set acct3 is closed status to true
    // set acct1 acount number to 999999
	// set acct1 interest rate to 5%
	acct2.setBalance(300);
	acct3.setisClosed(true);
	acct1.interestRate = 0.05;
	
	acct1.setBalance(200);
	acct1.setacctNumber("1234567");
	acct1.setBalance(123456789);
	
	acct1.hasan_withdraw(400);
	acct1.hasan_withdraw(300);
	acct1.hasan_withdraw(-2000);
	
	

	
		acct1.statement();
		acct2.statement();
		acct3.statement();
		
		//input.close();
		
		
		
		/*
		//check the default values of instance variables for acct2
		System.out.println("acct2:acctNumber is " + acct2.acctNumber + 
				" balance is " + acct2.balance + " and interestRate is " + acct2.interestRate);
		
		acct1.balance = 1000;
		acct2.interestRate = .30;
		*/
		
		/*System.out.println("acct1:acctNumber is " + acct1.acctNumber + 
				" balance is " + acct1.balance + " and interestRate is " + acct1.interestRate);
		
		
		System.out.println("acct2:acctNumber is " + acct2.acctNumber + 
				" balance is " + acct2.balance + " and interestRate is " + acct2.interestRate);
		
		System.out.println("acct3:acctNumber is " + acct3.acctNumber + 
				" balance is " + acct3.balance + " and interestRate is " + acct3.interestRate);*/
		
		BankAccount_Hasan.level = 5;  //classname.variablename
		
		
		
		System.out.println("number of bank accounts " + BankAccount_Hasan.numBankAccounts);
	}


}

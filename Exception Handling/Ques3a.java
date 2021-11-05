import java.util.Scanner;

class Ques3a {
		static void fun() throws IllegalAccessException
		{
			double balance=0,depositAmount,withdrawAmount;
			Scanner dep=new Scanner(System.in);
			System.out.println("Enter deposit an amount");
			depositAmount=dep.nextInt();
			balance+=depositAmount;
			
			Scanner wd=new Scanner (System.in);
			System.out.println("Enter withdraw an amount");
			withdrawAmount=wd.nextInt();
			balance-=withdrawAmount;
			if(balance<0 && withdrawAmount>balance)
			{
				throw new IllegalAccessException();
			}
			else
			{
				System.out.println("Successfully Withdrawn: " +withdrawAmount);
			
			}
			System.out.println("Account Balance After the Transaction :" +balance);		
		}
	public static void main(String args[])
	{
		try {
			fun();
		}catch(IllegalAccessException e)
		{
			System.out.println("Warning : Insufficient Balance Exception");
		}
	}
}
package bankingProject;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String args[]) {
		
		BankAccount obj= new BankAccount("Revathi Pillai","179864300045");
		obj.show();
		
	             }
       }
		class BankAccount{
			
			int bal;
			int previousTransaction;
			String customerName;
			String Accnum;
		    
			
			BankAccount(String cname,String cid){   //Constructor for show menu method
				customerName=cname;
				Accnum=cid;		
			
			}
	
			
		void depositamount(int amount) {
			if(amount!=0) {
				bal += amount;
				previousTransaction=amount;
			}
		}
		
		void withdrawamount(int amount) {
			if(amount!=0) {
				bal -= amount;
				previousTransaction= -amount;
			}
		}
		
		void getPreviousTransaction() {
			if(previousTransaction>0) {
			System.out.println("Deposited Amount:"+previousTransaction);		
		               }
			else if(previousTransaction<0) {
				System.out.println("Withdraw Amount:"+Math.abs(previousTransaction));
			}
			else {
				System.out.println("No transactions occured!!!");
			}
		 }
			
		void show() {
			char option='\0'; //initializing char value
			Scanner scanner=new Scanner(System.in);
			System.out.println("WELCOME "+customerName);
			System.out.println("YOUR ACCOUNT NUMBER IS: "+Accnum);
			System.out.println("\n");
			System.out.println("A. Check Your Balance ");
			System.out.println("B. Deposit: ");
			System.out.println("C. WithDraw : ");
			System.out.println("D. Your PreviousTransaction: ");
			System.out.println("E. Exit:");
			
			do {
				System.out.println("*******************************************");
				System.out.println("Enter Your Option here!!!");
				System.out.println("*******************************************");
				option=scanner.next().charAt(0); //user input for option
				System.out.println("\n");
				
			switch(option) { 
			
			case 'A':
				System.out.println("____________________________________________");
				System.out.println("Your Balance="+bal);
				System.out.println("____________________________________________");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("____________________________________________");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("____________________________________________");
				int amount=scanner.nextInt();
				depositamount(amount);    //to void deposit
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("____________________________________________");
				System.out.println("Enter an amount to Withdraw: ");
				System.out.println("____________________________________________");
				int amount2=scanner.nextInt();
				withdrawamount(amount2);    //to void withdraw
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("____________________________________________");
				getPreviousTransaction(); //to void getPreviousTransaction
				System.out.println("____________________________________________");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("__________________________________________________");
				break;
				
			default:
				System.out.println("Invalid Option!!! Please Enter Again!!!");
			}
				
			}
				
			while(option!='E')	;
			System.out.println("THANK YOU FOR USING OUR SERVICES!! VISIT AGAIN!!");
		}}
				
		
		
		
	



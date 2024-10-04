package bankaccountbalance;
import java.util.Scanner;
public class BankAccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		double balance= 200000;
		int choice = 0;
		
		do {
			System.out.println("Account Balance: shs"+ balance);
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Exit");
			System.out.println("Choose an option:");
			 
			switch(choice) { 
			case 1:
			System.out.print("Enter deposit amount:");
			 
			double deposit= scanner.nextDouble();
			balance +=deposit;
			break;
			case 2:
				System.out.print("Enter withdraw amount:");
				double withdraw= scanner.nextDouble();
				
				if(withdraw <= balance) {
					balance-= withdraw;
				}else {
					System.out.println("insufficient funds!");
				}
				break;
			}
		}while (choice!=4);
		System.out.println("Thank you for banking with us!");
	}

}

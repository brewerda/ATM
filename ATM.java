import java.util.Scanner;

public class checkAccount {
	private ATMaccount[] accounts;
	private ATMaccount working;

	public ATM(ATMaccount[] accounts) {
		this.accounts = accounts;
	}


	public void Login() {
	String pin = "";
	String name = "";
	System.out.println("Please enter your account name: ");
	Scanner name = new Scanner(System.in);
	name = name.nextString();
	

	System.out.println("Please enter your PIN number: ");
	Scanner pin = new Scanner(System.in);
	pin = pin.nextString();


	for (int i=0; i<accounts.length; i++) {
		if(this.accounts[i].getName().equals(name) && this.accounts[i].getPin() == pin) {
			this.working = account;
			System.out.println("Logged in for " + working.getName());
			interface();
		} else {
			System.out.println("Failed Login");
		}
	}

	

	}

	public void checkLogin(String name, int pin) {
		for (int i=0; i<accounts.length; i++) {
		if(this.accounts[i].getName().equals(name) && this.accounts[i].getPin() == pin) {
			return accounts[i];
		}
	}
		return "Invalid";
	}




	public void interface() {
		System.out.println("What would you like to do?");
		System.out.println("Enter 0 to Check Balance");
		System.out.println("Enter 1 to Withdraw Funds");
		System.out.println("Enter 2 to Change Name or Pin");
		System.out.println("Enter 3 to Logout");


		Scanner reader = new Scanner(System.in);
		int response = reader.nextInt();

		if (response == 0) {
			System.out.println("Your current balance is: " + checkBalance());
		} else if (response == 1) {
			Scanner takeout = new Scanner(System.in);
			System.out.println("How much money would you like to take out? ");
			int takeout = takeout.nextInt();


			if(takeout <= working.checkBalance()) {
				int remaining = working.checkBalance() - takeout;
				System.out.println("Successfully took out: " + takeout + " dollars");
				System.out.println("You have " + remaining + " left in your account.");

			} else if( takeout > working.checkBalance()) {
				System.out.println("You do not have enough funds to take out that much.");
			}
		} else if (response == 2) {
			change();
		} else if (response == 3) {
			logout();
		} else {
			System.out.println("Please enter the available options above.");
		}


	}
	public int checkBalance() {
		return working.checkBalance();
	}
	public void logout() {
		this.working = null;
	}
}
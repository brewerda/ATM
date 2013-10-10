import java.util.Scanner;

public class checkAccount {

	Account Bob = new Account("Bob","1234", 100);
	Account Alice = new Account("Alice","3333",250);
	Account JT = new Account("JT","0001",999999999);

	public void checkLogin() {
	String pin = "";
	String name = "";
	System.out.println("Please enter your account name: ");
	Scanner name = new Scanner(System.in);
	name = name.nextString();
	

	System.out.println("Please enter your PIN number: ");
	Scanner pin = new Scanner(System.in);
	pin = pin.nextString();

	if ()

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
			checkBalance();
		} else if (response == 1) {
			withdraw();
		} else if (response == 2) {
			change();
		} else if (response == 3) {
			logout();
		} else {
			System.out.println("Please enter the available options above.");
		}


	}
	public int checkBalance() {
		
	}
}
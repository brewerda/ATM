import java.util.Scanner;

public class ATMRunner {
	public static void main(String[] args) {

		ATM Bob = new ATM("Bob", 1234, 100);
		ATM Alice = new ATM("Alice", 3333, 250);
		ATM Jt = new ATM("JT", 0001, 999999999);


		
		System.out.println("Please enter your account name: ");
		Scanner name = new Scanner(System.in);
		ATM.getName = name.nextString();
		

		System.out.println("Please enter your PIN number: ");
		Scanner pin = new Scanner(System.in);
		ATM.getPin = pin.nextInt();


	}
}
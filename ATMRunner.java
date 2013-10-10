import java.util.Scanner;

public class ATMRunner {
	public static void main(String[] args) {
		
		System.out.println("Please enter your account name: ");
		Scanner reader = new Scanner(System.in);
		ATM.getname();

		System.out.println("Please enter your PIN number: ");
		ATM.pin();


	}
}
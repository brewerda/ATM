public class ATM {
	private String name;
	private int pin;
	private int balance;


	//Accounts Currently In Machine
	public void bobAccount() {
		this.name = "Bob";
		this.pin = 1234;
		this.balance = 100;
	}
	public void aliceAccount() {
		this.name = "Alice";
		this.pin = 3333;
		this.balance = 250;
	}
	public void jTAccount() {
		this.name = "JT";
		this.pin = 0001;
		this.balance = 999999999;
	}

	//Name Getter and Setter
	public String name() {
		return name;
	}
	public void getName(String name) {
		if (name.length() >= 2 && name.length() <=7) {
			this.name = name;
		} else {
			System.out.println("Name must be larger than 1 and less than 7 characters.");
		}
	}

	//Pin getter and setter
	public int pin() {
		return pin;
	}
	public void getPin(int pin) {
		if (pin == 4) {
			this.pin = pin;
		} else {
			System.out.println("You pin must be 4 numbers long!");
		}
	}
	public int balance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance > 0 && balance < 1000000000) {
			this.balance = balance;
		} else {
			System.out.println("You must have a positive balance");
			System.out.println("We do not insure more that 1 billion.");
		}
	}

	public void ATM(String name, int pin, int balance) {
		setName(name);
		setPin(pin);
		setBalance(balance);

	}
}
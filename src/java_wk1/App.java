package java_wk1;

public class App {

	public static void main(String[] args) {
		
		//Variable declarations
		
		double itemPrice = 39.95;
		double moneyAmt = 50;
		double newMoneyAmt = moneyAmt - itemPrice;
		double newMoneyAmtRound = Math.round(newMoneyAmt * 100.00) / 100.00;
		int numFriends = 600;
		short age = 30;
		int friendsPerYear = numFriends / age;
		String firstName = "John";
		String lastName = "Public";
		char midInit = 'Q';
		String fullName = firstName + " " + midInit + " " + lastName;
		
		//Print to terminal
		
		System.out.println("Item Price:" + " " + itemPrice);
		System.out.println("Amount of Money before purchase:" + " " + moneyAmt);
		System.out.println("Change:" + " " + newMoneyAmtRound);
		System.out.println();
		System.out.println("First Name:" + " " + firstName);
		System.out.println("Middle Initial:" + " " + midInit);
		System.out.println("Last Name:" + " " + lastName);
		System.out.println("Full Name:" + " " + fullName);
		System.out.println();
		System.out.println("Age:" + " " + age);
		System.out.println("Total number of friends:" + " " + numFriends);
		System.out.println("Number of friends made per year:" + " " + friendsPerYear);
		
	}

}

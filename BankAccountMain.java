package Q1;

// import Scanner class
import java.util.Scanner;

/**
 * 
 * @author jenniferzhang
 *
 */

public class BankAccountMain {

	public static void main(String[] args) {
		
		// Scanner class
		Scanner s = new Scanner(System.in);
		
		// create two objects
		BankAccount customer1 = new BankAccount();
		BankAccount customer2 = new BankAccount("Jennifer Zhang", 200000, "JENZENDEN");
		
		// declaration
		String a = null;
		
		// do while loop for the first customer - menu
		do {
			System.out.println("Welcomd to ABC bank. Please select from the following:");
			System.out.println("a: deposit\nb: withdraw\nc: check you balance\nd: create an account\ne: change your personal information");
			
			String select = s.next();
			
			// deposit
			if(select.equalsIgnoreCase("a")) {
				System.out.println("Please enter your password: ");
				String p = s.next();
				if(p.equals(customer1.getPassword())) {
					System.out.println("how much do you want to deposit?");
					double deposit = s.nextDouble();  
					System.out.println("Thank you. The amount you want to deposit is "+customer1.Format(deposit)+" your current balance after your deposit is "+customer1.Format(customer1.deposit(deposit)));
				}
				else {
					System.out.println("Sorry, your password is not correct.");
				}
				System.out.println("do you want to:\n1. exit \n2.go to the menu");
				a = s.next();
			}
			
			// withdraw
			if(select.equalsIgnoreCase("b")) {
				System.out.println("Please enter your password: ");
				String pw = s.next();
				if(pw.equals(customer1.getPassword())) {
					System.out.println("how much do you want to withdraw?");
					double withdraw = s.nextDouble();
					if(withdraw>customer1.getBalance()) {
						System.out.println("Sorry. The amount you wish to withdraw is more that your current balance.");
					}
					else {
						System.out.println("Thank you. The amount you want to withdraw is"+customer1.Format(withdraw)+" your current balance after your withdraw is "+customer1.Format(customer1.withdraw(withdraw)));
					}
				}
				else {
					System.out.println("Sorry, your password is not correct.");
				}
				System.out.println("do you want to:\n1. exit \n2.go to the menu");
				a = s.next();
			}
			
			// check the balance
			if(select.equalsIgnoreCase("c")) {
				System.out.println("Please enter your password: ");
				String password = s.next();
				if(password.equals(customer1.getPassword())) {
					System.out.println(customer1.toString());
					System.out.println("do you want to:\n1. exit \n2. go to the menu");
					a = s.next();
				}
			}
			
			// create an account
			if(select.equalsIgnoreCase("d")) {
				System.out.println("Do you want to have a: \na) checking account \nb) savings account \nc) checking and savings account");
				String option=s.next();
				System.out.println("Please enter your name:");
				String n = s.next();
				System.out.println("Please enter your phone number:");
				String phone = s.nextLine();
				phone = s.nextLine();
				System.out.println("Please enter your address:");
				String address = s.next();
				if(option.equalsIgnoreCase("a")) {
					System.out.println("Thank you. You've created a checking account.");
				}
				if(option.equalsIgnoreCase("b")) {
					System.out.println("Thank you. You've created a savings account.");
				}
				if(option.equalsIgnoreCase("c")) {
					System.out.println("Thank you. You've created a checking and savings account.");
				}
				System.out.println("do you want to:\n1. exit \n2. go to the menu");
				a = s.next();
			}
			
			// change name/password
			if(select.equalsIgnoreCase("e")) {
				System.out.println("Do you want to: \na)change your name \nb)change your password");
				String x = s.next();
				if(x.equalsIgnoreCase("a")) {
					System.out.println("Please enter your new name:");
					String na = customer1.setName(s.next());
					System.out.println("Your new name is: "+na);
				}
				if(x.equalsIgnoreCase("b")) {
					System.out.println("Please enter your new password: ");
					String pa = customer1.setPassword(s.next());
					System.out.println("Your new password is: "+pa);
				}
				System.out.println("do you want to:\n1. exit \n2. go to the menu");
				a = s.next();
			}
		}while(a.equals("2"));
		
		System.out.println();
		
		System.out.println("Now enters the second customer");
		
		// do while loop for the second customer - menu
		do {
			System.out.println("Welcomd to ABC bank. Please select from the following:");
			System.out.println("a: deposit\nb: withdraw\nc: check you balance\nd: create an account\ne: change your personal information");
			
			String select = s.next();
			
			// deposit
			if(select.equalsIgnoreCase("a")) {
				System.out.println("Please enter your password: ");
				String p = s.next();
				if(p.equals(customer2.getPassword())) {
					System.out.println("how much do you want to deposit?");
					double deposit = s.nextDouble();  
					System.out.println("Thank you. The amount you want to deposit is "+customer2.Format(deposit)+" your current balance after your deposit is "+customer2.Format(customer2.deposit(deposit)));
				}
				else {
					System.out.println("Sorry, your password is not correct.");
				}
				System.out.println("do you want to:\n1. exit \n2.go to the menu");
				a = s.next();
			}
			
			// withdraw
			if(select.equalsIgnoreCase("b")) {
				System.out.println("Please enter your password: ");
				String pw = s.next();
				if(pw.equals(customer2.getPassword())) {
					System.out.println("how much do you want to withdraw?");
					double withdraw = s.nextDouble();
					if(withdraw>customer2.getBalance()) {
						System.out.println("Sorry. The amount you wish to withdraw is more that your current balance.");
					}
					else {
						System.out.println("Thank you. The amount you want to withdraw is"+customer2.Format(withdraw)+" your current balance after your withdraw is "+customer2.Format(customer2.withdraw(withdraw)));
					}
				}
				else {
					System.out.println("Sorry, your password is not correct.");
				}
				System.out.println("do you want to:\n1. exit \n2.go to the menu");
				a = s.next();
			}
			
			// check the balance
			if(select.equalsIgnoreCase("c")) {
				System.out.println("Please enter your password: ");
				String password = s.next();
				if(password.equals(customer2.getPassword())) {
					System.out.println(customer2.toString());
					System.out.println("do you want to:\n1. exit \n2. go to the menu");
					a = s.next();
				}
			}
			
			// create an account
			if(select.equalsIgnoreCase("d")) {
				System.out.println("Do you want to have a: \na) checking account \nb) savings account \nc) checking and savings account");
				String option=s.next();
				System.out.println("Please enter your name:");
				String n = s.next();
				System.out.println("Please enter your phone number:");
				String phone = s.nextLine();
				phone = s.nextLine();
				System.out.println("Please enter your address:");
				String address = s.next();
				if(option.equalsIgnoreCase("a")) {
					System.out.println("Thank you. You've created a checking account.");
				}
				if(option.equalsIgnoreCase("b")) {
					System.out.println("Thank you. You've created a savings account.");
				}
				if(option.equalsIgnoreCase("c")) {
					System.out.println("Thank you. You've created a checking and savings account.");
				}
				System.out.println("do you want to:\n1. exit \n2. go to the menu");
				a = s.next();
			}
			
			// change name/password
			if(select.equalsIgnoreCase("e")) {
				System.out.println("Do you want to: \na)change your name \nb)change your password");
				String x = s.next();
				if(x.equalsIgnoreCase("a")) {
					System.out.println("Please enter your new name:");
					String na = customer2.setName(s.next());
					System.out.println("Your new name is: "+na);
				}
				if(x.equalsIgnoreCase("b")) {
					System.out.println("Please enter your new password: ");
					String pa = customer2.setPassword(s.next());
					System.out.println("Your new password is: "+pa);
				}
				System.out.println("do you want to:\n1. exit \n2. go to the menu");
				a = s.next();
			}
		}while(a.equals("2"));

	}

}

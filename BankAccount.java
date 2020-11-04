package Q1;

// import DecimalFormat
import java.text.DecimalFormat;

/**
 * 
 * @author jenniferzhang
 *
 */

public class BankAccount {
	
	// variables
	private String name;
	private String password;
	private double balance;
	
	// default constructor
	public BankAccount() {
		name="Jennifer Zhang";
		password="JEN6YT";
		balance=100000;
	}
	
	// another constructor with parameters
	public BankAccount(String name, double balance, String password) {
		this.name=name;
		this.balance=balance;
		this.password=password;
	}
	
	/**
	 * 
	 * @return the name of the customer
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return the password of the customer
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 
	 * @return the balance of the customer
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public String setName(String name) {
		return name;
	}
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public String setPassword(String password) {
		return password;
	}
	
	/**
	 * 
	 * @param balance
	 * @return
	 */
	public String Format(double balance) {
		DecimalFormat x = new DecimalFormat("$###,###.00");
		return x.format(balance);
	}
	
	/**
	 * 
	 * @param d
	 * @return
	 */
	public double deposit(double d) {
		balance += d;
		return balance;
	}
	
	/**
	 * 
	 * @param w
	 * @return
	 */
	public double withdraw(double w) {
		balance -= w;
		return balance;
	}
	
	@Override
	public String toString() {
		return name + " " +Format(balance);
	}

}

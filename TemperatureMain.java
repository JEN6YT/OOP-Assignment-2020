package Q3;

// import scanner class
import java.util.Scanner;

/**
 * 
 * @author jenniferzhang
 *
 */

public class TemperatureMain {

	public static void main(String[] args) {
		
		// scanner class
		Scanner s = new Scanner(System.in);
		
		// creating a new object
		Temperature temp = new Temperature();
		Temperature temp2 = new Temperature(43,100);
		
		// see what the user is entering(celcius/fahrenheit)
		System.out.println("is the temperature that you are about to enter in celcius or fahrenheit?");
		String t = s.next();
		
		// convert celcius to fahrenheit
		if(t.equalsIgnoreCase("celcius")) {
			System.out.println("please enter your temperature:");
			double c = temp.setCelcius(s.nextDouble());
			System.out.println("your temperature in fahrenheit is: "+temp.Format(temp.convertCtoF(c)));
		}
		
		// convert fahrenheit to celcius
		if(t.equalsIgnoreCase("fahrenheit")) {
			System.out.println("please enter your temperature:");
			double f = temp.setFahrenheit(s.nextDouble());
			System.out.println("your temperature in celcius is: "+temp.Format(temp.convertFtoC(f)));
		}
		
		System.out.println("what about another one?");
		
		// see what the user is entering(celcius/fahrenheit)
		System.out.println("is the temperature that you are about to enter in celcius or fahrenheit?");
		String te = s.next();
				
		// convert celcius to fahrenheit
		if(te.equalsIgnoreCase("celcius")) {
			double c = temp2.getCelcius();
			System.out.println("Your temperature in Celcius is: "+c);
			System.out.println("After convertion, your temperature in fahrenheit is: "+temp.Format(temp.convertCtoF(c)));
		}
				
		// convert fahrenheit to celcius
		if(te.equalsIgnoreCase("fahrenheit")) {
			double f = temp2.getFahrenheit();
			System.out.println("Your temperature in Fahrenheit is: "+f);
			System.out.println("After convertion, your temperature in celcius is: "+temp.Format(temp.convertFtoC(f)));
		}
		
	}

}

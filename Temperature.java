package Q3;

// import DecimalFormat
import java.text.DecimalFormat;

/**
 * 
 * @author jenniferzhang
 *
 */

public class Temperature {
	
	// instantiating variables
	private double celcius, fahrenheit;
	
	// default constructor
	public Temperature() {
		celcius=0.0;
		fahrenheit=0.0;
	}
	
	// another constructor
	public Temperature(double celcius, double fahrenheit) {
		this.celcius=celcius;
		this.fahrenheit=fahrenheit;
	}
	
	/**
	 * 
	 * @return celcius
	 */
	public double getCelcius() {
		return celcius;
	}
	
	/**
	 * 
	 * @return fahrenheit
	 */
	public double getFahrenheit() {
		return fahrenheit;
	}
	
	/**
	 * 
	 * @param celcius
	 * @return
	 */
	public double setCelcius(double celcius) {
		return celcius;
	}
	
	/**
	 * 
	 * @param fahrenheit
	 * @return
	 */
	public double setFahrenheit(double fahrenheit) {
		return fahrenheit;
	}
	
	/**
	 * 
	 * @param celcius
	 * @return
	 */
	public double convertCtoF(double celcius) {
		return celcius*9/5+32;
	}
	
	/**
	 * 
	 * @param fahrenheit
	 * @return
	 */
	public double convertFtoC(double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public String Format(double t) {
		DecimalFormat x = new DecimalFormat("#.00");
		return x.format(t);
	}
	
}

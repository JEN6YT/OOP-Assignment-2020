package Q2;

/**
 * 
 * @author jenniferzhang
 *
 */

//import DecimalFormat
import java.text.DecimalFormat;

public class Rectangle {
	
	// variables
	private double width, length;
	
	// default constructor
	public Rectangle() {
		width=0;
		length=0;
	}
	
	// another constructor
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	
	// get width
	public double getWidth() {
		return width;
	}
	
	// get length
	public double getLength() {
		return length;
	}
	
	/**
	 * 
	 * @param width
	 * @return
	 */
	public double getWidth(double width) {
		return width;
	}
	
	/**
	 * 
	 * @param length
	 * @return
	 */
	public double getLength(double length) {
		return length;
	}
	
	/**
	 * 
	 * @param width
	 * @return 
	 */
	public double setWidth(double width) {
		return width;
	}
	
	/**
	 * 
	 * @param length
	 */
	public double setLength(double length) {
		return length;
	}
	
	/**
	 * 
	 * @param width
	 * @param length
	 * @return
	 */
	public double perimeter(double width, double length) {
		double p = 2*(width+length);
		return p;
	}
	
	/**
	 * 
	 * @param width
	 * @param length
	 * @return
	 */
	public double area(double width, double length) {
		double a = width*length;
		return a;
	}
	
	/**
	 * 
	 * @param y
	 * @return
	 */
	public String Format(double y) {
		DecimalFormat x = new DecimalFormat("#.00");
		return x.format(y);
	}
	
	/**
	 * 
	 * @param width
	 * @param length
	 * @return
	 */
	public String toString(double width, double length) {
		return "the width of the second rectangle: "+ width +"\nthe length of the second rectangle: "+length;
		
	}

}

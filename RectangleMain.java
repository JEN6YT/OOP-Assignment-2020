package Q2;

// import scanner class
import java.util.Scanner;

/**
 * 
 * @author jenniferzhang
 *
 */

public class RectangleMain {

	public static void main(String[] args) {
		
		// import scanner class
		Scanner s = new Scanner(System.in);
		
		// declaring a new object
		Rectangle one = new Rectangle();
		Rectangle two = new Rectangle();
		Rectangle three = new Rectangle(6.0, 9.5);
		
		// ask the user for the width and get the width of the first rectangle
		System.out.println("please enter the width for the first rectangle:");
		double w = one.getWidth(s.nextDouble());
		
		// ask the user for the length and get the length of the first rectangle
		System.out.println("please enter the length for the first rectangle:");
		double l = one.getLength(s.nextDouble());
		
		// print out the perimeter and the area of the first rectangle
		System.out.println("the perimeter of the first rectangle is: "+one.Format(one.perimeter(w,l)));
		System.out.println("the area of the first rectangle is: "+one.Format(one.area(w,l)));
		System.out.println();
		
		// set the value of the width for the second rectangle
		double wi = two.setWidth(7.7);
		
		// set the value of the length for the second rectangle
		double le = two.setLength(9.5);
		
		System.out.println(two.toString(wi,le));
		
		// print out the perimeter and the area of the second rectangle
		System.out.println("the perimeter of the second rectangle is: "+two.Format(two.perimeter(wi,le)));
		System.out.println("the area of the second rectangle is: "+two.Format(two.area(wi,le)));
		System.out.println();
		
		// print out the perimeter and the area of the third rectangle
		System.out.println("the perimeter of the third rectangle is: "+three.Format(three.perimeter(three.getWidth(),three.getLength())));
		System.out.println("the perimeter of the third rectangle is: "+three.Format(three.area(three.getWidth(),three.getLength())));

	}

}

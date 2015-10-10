package handsOn3; // also contains handsOn5

import java.util.Scanner;

public class implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isInteger;
		boolean isFloat;
		boolean isInteger1;
		boolean isFloat1;
		String symbol;
		String multiplication = "M";
		String addition = "A";

		values v = new values();
		overLoading l = new overLoading();
		overLoading r = new overRiding();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter either an Integer or a Float value.");
		if (in.hasNextInt() || in.hasNextFloat()) {
			v.setNumber1(in.nextLine());
			/*
			 * setting values only if integer or float
			 */

		}

		else {

			System.out.println("Enter a valid number!!");
		}

		isInteger1 = v.isInteger1(v.getNumber1());
		/*
		 * calls method to check if the first number entered is an integer.
		 */

		isFloat1 = v.isFloat1(v.getNumber1());
		/*
		 * calls a method to check if the first number entered is an float.
		 */

		if (isInteger1) {
			/*
			 * checks if first number is not empty and is an integer.
			 */
			System.out.println("Enter another integer number");
			if (in.hasNextInt()) { // checks if second number is an integer
				v.setNumber2(in.nextLine());
			} else {
				System.out.println("Enter a valid integer");
			}
		}

		else if (v.getNumber1() != null && isFloat1) {
			/*
			 * checks if first number is not empty and is float
			 */
			System.out.println("Enter another Float number");
			if (in.hasNextFloat()) {// checks if second number is a float
				v.setNumber2(in.nextLine());
			} else {
				System.out.println("Enter a valid Float");
			}
		}

		else {
			System.out.println("Both numbers haave to be of same type");
		}

		isInteger = v.isInteger(v.getNumber1(), v.getNumber2());
		/*
		 * checks if both numbers are integers.
		 */
		isFloat = v.isFloat(v.getNumber1(), v.getNumber2());
		/*
		 * checks if both numbers are floats.
		 */
		System.out.println("Type M for multiplication and A for addition");
		symbol = in.next();

		if (!(symbol.equalsIgnoreCase(multiplication) || symbol.equalsIgnoreCase(addition))) {
			System.out.println("Enter valid symbol");
		}

		else {

			switch (symbol.toUpperCase()) {
			case "M":

				if (isInteger) {
					System.out.println(l.calculate(Integer.parseInt(v.getNumber1()), Integer.parseInt(v.getNumber2()))); // call
																															// to
																															// integer
																															// overloaded
																															// block
					System.out.println("From Integer overloaded block");
				}

				else if (isFloat) {
					System.out.println(l.calculate(Float.parseFloat(v.getNumber1()), Float.parseFloat(v.getNumber2())));// call
																														// to
																														// float
																														// overloaded
																														// block
					System.out.println("From Float overloaded block");
				} else {
					System.out.println("Enter valid numbers");
				}
				break;

			case "A":
				if (isInteger) {
					System.out.println(r.calculate(Integer.parseInt(v.getNumber1()), Integer.parseInt(v.getNumber2()))); // call
					// to
					// integer
					// overriding
					// block
					System.out.println("From Integer overridden block");
				}

				else if (isFloat) {
					System.out.println(r.calculate(Float.parseFloat(v.getNumber1()), Float.parseFloat(v.getNumber2())));// call
					// to
					// float
					// overriding
					// block
					System.out.println("From Float overidden block");
				} else {
					System.out.println("Enter valid numbers");

				}
				break;

			default:
				System.out.println("Operation cannot b performed");
				break;
			}
		}

	}
}

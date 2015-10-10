package handsOn3;

import java.util.Scanner;

public class values {
	private String number1;
	private String number2;

	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	public boolean isInteger1(String number1)// check if first number is integer
	{
		boolean isValidInteger = false;

		try {
			Integer.parseInt(getNumber1());
			isValidInteger = true;
		} catch (NumberFormatException ex) {

		}

		return isValidInteger;
	}

	public boolean isInteger(String number1, String number2)// check if both
															// numbers are
															// integers
	{
		boolean isValidInteger = false;

		try {
			Integer.parseInt(getNumber1());
			Integer.parseInt(getNumber2());
			isValidInteger = true;
		} catch (NumberFormatException ex) {

		}

		return isValidInteger;
	}

	public boolean isFloat1(String number1)// check if first number is float
	{
		boolean isValidInteger = false;

		try {
			Float.parseFloat(getNumber1());
			isValidInteger = true;
		} catch (NumberFormatException ex) {

		}

		return isValidInteger;
	}

	public boolean isFloat(String number1, String number2)// check if both
															// numbers are float
	{
		boolean isValidInteger = false;

		try {
			Float.parseFloat(getNumber1());
			Float.parseFloat(getNumber2());
			isValidInteger = true;
		} catch (NumberFormatException ex) {

		}

		return isValidInteger;
	}

}

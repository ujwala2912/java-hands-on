package handsOn4;

import java.util.ArrayList;
import java.util.Scanner;

public class JackandJill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cardMessage = null;
		int randomNumber;
		System.out.println("Hi Jill, please press enter to pick any card among the 10 cards");
		Scanner in = new Scanner(System.in);
		String key = in.nextLine(); // Just to wait for Jill to pick a number!!!

		 randomNumber = 1 + (int) (Math.random() * 10); // Creates a random
															// number between 1
															// to 10
		System.out.println("Your card number is " + randomNumber);

		switch (randomNumber) {
		case 1:
			cardMessage = "You chose card 1";
			break;

		case 2:
			cardMessage = "You chose card 2";
			break;

		case 3:
			cardMessage = "You chose card 3";
			break;

		case 4:
			cardMessage = "You chose card 4";
			break;

		case 5:
			cardMessage = "You chose card 5";
			break;

		case 6:
			cardMessage = "You chose card 6";
			break;

		case 7:
			cardMessage = "You chose card 7";
			break;

		case 8:
			cardMessage = "You chose card 8";
			break;

		case 9:
			cardMessage = "You chose card 9";
			break;

		case 10:
			cardMessage = "You chose card 10";
			break;

		default:
			cardMessage = "You have no message";
			break;
		}

		System.out.println("And your message is::::" + cardMessage);
	}
}

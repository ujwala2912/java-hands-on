package handsOn1;

import java.util.Scanner;

public class calculateGrades {

	public void enterMarks() {
		Scanner in = new Scanner(System.in);
		subjects sub = new subjects();

		System.out.println("Press ok to enter details");
		in.next();
		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Enter the name of the Student");
			sub.setName(in.next());

			System.out.println("Enter Mathematics marks");

			while (!(sub.checkMarks(in.nextInt()))) {
				sub.setMathematicsMarks(in.nextInt());
			}

			System.out.println("Enter English marks");
			while (!(sub.checkMarks(in.nextInt()))) {
				sub.setEnglishMarks(in.nextInt());
			}

			System.out.println("Enter Hindi marks");
			while (!(sub.checkMarks(in.nextInt()))) {
				sub.setHindiMarks(in.nextInt());
			}

			System.out.println("Enter Science marks");
			while (!(sub.checkMarks(in.nextInt()))) {
				sub.setScienceMarks(in.nextInt());
			}

			System.out.println("Enter Social Science marks");
			while (!(sub.checkMarks(in.nextInt()))) {
				sub.setSocialMarks(in.nextInt());
			}

			System.out.println(sub.getName() + "'s percentage is " + sub.calculatePercentage()
					+ "% and the Category is " + sub.getGrade() + ".");

			System.out.println("Do you want to enter marks for  another student?");
			choice = in.next();
		}
		System.out.println("Thnakyou!!");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculateGrades c = new calculateGrades();
		c.enterMarks();

	}
}

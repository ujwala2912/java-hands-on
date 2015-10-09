package handsOn1;

import java.util.Scanner;

public class calculateGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		subjects sub = new subjects();

		System.out.println("Enter the name of the Student");
		sub.setName(in.nextLine());

		System.out.println("Enter Mathematics marks");
		sub.setMathematicsMarks(in.nextInt());

		System.out.println("Enter English marks");
		sub.setEnglishMarks(in.nextInt());

		System.out.println("Enter Hindi marks");
		sub.setHindiMarks(in.nextInt());

		System.out.println("Enter Science marks");
		sub.setScienceMarks(in.nextInt());

		System.out.println("Enter Social Science marks");
		sub.setSocialMarks(in.nextInt());

		System.out.println(sub.getName() + "'s percentage is " + sub.calculatePercentage() + "% and the Category is "
				+ sub.getGrade() +".");

	}

}

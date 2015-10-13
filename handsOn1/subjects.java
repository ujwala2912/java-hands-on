package handsOn1;

import java.util.Scanner;

public class subjects {

	private String name;
	private int mathematicsMarks;
	private int englishMarks;
	private int hindiMarks;
	private int scienceMarks;
	private int socialMarks;

	@Override
	public String toString() {
		return "subjects [name=" + name + ", mathematicsMarks=" + mathematicsMarks + ", englishMarks=" + englishMarks
				+ ", hindiMarks=" + hindiMarks + ", scienceMarks=" + scienceMarks + ", socialMarks=" + socialMarks
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathematicsMarks() {
		return mathematicsMarks;
	}

	public void setMathematicsMarks(int mathematicsMarks) {
		this.mathematicsMarks = mathematicsMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getSocialMarks() {
		return socialMarks;
	}

	public void setSocialMarks(int socialMarks) {
		this.socialMarks = socialMarks;
	}

	public double calculatePercentage() {
		double totalMarks;
		double percentage;

		totalMarks = getMathematicsMarks() + getEnglishMarks() + getHindiMarks() + getScienceMarks() + getSocialMarks();

		return percentage = (totalMarks) / 5;

	}

	public String getGrade() {

		String grade;
		if (calculatePercentage() < 40)
			grade = "Poor";
		else if (calculatePercentage() >= 40 && calculatePercentage() < 60)
			grade = "Average";
		else if (calculatePercentage() >= 60 && calculatePercentage() < 80)
			grade = "Good";
		else if (calculatePercentage() >= 80 && calculatePercentage() < 90)
			grade = "Very good";
		else if (calculatePercentage() >= 90)
			grade = "Excellent";
		else
			grade = "Unknown";

		return grade;

	}

	public boolean checkMarks(int marks) {

		if (marks < 0 || marks > 100) {
			System.out.println("Please enter marks between 0 and 100");
			return false;
		}

		else {
			return true;
		}
	}

}

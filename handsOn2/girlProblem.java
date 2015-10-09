package handsOn2;

import java.util.Scanner;

public class girlProblem {
	
	int michleNumber;
	int BruceNumber;
	

	@Override
	public String toString() {
		return "girlProblem [michleNumber=" + michleNumber + ", BruceNumber=" + BruceNumber + "]";
	}


	public int getMichleNumber() {
		return michleNumber;
	}


	public void setMichleNumber(int michleNumber) {
		this.michleNumber = michleNumber;
	}


	public int getBruceNumber() {
		return BruceNumber;
	}


	public void setBruceNumber(int bruceNumber) {
		BruceNumber = bruceNumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		girlProblem g = new girlProblem();
		System.out.println("Enter Michale's number");
		g.setMichleNumber(in.nextInt());
		
		System.out.println("Enter Bruce's number");
		g.setBruceNumber(in.nextInt());
		
		if(g.getMichleNumber() < g.getBruceNumber())
		{
			System.out.println("Bruce gets the girl");
		}
		
		else if(g.getBruceNumber()< g.getMichleNumber())
		{
			System.out.println("Michale gets the girl");
		}
		
		else
		{
			System.out.println("Game is invalid, Please try again");
		}

	}

}

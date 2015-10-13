package handsOn9;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EnterNames {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> Names = new ArrayList<String>();
		
		
		System.out.println("How many names do you want to enter");
		int counter = in.nextInt();

		for (int i = 0; i < counter; i++) {
			System.out.println("Enter the name");
			if (!(in.equals(null)) || in.equals("")) {
				Names.add(in.next());
			}
		}

		for (String name : Names) {

			System.out.println(name.toUpperCase());
		}

		System.out.println("Size of array is" + Names.size());

		System.out.println("From the above names, enter the name you want to delete");
		String nameRemove = in.next();
		System.out.println("Index of the removed item is" + Names.indexOf(nameRemove));

		Names.remove(nameRemove);

		System.out.println("Now the size of the arraylist is::" + Names.size());
		System.out.println(Names);

	}


}

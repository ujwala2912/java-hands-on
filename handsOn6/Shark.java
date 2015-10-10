package handsOn6;

public class Shark extends Fish {

	public String display() {

		animalColour = "I am Blue";
		isInWater = true;
		return "I am an animal which lives in water, hence I am an Aquatic";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal s = new Shark();
		Animal f = new Fish();

		System.out.println("Calling Shark:::" + s.display() +" and " + s.animalColour);
		System.out.println("Calling Fish:::" + f.display());
		
		

	}

}

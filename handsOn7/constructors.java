package handsOn7;

public class constructors {

	int a;
	double b;
	
	public constructors() {
		
	}

	public constructors(int a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public constructors(double b) {
		super();
		this.a = 0;
		this.b = b;
	}
	public constructors(int a) {
		super();
		this.a = a;
		this.b = 0;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructors c = new constructors();
		constructors c1= new constructors(10,10.1);
		constructors c2 = new constructors(10);
		constructors c3 = new constructors(10.34);
		
		
		

	}

}

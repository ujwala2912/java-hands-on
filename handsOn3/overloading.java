package handsOn3;

import java.util.Scanner;

public class overloading {
	
	private int a ;
	private int b;
	private float c;
	private float d;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
		public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	public float getD() {
		return d;
	}
	public void setD(float d) {
		this.d = d;
	}
	public int multiply(int a, int b)
	{
		return  a*b;
		
	}
	
	public float multiply(float a, float b)
	{
		return a*b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		overloading o = new overloading();
		
		System.out.println("Multiplication of integers "+o.multiply(10, 20));
		System.out.println("Multiplication of floats "+o.multiply(11, 12));
		
		
	}
	
}

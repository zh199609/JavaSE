package test;

public class Static {
	static {
		int x = 5;
		System.out.println("1111");
		
	}
	static int x, y;

	public static void main(String args[]) {
		System.out.println("22");
		x--;
		myMethod();
		
		System.out.println(x + y + ++x);
	}

public static void myMethod(){
	y = x++ + ++x;  
	System.out.println("y=="+x);
	//y=0;
	}
}

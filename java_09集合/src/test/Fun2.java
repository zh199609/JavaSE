package test;

public class Fun2 {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		if (a == true)
			if (b == true)
				if (c == true)
					System.out.println("Some things are true in this world");
				else
					System.out.println("Nothing is true in this world!");
			else if (a && (b = c))
				System.out.println("It's too confusing to tell what is true and what is false");
			else
				System.out.println("Hey ");
		

		int z = 0x1234;
		System.out.println(z);
		System.out.println("Value is - " + ((z < 5) ? (double)9: 8));
	}
	
	

}

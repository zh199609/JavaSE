package 内部类;
//静态内部类
public class Test03 {
	public static void main(String[] args) {
		Test03.Inner inner= new Test03.Inner();
		inner.print();
	}
	
	static class Inner {
		public void print() {
			System.out.println("静态内部类");
		}
	}
}

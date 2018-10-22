package 内部类;

public class Test02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.show();
	}
	
	public void show() {
		//show方法的局部变量后方法的参数，实际必须时常量
		final int a=1;
		class Inner{
			public void print() {
				System.out.println("方法内部类"+a);
			}
		}
		
		Inner inner = new Inner();
		inner.print();
	}
}

package 内部类;

public class Outer {
	public static void main(String[] args) {
		//成员内部类需要以来外部类的对象
		//通常不建议这样实例化内部类的对象
//		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner();
//		inner.print();
		
		Outer outer = new Outer();
		outer.innerPrint();
		
	}
	
	//建议在外部类中定一个方法
	public void innerPrint() {
		Inner inner =  new Inner();
		inner.print();
	}
	private class Inner{
		public void print() {
			System.out.println("我是内部类");
		}
	}
}

package 内部类;

public class Test04 {
	public static void main(String[] args) {
		Test04 t= new Test04();
		t.print1();
		t.print2();
		t.print3(new Eat() {
			@Override
			public void eat() {
				System.out.println("参数式匿名内部类");
			}
		});
	}
	
	public void print1() {
		//继承式
		Cat cat = new Cat() {
			@Override
			public void eat() {
				System.out.println("继承式匿名内部类");
				
			}
		};
		cat.eat();
	}
	//接口式
	public void print2() {
		Eat eat = new Eat() {

			@Override
			public void eat() {
				System.out.println("接口式匿名内部类");
				
			}
		};
		eat.eat();
	}
	//参数式
	public void print3(Eat eat) {
		eat.eat();
	}
	
	
}
 abstract class Cat{
	 public abstract void eat();
 }
 
 interface Eat{
	 public abstract void eat();
 }
 
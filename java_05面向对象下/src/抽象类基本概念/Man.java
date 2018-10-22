package 抽象类基本概念;

public class Man extends Person{

	@Override
	public void eat() {
		System.out.println("我能跑步");
		
	}

	@Override
	public void move() {
		System.out.println("我能走路");
		
	}

}

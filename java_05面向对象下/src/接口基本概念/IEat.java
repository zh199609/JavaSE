package 接口基本概念;

public interface IEat {
	void eat();
	int num=10;
	public default void print() {
		//可以被所有实现类继承
		System.out.println("我是默认方法，1.8新特新");
	}
}

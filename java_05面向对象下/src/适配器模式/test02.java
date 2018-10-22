package 适配器模式;

public class test02 {

}

interface Animal {
	public void sing();

	public void cry();

	public void run();

	public void swim();
}

	//适配器
 abstract class AnimalFun{
	 public void sing() {
			// TODO Auto-generated method stub

		}

		
		public void cry() {
			// TODO Auto-generated method stub

		}

		
		public void run() {
			// TODO Auto-generated method stub
		}
		

		
		public void swim() {
			// TODO Auto-generated method stub

		}
 }
 
 class Cat extends AnimalFun {
	 public void run() {
			System.out.println("我是猫，我能跑");
		}
 }
 
class Dog implements Animal {//只关注run

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我是狗，我疯狂的跑！");
	}
	

	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

}

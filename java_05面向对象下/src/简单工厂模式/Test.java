package 简单工厂模式;

public class Test {
	//使用者和被使用者两者之间，耦合，产生了依赖，当被使用者改变时，会影响使用者
	//使用工厂模式及那个地两者之间的以来
	public static void main(String[] args) {
		Product phone = ProductFactory.getProduct("Phone");
		phone.work();
		((Phone) phone).cry();
	}
	
}
class ProductFactory{
	public static Product getProduct(String name) {
		if("Phone".equals(name)) {
			return new Phone();
		}else if("Computer".equals(name)) {
			return new Computer();
		}else {
			return null;
		}
	}
}


interface Product{
	public final static String name="asdas";
	public void work();
}
class Phone implements Product{
	 
	 public void cry() {
		 System.out.println("萨达");
	 }
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("手机开始工作了");
	}
	
}
class Computer implements Product{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("电脑开始工作了");
	}
	
}
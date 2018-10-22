package 静态代理模式;

public class Test {
	public static void main(String[] args) {
		Action userAction = new User();
		ActionProxy actionProxy = new ActionProxy(userAction);
		actionProxy.doACtion();
		
	}
}

class ActionProxy implements Action {
	private Action target;// 被代理的对象 用父类的引用 用User也可以

	public ActionProxy(Action target) {
		// TODO Auto-generated constructor stub
		this.target = target;
	}
	//执行操作
	@Override
	public void doACtion() {
		// TODO Auto-generated method stub
		long start  = System.currentTimeMillis();
		target.doACtion();//执行真正的业务
		long end = System.currentTimeMillis();
		System.out.println("共耗时："+(end-start));
	}

}

interface Action {
	public void doACtion();
}

class User implements Action {

	@Override
	public void doACtion() {
		// TODO Auto-generated method stub
		System.out.println("用户开始执行工作！");
	}

}
package 观察者.demo2;
//观察者抽象
public interface Observer {
	// 当主题状态改变时,会将一个String类型字符传入该方法的参数,每个观察者都需要实现该方法
	public void update(String info);

}

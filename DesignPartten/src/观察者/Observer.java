package 观察者;

/**
 * 抽象观察者
 * 定义了一个update方法，当被观察者条用notifyObservers方法时，观察者的update方法被回调
 * @author i-leizh
 *
 */
public interface Observer {
	 public void update(String message);
}

package 观察者;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公共号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * 
 * @author i-leizh
 *
 */
public class WechatServer implements Observerable{

	private List<Observer> list;
	private String message;
	
	

	public WechatServer() {
		list=new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if (!list.isEmpty()) {
			list.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			Observer observer = list.get(i);
			observer.update(message);
		}
	}
	
	public void setInfomation(String s) {
		this.message =s;
		System.out.println("微信服务更新消息："+s);
		//消息更新，通知所有观察者
		notifyObserver();
	}

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

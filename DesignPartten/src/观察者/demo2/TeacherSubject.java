package 观察者.demo2;

import java.util.ArrayList;
import java.util.List;

public class TeacherSubject implements Subject{
	//用来存放和记录观察者
	private List<Observer> list = new ArrayList<>();
	//记录状态的字符串
	private String info;
	@Override
	public void addObserver(Observer obj) {
		list.add(obj);
		
	}

	@Override
	public void deleteObserver(Observer obj) {
		// TODO Auto-generated method stub
		if (!list.isEmpty()) {
			list.remove(obj);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : list) {
			observer.update(info);
		}
	}
	public void setHomework(String info) {
		this.info = info;
		System.out.println("今天作业时："+info);
		notifyObserver();
	}
	

}

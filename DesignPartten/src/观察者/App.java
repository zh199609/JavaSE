package 观察者;

public class App {
	public static void main(String[] args) {
		WechatServer wechatServer = new WechatServer();
		
		User user1 = new User("zhang san");
		User user2 = new User("li si");
		User user3 = new User("wang wu");
		
		wechatServer.registerObserver(user1);
		wechatServer.registerObserver(user2);
		wechatServer.registerObserver(user3);
		
		wechatServer.setInfomation("第一条推送消息！");
		System.out.println("---------------------------------------------");
		wechatServer.removeObserver(user3);
		
		wechatServer.setInfomation("第二条推送消息！");
		
	}
}

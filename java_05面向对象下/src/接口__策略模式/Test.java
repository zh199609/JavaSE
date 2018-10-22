package 接口__策略模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseService user = new UserService();
		user.setISave(new FileSave());
		user.add("user");
	}

}
//把可变的行为抽象出来，定义一系列的算法
interface ISave{
	public void save(String data);
}

class FileSave implements ISave{
	@Override
	public void save(String data) {
		// TODO Auto-generated method stub
		System.out.println("正在把数据保存到文件中…………"+data);
	}
	
}
class NetSave implements ISave{
	@Override
	public void save(String data) {
		// TODO Auto-generated method stub
		System.out.println("正在把数据保存到网络中…………"+data);
	}
	
}


abstract class  BaseService{
	private ISave isave;
	public void setISave(ISave isave) {
		this.isave = isave;
	}
	
	public void add(String data) {
		System.out.println("检查数据合法性。");
		isave.save(data);
		System.out.println("数据保存完毕。");
	}
}

class UserService extends BaseService{
	
}


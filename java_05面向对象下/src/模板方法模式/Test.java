package 模板方法模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager user = new UserManager();
		user.action("admin", "add");
	}

}

abstract class BaseManager {
	public void action(String name,String method) {
		if("admin".equals(name)) {
			execute(method);
		}else {
			System.out.println("您没有操作权限");
		}
	}
	
	public abstract void execute(String method);
}

class UserManager extends BaseManager{
	public void execute(String method) {
		//用户是否登录的验证
		//验证成功后才可以执行一下操作
		if("add".equals(method)){
			System.out.println("执行了添加操作");
		}else if("del".equals(method)) {
			System.out.println("执行了删除操作");
		}
	}
}

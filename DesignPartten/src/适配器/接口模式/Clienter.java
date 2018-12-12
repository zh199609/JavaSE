package 适配器.接口模式;

public class Clienter {
	public static void main(String[] args) {
		AImpl aImpl = new AImpl();
		aImpl.a();
		aImpl.e();
	}
}

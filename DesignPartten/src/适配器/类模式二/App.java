package 适配器.类模式二;

public class App {
	public static void main(String[] args) {
		Ps2 adapter = new Adapter();
		adapter.isPs2();
	}
}

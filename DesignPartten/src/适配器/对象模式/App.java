package 适配器.对象模式;

public class App {
	public static void main(String[] args) {
		Ps2 adapter = new Adapter(new UsbImpl());
		adapter.isPs2();
	}
}

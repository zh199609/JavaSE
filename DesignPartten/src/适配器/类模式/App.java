package 适配器.类模式;

public class App {
	public static void main(String[] args) {
		Adapter adaptee = new Adapter();
		adaptee.sampleOperation1();
		adaptee.sampleOperation2();
	}
}

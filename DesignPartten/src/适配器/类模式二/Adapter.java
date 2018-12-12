package 适配器.类模式二;

public class Adapter extends UsbImpl implements Ps2 {

	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
		System.out.println("ps2口");
		System.out.println("转换");
		isUsb();
	}

}

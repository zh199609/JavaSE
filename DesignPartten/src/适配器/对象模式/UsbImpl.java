package 适配器.对象模式;

public class UsbImpl implements Usb{

	@Override
	public void isUsb() {
		System.out.println("USB口");
	}
	
}

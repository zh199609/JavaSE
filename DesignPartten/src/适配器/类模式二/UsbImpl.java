package 适配器.类模式二;
//usb实现类
public class UsbImpl implements Usb{

	@Override
	public void isUsb() {
		System.out.println("USB口");
	}
	
}

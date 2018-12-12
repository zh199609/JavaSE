package 适配器.对象模式;

public class Adapter implements Ps2{

	private Usb usb;
	
	public Adapter(Usb usb) {
		this.usb = usb;
	}

	@Override
	public void isPs2() {
		usb.isUsb();
	}

}

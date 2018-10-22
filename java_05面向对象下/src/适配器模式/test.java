package 适配器模式;

public class test {
	public static void main(String[] args) {
		PowerA a = new PowerAImpl();
		work(a);
		PowerB b = new PowerBImpl();
//		work(b);
		Adapter adpter = new Adapter(b);
		work(adpter);
		
	}
	public static void work(PowerA a) {
		System.out.println("正在连接……");
		a.insert();
		System.out.println("工作结束");
	}
}

class Adapter implements PowerA{
	private PowerB b;
	public Adapter(PowerB b) {
		// TODO Auto-generated constructor stub
		this.b= b;
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		b.connet();
	}
	
}


interface PowerA{
	public void insert();
}

interface PowerB{
	public void connet();
}
class PowerBImpl implements PowerB{

	@Override
	public void connet() {
		// TODO Auto-generated method stub
		System.out.println("电源B开始工作 ！");
	}
	
}

class PowerAImpl implements PowerA{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("电源A开始工作 ！");
	}
	
}
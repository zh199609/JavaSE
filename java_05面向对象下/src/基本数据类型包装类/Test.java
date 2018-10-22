package 基本数据类型包装类;

public class Test {
	public static void main(String[] args) {
		//把基本数据类型转换成包装类
		Integer i1 = new Integer(1);
		//int i2 = i1;
		int i2 = i1.intValue();
		Integer i3= 10;
		
		String num = "77";
		int i5 = Integer.parseInt(num);//转换成int
		int i6 = Integer.valueOf(num);//转换成Integer
		
		//面试题
//		Integer x1 = new Integer(10);
//		Integer x2 = new Integer(10);
//		System.err.println(x1==x2);
//		System.out.println(x1.equals(x2));
		
		
//		Integer x3 = new Integer(128);
//		Integer x4 = new Integer(128);
//		System.err.println(x3==x4);
//		System.out.println(x3.equals(x4));
		
//		Integer x3 = 128;
//		Integer x4 = 128;
//		System.err.println(x3==x4);缓存   享元模式
//		System.out.println(x3.equals(x4));
		
		
	}
}

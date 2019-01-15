package 工厂.简单工厂.工厂方法;

import 工厂.简单工厂.Add;
import 工厂.简单工厂.Operation;

/**
 * @Author
 * @Description
 * @Date
 */
public class AddFactory implements Factory {
    @Override
    public Operation createFactory() {
        System.out.println("加法运算！");
        return new Add();
    }
}

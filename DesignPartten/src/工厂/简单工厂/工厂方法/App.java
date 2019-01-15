package 工厂.简单工厂.工厂方法;

import 工厂.简单工厂.Operation;

/**
 * @Author
 * @Description
 * @Date
 */
public class App {
    public static void main(String[] args) throws Exception {
        AddFactory addFactory = new AddFactory();
        Operation add = addFactory.createFactory();
        System.out.println(add.getResult(6000, 70000));

    }
}

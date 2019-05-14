package 工厂.简单工厂;

import java.util.Optional;
import java.util.function.Function;

/**
 * @Author
 * @Description
 * @Date
 */
public class App {
    public static void main(String[] args) throws Exception {
        Operation add = EasyFactory.createOperation("+");
        Operation sub = EasyFactory.createOperation("-");
        System.out.println(add.getResult(6000, 7000));
        Operation a = null;
        Optional<Operation> a1 = Optional.ofNullable(a);
        String asdasd = a1.map(val -> {
            System.out.println("val:" + val);
            return "返回值";
        }).orElse("asdasd");
        System.out.println("最终返回值：" + asdasd);
    }
}

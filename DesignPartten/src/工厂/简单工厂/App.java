package 工厂.简单工厂;

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
    }
}

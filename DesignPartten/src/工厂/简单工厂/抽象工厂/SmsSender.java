package 工厂.简单工厂.抽象工厂;

/**
 * @Author
 * @Description
 * @Date
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is smsSender");
    }
}

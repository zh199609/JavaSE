package 工厂.简单工厂.抽象工厂;

/**
 * @Author
 * @Description
 * @Date
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

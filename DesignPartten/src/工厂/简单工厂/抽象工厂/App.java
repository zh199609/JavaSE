package 工厂.简单工厂.抽象工厂;

/**
 * @Author
 * @Description
 * @Date
 */
public class App {

    public static void main(String[] args) {
        Provider  provider = new MailSenderFactory();
        Sender produce = provider.produce();
        produce.Send();
    }
}

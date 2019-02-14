package 工厂.简单工厂.抽象工厂;

import java.util.concurrent.Semaphore;

/**
 * @Author
 * @Description
 * @Date
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailSender");
    }
}



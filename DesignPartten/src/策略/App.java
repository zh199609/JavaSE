package 策略;

/**
 * @Author
 * @Description
 * @Date
 */
public class App {
    public static void main(String[] args) {
        Environment environment = new Environment(new AddStrategy());
        int calulate = environment.calulate(20, 30);
        System.out.println(calulate);
    }
}

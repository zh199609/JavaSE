package 策略.优化if;

public class App {
    public static void main(String[] args) {
        Red red = new Red();
        ColorStrategy colorStrategy = new ColorStrategy(red);
        colorStrategy.color();
    }

}

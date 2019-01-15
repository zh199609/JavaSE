package 策略;

/**
 * @Author
 * @Description
 * @Date
 */
public class AddStrategy implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1+num2;
    }
}

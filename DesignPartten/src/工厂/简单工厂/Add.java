package 工厂.简单工厂;

/**
 * @Author
 * @Description
 * @Date
 */
public class Add implements Operation {
    @Override
    public double getResult(double a, double b) throws Exception {
        return a+b;
    }
}

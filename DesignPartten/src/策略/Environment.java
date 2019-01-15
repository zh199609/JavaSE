package 策略;

/**
 * @Author
 * @Description
 * @Date
 */
public class Environment {
    private Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calulate(int a,int b){
        return strategy.calc(a, b);
    }
}

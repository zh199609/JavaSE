package 策略.优化if;

public class ColorStrategy {
    private Color color;

    public ColorStrategy(Color color) {
        this.color = color;
    }

    public void color() {
        color.doSomeThing();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

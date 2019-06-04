package 策略.优化if;

public class Black implements Color {
    @Override
    public void doSomeThing() {
        System.out.println("black");
    }
}

class Blue implements Color {

    @Override
    public void doSomeThing() {
        System.out.println("Blue");
    }
}

class Red implements Color {

    @Override
    public void doSomeThing() {
        System.out.println("Red");
    }
}

package singleton;

public class Singleton1 {



    private Singleton1() {
    }

    private static class InnerHolder {
        private InnerHolder() {
        }

        private static Singleton1 INSTANCE = new Singleton1();
    }

    private static Singleton1 getInstance() {
        return InnerHolder.INSTANCE;
    }
}

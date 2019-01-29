package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author
 * @Description
 * @Date
 */
public class JDKProxy {

    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        jdkProxy.main111();
    }

    public void main111() {
        BookFacade target = new BookFacadeImpl();
        BookFacadeProxy bookFacadeProxy = new BookFacadeProxy(target);
        BookFacade proxyObject = (BookFacade) Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), bookFacadeProxy);
        proxyObject.addBook();
    }
}

interface BookFacade {
    void addBook();
}

class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook() {
        System.out.println("add book ……");
    }
}

class BookFacadeProxy implements InvocationHandler {

    Object target;

    public BookFacadeProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前通知");
        Object invoke = method.invoke(target, args);
        System.out.println("后通知");
        return invoke;
    }
}


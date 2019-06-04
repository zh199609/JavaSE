package 职责链;

import java.util.HashMap;

public class Chain {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler1 concreteHandler2 = new ConcreteHandler1();
        concreteHandler1.setNextHandler(concreteHandler2);
        concreteHandler1.handlerRequest("adf");
    }
}

//抽象处理者角色
abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;//vue开发实战
    }

    //处理请求的方法
    public abstract void handlerRequest(String request);
}

//具体处理者1
class ConcreteHandler1 extends Handler {

    @Override
    public void handlerRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNextHandler() != null) {
                getNextHandler().handlerRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
//具体处理者2

class ConcreteHandler2 extends Handler {


    @Override
    public void handlerRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNextHandler() != null) {
                getNextHandler().handlerRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}



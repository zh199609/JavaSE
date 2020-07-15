/*
 * CMB Confidential
 *
 * Copyright (C) 2020 China Merchants Bank Co., Ltd. All rights reserved.
 *
 * No part of this file may be reproduced or transmitted in any form or by any
 * means, electronic, mechanical, photocopying, recording, or otherwise, without
 * prior written permission of China Merchants Bank Co., Ltd.
 */
package 静态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Discription:
 * @Author: albertzh
 * @Create: 2020/5/8
 */
public class JDKProxy {

    static interface Car {
        void run();
    }

    static class Bus implements Car {

        @Override
        public void run() {
            System.out.println("公共汽车");
        }
    }

    static class JdkProxy implements InvocationHandler {
        Object target;

        public Object getInstance(Object target) {
            this.target = target;
            return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("invoke------start");
            Object invoke = method.invoke(target, args);
            return invoke;
        }
    }


    public static void main(String[] args) {
        Bus bus = new Bus();
        JdkProxy jdkProxy = new JdkProxy();
        Object instance = jdkProxy.getInstance(bus);
        Car car = (Car) instance;
        car.run();
    }


}

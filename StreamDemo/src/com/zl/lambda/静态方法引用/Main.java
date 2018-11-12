package com.zl.lambda.静态方法引用;

public class Main{

    @SuppressWarnings("null")
    public static void main(String[] args) {
        String str = "lambda add power to Java1.8";
        // MyStringOps::strReverse 相当于实现了接口方法func()
        // 并在接口方法func()中作了MyStringOps.strReverse()操作
        StringFunc sFunc=  MyStringOps::strReverse;
        String func = sFunc.func(str);
        System.out.println(func);
        String stringOp = MethodRefDemo.stringOp(MyStringOps::strReverse, str);
        System.err.println(stringOp);
        Runtime runtime = Runtime.getRuntime();
        System.err.println(runtime.maxMemory());
    }

    
    
   
}

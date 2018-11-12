package com.zl.lambda.静态方法引用;
@FunctionalInterface
public interface StringFunc{
    String func(String s);

    @Override
    int hashCode();

    @Override
    boolean equals(Object obj);

  

    @Override
    String toString();

  
    
}

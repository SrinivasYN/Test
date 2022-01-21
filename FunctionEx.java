package java8Practice;

import java.util.function.*;

public class FunctionEx {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Function<Integer,Integer> f1 = i-> i*2;
        Function<Integer,Integer> f2 = i-> i*i*i;
        Function<Integer,Integer> f3 = i-> i*i+i;
        System.out.println(f1.compose(f2).andThen(f3).apply(2));
    }
}
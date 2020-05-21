package com.littlejava;

//声明一个Main类
public class Main {

    //声明一个静态的方法
    public static void main(String[] args) {
        Calc2 t = new Calc2();
        t.a = 2;
        t.b = 3;
        System.out.println(t.result(t.a,t.b));
    }
}

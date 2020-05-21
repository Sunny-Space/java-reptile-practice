package com.littlejava;

public class QuadPolynomial {
    public int a;
    public int b;
    public int c;

    public int result(int arg){
        return a*arg*arg + b*arg + c;
    };
}

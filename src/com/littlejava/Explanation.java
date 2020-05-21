package com.littlejava;

public class Explanation {

    /*
    public 和 private 的不同之处就在于是否允许外部调用
     */

    private int[] array; //成员变量
    private int len; //成员变量

    //这就是一个成员方法
    public void add(int x) {
        array[len] = x;
        len++;
    }

    //这也是一个成员方法
    public int max(){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    //这是一个默认的构造方法，这个方法和下面方法的不同之处在于，没有传参数
    public Explanation(){
        array = new int[100];
        len = 0;
    }
    //我们可以在别的类中去这样调用上面的构造方法
    //我们用构造函数来生成一个类的实例
    //    Explanation explanation = new Explanation();

    //构造方法，初始化方法 方法名和类名相同，没有返回值类型,构造方法就是用来初始化对象的一些状态
    public Explanation(int length){
        array = new int[length];
        len = 0;//当前长度为零
    }
    //我们可以在别的类中去这样调用上面的构造方法
    //我们用构造函数来生成一个类的实例
    //    Explanation explanation = new Explanation(100);
}

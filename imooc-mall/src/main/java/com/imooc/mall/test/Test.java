package com.imooc.mall.test;

public class Test {
    public boolean test(Integer a){
        if (a==null) return false;
        else return true;
    }

    public static void main(String args){
        Integer b=1;
        if (new Test().test(b)) System.out.println("success");
        else System.out.println("failed");
    }
}

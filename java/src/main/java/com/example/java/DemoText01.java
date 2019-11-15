package com.example.java;

public class DemoText01 {
    public static void main(String args[]){//main方法
       Student student= new Student("刘华",26,1654556,89);//使用匿名对象方法调用变量值
        System.out.println(student.getInfo());//输出对象调用的变量值
    }
}

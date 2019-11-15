package com.example.java;

public class Student {
    private String name;
    private int    age;
    private int   xuehao;
    private double fenshu;

    public Student(String n,int a,int x,double f){
        name=n;
        age=a;
        xuehao=x;
        fenshu=f;
    }
    public void setName(String n){
        name=n;
    }
    public void setAgee(int a){
       age=a;
    }
    public void setXuehao(int x){
        xuehao=x;
    }
    public void setFenshu(double f){
        fenshu=f;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getXuehao(){
        return xuehao;
    }
    public double getFenshu(){
        return fenshu;
    }
    public String getInfo(){
        return "姓名:"+name+"\n"+
                "年龄:"+age+"\n"+
                "学号:"+xuehao+"\n"+
                "分数:"+fenshu;
    }
}

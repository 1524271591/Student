package com.example.java;

 class Book {//定义Book类
     private String name;//定义变量为姓名
     private int    age;//定义变量为年龄
     private double sum;//定义变量为分数
     public Book(){//定义一个无参构造方法

     }

     public Book(String n,int a,double s){//定义三个参数的构造方法
         name=n;
         age=a;
         sum=s;
     }
     public  void setName(String n){//利用set方法给变量name赋值
         name=n;
     }
     public void setAge(int a){//利用set方法给变量age赋值
         age=a;
     }
     public void setSum(double s){//利用set方法给变量sum赋值
         sum=s;
     }
     public String getName(){//get方法，返回一个name
         return name;
     }
     public int getAge(){//get方法，返回一个age
         return age;
     }
     public double getSum(){//get方法，返回一个sum
         return sum;
     }
     public String getInfo(){//Strin型的getInfo方法，返回三个变量
         return   "姓名:"+name+"\n"+
                   "年龄:"+age+"\n"+
                  "分数:"+sum;
     }
 }
//package com.itdr.controller;
//
//import com.itdr.pojo.Datas;
//import com.itdr.pojo.Users;
//
//import java.util.Scanner;
//
//public class TestDemo {
//    public static void main(String[] args){
//
//
//        Scanner sc = new Scanner(System.in);
//        Users[] uarr = new Users[10];
//        Datas[] datas = new Datas[36];
//        //创建不同种类的数据对象
//        Datas d = new Datas("生肖","鸡","苏");
//        datas[0] = d;
//        Datas d2 = new Datas("生肖","马","顾");
//        datas[1] = d2;
//        Datas d3 = new Datas("生肖","羊","夏");
//        datas[2] = d3;
//        Datas d4 = new Datas("月份","1","小");
//        datas[3] = d4;
//        Datas d5 = new Datas("月份","2","棂");
//        datas[4] = d5;
//        Datas d6 = new Datas("月份","3","玥");
//        datas[5] = d6;
//        Datas d7 = new Datas("星座","白羊座","浅");
//        datas[6] = d7;
//        Datas d8 = new Datas("星座","金牛座","姬");
//        datas[7] = d8;
//        Datas d9 = new Datas("星座","巨蟹座","盈");
//        datas[8] = d9;
//
//
//        //用户输入数据 进行注册
//        System.out.println ("姓名");
//        String uname = sc.next();
//        System.out.println ("密码");
//        int psd = sc.nextInt();
//        int m = register(uname,psd,uarr);
//        if(m == 1){
//            System.out.println("用户注册成功");
//        }else{
//            System.out.println("用户注册失败");
//        }
//
//        //用户登录
//        System.out.println("请用户登录");
//        String uname2 = sc.next();
//        int psd2 = sc.nextInt();
//        int login = login(uname2,psd2,uarr);
//        if (login == 1){
//            System.out.println("登陆成功");
//        }else{
//            System.out.println("登陆失败");
//        }
//
//
//        //开始测试
//        System.out.println("请输入生肖、月份、星座");
//        String sx2 = sc.next();
//        String mon2 = sc.next();
//        String xz2 = sc.next();
//        String newName = startGame(sx2, mon2, xz2, datas);
//        System.out.println("你前世的名字是："+newName);
//    }
//
////注册判断
//    public static int register(String uname,int psd,Users[] ua) {
//        //创建一个用户对象
//        Users u = new Users();
//        //给对象的属性赋值
//        u.uname = uname;
//        u.psd = psd;
//        //保存对象
//        for (int i=0;i<ua.length;i++){
//            if (ua[i]==null){
//                ua[i] = u;
//                return 1;
//            }
//        }
//        return -1;
//    }
//    //登录判断
//    public static int login(String uname,int psd,Users[]ua){
//        //非空判断
//        //根据用户输入的内容查找对应的用户
//        for (int i=0;i<ua.length;i++){
//            if (ua[i] != null){
//                if (ua[i].uname.equals(uname) && ua[i].psd == psd){
//                    return 1;
//                }
//            }
//
//        }
//    return -1;
//    }
//
//    //开始测试
//    public static String startGame(String sx,String mon,String xz,Datas[] ds){
//        String newName = "";
//
//        for(int i =0;i<ds.length;i++){
//            if(ds[i] != null){
//                //生肖
//                if(ds[i].category.equals("生肖")){
//                    if(ds[i].yz.equals(sx)){
//                        newName = newName+ds[i].xz;
//                    }
//                }
//                //月份·
//                if(ds[i].category.equals("月份")){
//                    if(ds[i].yz.equals(mon)){
//                        newName = newName+ds[i].xz;
//                    }
//                }
//                //星座
//                if(ds[i].category.equals("星座")){
//                    if(ds[i].yz.equals(xz)){
//                        newName = newName+ds[i].xz;
//                    }
//                }
//            }
//        }
//
//        return newName;
//    }
//}
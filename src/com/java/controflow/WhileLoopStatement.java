package com.java.controflow;

public class WhileLoopStatement {
    public static void main(String[] args) {

        //while(condition /true){}
        int a=5;
        while(a<10){
            System.out.println(a);
            a++;
        }
        //do while ၁ကြိမ်တော့အလုပ်လုပ် မှားလဲ

        do{
            System.out.println(a+"/t");
            a++;
        } while(a<20);
        int b=5;
        do{
            System.out.println(b+"\t");
        }while (b<5);
    }
}

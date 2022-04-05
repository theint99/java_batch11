package com.java.batch11;

public class Datatypes {
    public static void main(String[] args){
        //byte num1 = -129;  this is error bcz byte -128 to 127
        short num2 = -129;
        // short num3= 32768; error
        int num4 = 1234567890;
        long num5= 11177_888_999l; //long (l or L)လိုက်
        System.out.println(num5);

        float num6= 11.0987654321f; //float (f)လိုက် 6 to 7
        double num7=999.1234560987654389d; //store 15 decimal digits

        System.out.println(num6);
        System.out.println(num7);

        boolean flag = 8<9; //default value is false
        boolean flag1 = 5>9 ;

        System.out.println(flag);
        System.out.println(flag1);

        char ch1='a';
        char ch2=66; //ASCII value decimal
        char ch3=0101; //ASCII vale hexa
        System.out.println(ch2);
        System.out.println(ch3);
    }
}

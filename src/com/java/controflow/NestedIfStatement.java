package com.java.controflow;

public class NestedIfStatement {
    public static void main(String[] args) {

        int a=10;
        if(a < 100){
            //if
//            int b=20;
//            if(b > 50){
//                System.out.println(b+"is greater than 50");
//            }
//            else if(b == 30){
//                System.out.println(b+"is equal to 30");
//            }
//            else {
//                System.out.println(b+"is less than 100");
//            }
            //switch
            int c=30;
            switch(c){
                case 10:
                    System.out.println(c+"is equal to 10");
                    break;
                case 20:
                    System.out.println(c+"is equal to 20");
                    break;
                case 30:
                    System.out.println(c+"is equal to 30");
            }

        }
        else {
            System.out.println(a +"is greater than 100");
        }
    }
}

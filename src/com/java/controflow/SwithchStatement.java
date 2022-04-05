package com.java.controflow;

public class SwithchStatement {
    public static void main(String[] args) {
        int a = 11;
        switch(a){
            case 2:
                System.out.println(a+"is equal to 2");
                break;
            case 4:
                System.out.println(a+"is equal to 4");
                break;
            case 6:
                System.out.println(a+"is equal to 6");
                break;
            case 8:
                System.out.println(a+"is equal to 8");
                break;
            case 10:
                System.out.println(a+"is equal to 10");
                break;
            default:
                System.out.println("something was wrong");
        }
    }
}

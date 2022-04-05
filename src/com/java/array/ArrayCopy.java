package com.java.array;

public class ArrayCopy {
    public static void main(String[] args) {

        int numbers[]={1,2,3,4,5,9,8,7};
//        System.out.println(numbers.getClass().getName());

        int other[]=new int[6];

        System.arraycopy(numbers,3,other,3,2);

        for (int i = 0; i < other.length; i++) {
            System.out.print(i);
        }
        int another[]=other.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.println(another[i]+"\t");
        }
    }
}

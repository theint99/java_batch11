package com.java.controflow;

public class IfStatement {
    public static void main(String[] args) {

        int numbers[]={9,8,7,6,5,4,3,2,1};
        int copy[]=new int[numbers.length];

        //before copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            copy[i]=numbers[i];
        }
        System.out.println();
        //after copy
        for (int i=0;i<copy.length;i++){
            System.out.print(copy[i]);
        }

        //search largest number
        int largestnum=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largestnum){
                largestnum=numbers[i];
            }
        }
        System.out.println();
        System.out.println(largestnum);

        //acending order
        int temp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
        System.out.println(numbers[numbers.length-2]);//second largest number

    }
}

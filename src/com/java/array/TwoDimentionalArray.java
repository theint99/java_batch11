package com.java.array;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int numbers[][]= new int[3][4];// two dimensional array size သတ်မှတ်

        int no[][] =new int[3][];
        no[0]=new int[5];// array size သတ်မှတ်
        no[1]=new int[4];




        int dnumbers[][]={
                //col 0
                {1,2,3,4,5},  //index 0,row 0
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        }; //[rows][column]
        System.out.println(dnumbers[3][4]);

        dnumbers[2][0]=111;
        System.out.println(dnumbers.length);

        for(int row=0; row<dnumbers.length;row++){
            for(int col=0; col<dnumbers[row].length;col++){
                System.out.print(dnumbers[row][col]+"\t");
            }
            System.out.println();
        }

        for(int[] num:dnumbers){
            for(int n:num){
                System.out.println(n);
            }//foreach
        }

    }
}

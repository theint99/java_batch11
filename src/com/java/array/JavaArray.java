package com.java.array;

public class JavaArray {
    public static void main(String[] args) {

        int numbers[]=new int[6];// array initialize
        String names[]={"ag ag","mg mg","aye aye"};//index 0,1,2   counting 1,2,3
        System.out.println(names[2]);

        int nums[]=new int[]{447,778,199,124};
        System.out.println(nums[2]);

        names[2]="kyaw kyaw";
        System.out.println(names[2]);

        System.out.println(names.length);// to know array's lenght(sizes)

        System.out.println(names);

        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+"\t");
        }

        for (String name : names) {
            System.out.println("User name"+name+"\t");
        }//foreach for(datatype variablename: arrayname){}

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+"\t");
        }//for reverse
    }
}
/**
 * None Primitive data types
 * String, Array
 *Array => save same data type collection
 *
 * Array
 * one dimensional array
 * two dimensional array
 * jagged array
 */

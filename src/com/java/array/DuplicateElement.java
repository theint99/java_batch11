package com.java.array;

public class DuplicateElement {
    public static void main(String[] args) {
        int numbers[]={1,2,3,3,4,5,6,5,4,3,2,1};

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++ ){
                if(numbers[i]==numbers[j]){
                    System.out.println(numbers[i]+"="+numbers[j]);
                }
            }
        }
    }
}

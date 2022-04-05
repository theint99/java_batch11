package com.java.batch11;

public class Operators {
    public static void main(String[] args) {
        int num1 = 45;
        int num2= 54;
        int num3 = num1+num2;
        System.out.println(num3);

        int num4=30%4; //အကြွင်းယူ
        System.out.println(num4);

        boolean value = num1>num2;
        System.out.println(value);

        int a =4;
        int b = 4;
        boolean c = a <= b;
        System.out.println(c);

        int num5 = 8;
        int num6= 9;
        int num7 = 5;
        boolean num8 = num5>num6 || num7<num6; //true
        System.out.println("The answer is"+ num8);

        boolean text1 = 3>4 && 4==4; //false
        boolean text2 = 4>3 & 9<4;
        System.out.println(text1);
        System.out.println(text2);

        boolean text3= true ^ true;
        System.out.println(text3);
        boolean text4 = true | true;
        System.out.println(text4);

        //left shift
        int number = 10 << 2; //right ဘက်မှာ သုညနှစ်လုံးပေါင်း 1010,00 /2^5+2^3 = 40 or (10 * 2^2)

        System.out.println(number);
        //right shift
        int number1 = 10 >> 2; //left ဘက်မှာ သုညနှစ်လုံးပေါင်း 00 1010 and right ဘက်မှာ သုညနှစ်လုံးဖြုတ် 0010 = 2 or (10/2^2)စားလဒ်ကိုယူ
        System.out.println(number1);
        //20<<2
        //15<<4
        int homework1 = 20<<2;//1010000, 2^6+2^4 = 80
        System.out.println("The answer is"+homework1);
        int homework2 = 15<<4; //11110000, 2^7+2^6+2^5+2^4 =240
        System.out.println("The answer is"+homework2);

        //20>>2
        //20>>3
        int homework3 = 20>>2;//00101, 2^2+2^0 =5
        System.out.println("The answer is"+homework3);
        int homework4 = 20>>3;//00010, 2^1 =2
        System.out.println("The answer is"+homework4);

        //Unary Operator
//        int number2 = 44;
//        number2++;
//        System.out.println(number2);
//        --number2;
//        System.out.println(number2);
//
//        int number3 = 56;
//        int number4 = 10;
//        int number5 = (number3>number4)?number3:number4;
//        System.out.println(number5);
    }
}
/**
 * Binary Operator
 * Unary Operator a++,a--(postfix), ++a, --a(prefix)
 * Ternary Operator (condition)?true:false;
 */
/**
 * Binary operators
 * arithmetic operators + - * / %(modulus)
 * Assignment operators =, += , -=, *=, /=, %=, >>=, <<=, >>>=, ;
 * (Precedence)အမြှောက်အစားပေါင်းနှုတ် * / + -
 * relational operators or comparison operator > < <= >=
 * instance of operators == , !=
 * logical operators || or && and
 *  bitwise AND  &
 *  bitwise exclusive OR ^
 *  bitwise inclusive OR |
 *  Shift operator
 *  << >> <<< left shift right shift left shift 0 fill
 */

/** Binary
 * 0=false, 1=true
 *  AND
 *  0 & 0 =0
 *  0 & 1 =0
 *  1 & 0 =0
 *  1 & 1 =1
 *  Exclusive OR တူရင် 0 မတူရင် 1
 *  0 ^ 0 =0
 *  0 ^ 1 =1
 *  1 ^ 0 =1
 *  1 ^ 1 =0
 *  Inclusive OR
 *  0 | 0 = 0
 *  0 | 1 = 1
 *  1 | 0 = 1
 *  1 | 1 = 1
 *
 *
 *
 */
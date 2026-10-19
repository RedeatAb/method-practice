package com.pluralsight;



public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("is 5 an even number" + isEven(5));
        System.out.println("is -2 a negative number" + isPostive(-2));
    }

    public static boolean isEven(int number){
        return number %2 ==0;

    }

    public static boolean isPostive(int number){
        return number >0;

    }
    //
}

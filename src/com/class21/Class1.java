package com.class21;

public class Class1 {

    public void printSmallerDigit(int x,int y){
        if(x<y){
            System.out.println("X is smaller one");

        }else if(y<x){
            System.out.println("Y is smaller one");
        }else{
            System.out.println("values are equal");
        }
    }

    public static void main(String[] args) {
        Class1 obj=new Class1();
        obj.printSmallerDigit(3,5);
        obj.printSmallerDigit(5,8);

    }
}

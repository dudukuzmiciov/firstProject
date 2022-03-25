package com.class21;

public class Class2 {

    String generateUsername(String firstName, String lastName){//this is not a static method
        return firstName+"123"+lastName+".com";                //so we need to create a method

    }
    static void moreedDemand(){
        System.out.println("This is Moreeds method");
    }

    public static void main(String[] args) {
        Class2 obj=new Class2();
        System.out.println(obj.generateUsername("dana","grinco"));
    }
}

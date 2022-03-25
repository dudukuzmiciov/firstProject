package com.class21.SuperKeyword;

public class StringClass2 {
    public static void main(String[] args) {
        String student="Teyfur";
        System.out.println(student.startsWith("T"));
        System.out.println(student.toLowerCase().startsWith("T"));//METHOD CHAINING HERE TWO METHODS
        System.out.println(student.endsWith("r"));
        System.out.println(student.contains("y"));

        String name="Habib";
        char output=name.charAt(2);
        System.out.println(output);

    }
}

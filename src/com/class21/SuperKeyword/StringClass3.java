package com.class21.SuperKeyword;

public class StringClass3 {
    public static void main(String[] args) {
        String batch="Batch 12";
        String course="sdet";

        String company="          Syntax    Tech";
        System.out.println(company.trim());

        String  name="nasir gopi krishan kashtabai ramakrishnan";
        System.out.println(name.replaceAll(" ",""));

        if("Batch 12".equals(batch)&&"SDET".equals(course)) {
            System.out.println("you will get the link to my lecture");

        }else{
            System.out.println("Watch my youtube chanel");
        }

        if("batch 12".equalsIgnoreCase(batch)&&"sdet".equalsIgnoreCase(course)){
            System.out.println("Now all types of inputs are accepted");
        }


    }
}

package Class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Double> numberList=new ArrayList<>();
        Double double1=new Double(10.5);
        double number=double1.doubleValue(); //unboxing. this is how we convert a wrapper double class to primitive double variable
        Double number2=new Double(number);//boxing
        Double number3=10.5;//autoboxing. this is same as line 8 but shorter

        Double number4=number3; //autoboxing
        number3=number4; //autoUnboxing


        String name=new String("hakan");
        String name3=name;
    }
}

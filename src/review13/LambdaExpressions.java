package review13;

import java.util.ArrayList;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("John");
        names.add("Smith");
        names.add("Jones");
        names.add("Snow");
       long m = names.stream().filter(x->x.contains("M")).count(); //.count-count those elements after filtering
        System.out.println(m);

        //Iterator<String> iterator=names.iterator();
        //   while (iterator.hasNext()){
        //     if (iterator.next().length()>5){
        //      iterator.remove();
    }
}

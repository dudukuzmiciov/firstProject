package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1tester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Geico","Lexus"));
        insurances.add(new Pet("CamelInsurance","Horse"));
        insurances.add(new Health("Fidelis"));

        for(Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }

        //Same method using iterator:
        Iterator<Insurance> iterator = insurances.iterator();
        while(iterator.hasNext()){
            Insurance i=iterator.next();
            i.getQuote();
           i.cancelInsurance();
        }

    }
}

package groupProject;

public class Task3 {
    /*Create a Class Car that would have the following fields:   carPrice   and   color   and   method
    calculateSalePrice() which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class   has   field   as   weight   and   has   its   own
    implementation   of   calculateSalePrice()   method   in which   returned   price   calculated   as   following:if
    weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is   own   implementation   of   calculateSalePrice():   if
    length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount*/

    class Car{
        double carPrice;
        String color;
        double calculateSalePrice(){
            return carPrice;
        }
        Car(double carPrice, String color){
            this.carPrice=carPrice;
            this.color=color;}}

    class Sedan extends Car{
        double sedanLength;

        Sedan(double carPrice, String color) {
            super(carPrice, color);
            this.sedanLength=sedanLength;
        }
        double calculateSalePrice() {
            if (sedanLength>20){ System.out.println((carPrice*5)/100);}
            else { System.out.println((carPrice*10)/100);}
            return carPrice;
        }}

    class Truck extends Car{
        double truckWeight;
        Truck(double carPrice, String color) {
            super(carPrice, color);
            this.truckWeight=truckWeight;
        }
        double calculateSalePrice() {
            if(truckWeight>2000){System.out.println((carPrice*10)/100);}
            else {System.out.println((carPrice*20)/100);}
            return carPrice;
        }

    }
}



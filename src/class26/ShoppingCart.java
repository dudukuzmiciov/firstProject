package class26;

public class ShoppingCart {
   private  double originalPrice=100;
    private double discount=.15;

    void setDiscount(double discount){
        if(discount>0 && discount<=.15){
            this.discount=discount;
        }else{
            System.out.println("cant have such a high discount");
        }
    }
    //WITHOUT A GETTER METHOD NOBODY COULD READ THE VALUE WHEN RUNNING THE TESTER CLASS

    public  double getDiscount(){
        return discount;
    }

    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
    }
}

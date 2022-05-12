package class26;

public class ShoppingCartEncapsulation {
   private  double originalPrice=100;
    private double discount=.15;

    void setDiscount(double discount){ //so here you allow someone else to make changes but you mention in this case for
        if(discount>0 && discount<=.15){  //example they can only assign discount less than 15%
            this.discount=discount;
        }else{
            System.out.println("cant have such a high discount");
        }
    }
    //WITHOUT A GETTER METHOD NOBODY COULD READ THE VALUE WHEN RUNNING THE TESTER CLASS

    public  double getDiscount(){
        return discount;
    } //here you allow others to read the value of the variable u set in
                                                     //ShopingCartEncapsulation class. otherwise they cant check as is private
    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
    }
}

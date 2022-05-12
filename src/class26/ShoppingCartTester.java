package class26;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCartEncapsulation sc=new ShoppingCartEncapsulation();
       // sc.originalPrice=100; cant  use as the  fields became private
        //sc.discount=.20; //i can introduce this line and change the discount amount
        //because the fields are not protected in the parent class (not private)
       // sc.setDiscount(.20);

        System.out.println(sc.getDiscount());
        sc.calculatePrice();

    }
}

package reviw11OverridingAbstraction;

public abstract class CardAbstractDemo {
    //abstract String name;
    //if a class is declared final no other class can inherit from that class
    //private abstract void showInterest(); private and abstract not allowed
    //static abstract void showInterest(); static and abstract not allowed
    //abstract final void showInterest(); final and abstract not allowed
    abstract void showInterest();
    //abstract Card(){ don't participate in inheritance
}
class Visa extends CardAbstractDemo{

    @Override
    void showInterest() {
        //super.showInterest(); since no body inside the parent class we can't call it!
        System.out.println("23%");
    }
}

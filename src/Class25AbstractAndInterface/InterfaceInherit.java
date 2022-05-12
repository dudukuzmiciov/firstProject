package Class25AbstractAndInterface;

interface HealthAbe{
    void healthy();
}
public interface InterfaceInherit extends HealthAbe {
    void burnCalories();
}
interface Milk extends HealthAbe{
    void giveEnergy();
}
interface Banana extends HealthAbe{
    void giveEnergy();
}
class Demo implements Banana{

    @Override
    public void healthy() {
        System.out.println("Banana is healthy");
    }

    @Override
    public void giveEnergy() {
        System.out.println("it gives energy");
    }
}

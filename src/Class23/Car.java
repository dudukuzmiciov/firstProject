package Class23;

public class Car {
    //create three other classes using this car class

    void start() {
        System.out.println("Use key to start me");

    }

    void stop() {
        System.out.println("Use breaks to stop me");
    }

    void park() {
        System.out.println("Park me manually");
    }
}

class BMW extends Car {
    void start() {
        System.out.println("start me with button");
    }

    void stop() {
        System.out.println("Can use breaks or i can outoBreak");
    }

    void park() {
        System.out.println("use parking sensors to park");
    }
}

    class Tesla extends Car {
        void start() {
            System.out.println("Start me with app or remote");
        }

        void stop() {
            System.out.println("can use breaks or i can autoBreak");
        }

        void park() {
            System.out.println("use parking sensors to park me");

        }
    }

        class Suzuki extends Car {
            void start() {
                System.out.println("Push me to start");
            }

            void stop() {
                System.out.println("i lost my breaks and tires on the way");
            }

        }

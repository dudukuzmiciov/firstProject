package Class25AbstractAndInterface;

    public interface Human {
        //public static final redundant because by default all variables are
        //public static final-->
        //public static final int  legs=2;
        int legs = 2;
        //public abstract void walk(); - redundant
        void walk();
        static void printLegs()
        {
            System.out.println(legs);
        }
        public default void noNeedRoWorry()
        {
            System.out.println("default method support functional programming");
        }
    }
    interface LivingBeing {
        static void printLegs() {
            System.out.println("Not  sure");
        }
    }
    class Dana implements Human, LivingBeing {
        @Override
        public void walk() {
            System.out.println("I can walk");
        }
    }


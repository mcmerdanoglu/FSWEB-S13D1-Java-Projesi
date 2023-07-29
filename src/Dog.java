public class Dog {

    public static boolean shouldWakeUp(boolean isBarking, int dayTime) {
        if (dayTime < 0 || dayTime> 23) {return false;}
        else if (isBarking && (dayTime<8 || dayTime>=20)) {return true;}
        else {return false;}
    }
    //Bu şekilde de print edilebilir
    /*public static void main(String[] args) {
        System.out.println(Dog.shouldWakeUp(true, 1));
        System.out.println(Dog.shouldWakeUp(false, 2));
        System.out.println(Dog.shouldWakeUp(true, 8));
        System.out.println(Dog.shouldWakeUp(true, -1));

    }*/
}

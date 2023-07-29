public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Dog");
        System.out.println(Dog.shouldWakeUp(true, 1));
        System.out.println(Dog.shouldWakeUp(false, 2));
        System.out.println(Dog.shouldWakeUp(true, 8));
        System.out.println(Dog.shouldWakeUp(true, -1));

        System.out.println("Teen");
        System.out.println(Teen.hasTeen(9, 99, 19));
        System.out.println(Teen.hasTeen(23, 15, 42));
        System.out.println(Teen.hasTeen(22, 23, 34));
        System.out.println(Teen.hasTeen(14, 16, 20));
        System.out.println(Teen.hasTeen(12, 21, 8));
    }


}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Dog.shouldWakeUp(true, 1));
        System.out.println(Dog.shouldWakeUp(false, 2));
        System.out.println(Dog.shouldWakeUp(true, 8));
        System.out.println(Dog.shouldWakeUp(true, -1));
    }


}
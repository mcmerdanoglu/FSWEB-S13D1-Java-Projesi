import java.util.Arrays;

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

        System.out.println("Cat");
        System.out.println(Cat.isCatPlaying(true, 10));
        System.out.println(Cat.isCatPlaying(false, 36));
        System.out.println(Cat.isCatPlaying(false, 35));

        System.out.println("Rectangle");
        System.out.println(Rectangle.area(5.0, 4.0));
        System.out.println(Rectangle.area(-1.0, 4.0));

        System.out.println("Circle");
        System.out.println(Circle.area(5.0));
        System.out.println(Circle.area(-1.0));
    }


}
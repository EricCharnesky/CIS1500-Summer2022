public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car firstCar = new Car("First Car", 45);
        Car secondCar = new Car("Second Car", 47);

        System.out.println(firstCar.race(secondCar));
    }
}
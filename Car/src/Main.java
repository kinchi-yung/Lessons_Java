public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model S", 2021, 4);
        car.start();

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of doors: " + car.getNumberOfDoors());

        Car car1 = new Car("Imagination","Dream",1999,2);
        car1.start();

        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Number of doors: " + car1.getNumberOfDoors());
    }
}
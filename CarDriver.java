public class CarDriver {
   public static void main(String[] args) {
       Car myCar = new Car("Prius", 2015);
       Car yourCar = new Car("Prius", 2017);
       System.out.println(myCar);
       System.out.println(yourCar);
       System.out.println(myCar.equals(yourCar));
   }
}